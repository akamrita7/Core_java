import java.util.concurrent.*;

public class RateLimiterManager {
    private static final int MAX_TOKENS = 5; // Max tokens per client
    private static final int REFILL_RATE = 2; // Tokens per second
    private static final int CLIENT_COUNT = 100; // Simulating 100 clients

    private static class TokenBucket {
        private final long maxTokens;
        private final long refillRate;
        private long availableTokens;
        private long lastRefillTime;

        public TokenBucket(long maxTokens, long refillRate) {
            this.maxTokens = maxTokens;
            this.refillRate = refillRate;
            this.availableTokens = maxTokens;
            this.lastRefillTime = System.nanoTime();
        }

        // Try to consume a token
        public synchronized boolean allowRequest() {
            refillTokens();
            if (availableTokens > 0) {
                availableTokens--;
                return true;
            }
            return false;
        }

        // Refill tokens based on elapsed time
        private void refillTokens() {
            long now = System.nanoTime();
            long timeElapsed = now - lastRefillTime;
            long tokensToAdd = (timeElapsed * refillRate) / TimeUnit.SECONDS.toNanos(1);

            if (tokensToAdd > 0) {
                availableTokens = Math.min(maxTokens, availableTokens + tokensToAdd);
                lastRefillTime = now;
            }
        }
    }

    // Map for storing rate limiters per client (IP/User ID)
    private static final ConcurrentHashMap<String, TokenBucket> clientRateLimiters = new ConcurrentHashMap<>();

    // Get rate limiter for a specific client
    public static TokenBucket getRateLimiter(String clientId) {
        return clientRateLimiters.computeIfAbsent(clientId, id -> new TokenBucket(MAX_TOKENS, REFILL_RATE));
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10); // Thread pool to simulate concurrent clients

        for (int i = 0; i < CLIENT_COUNT; i++) {
            final String clientId = "Client-" + (i % 10); // Simulating 10 unique clients making requests
            executor.submit(() -> {
                for (int j = 0; j < 10; j++) { // Each client sends 10 requests
                    boolean allowed = getRateLimiter(clientId).allowRequest();
                    System.out.println(clientId + " request " + (j + 1) + ": " + (allowed ? "ALLOWED" : "BLOCKED"));
                    try {
                        Thread.sleep(200); // Simulate delay between requests
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
        }

        executor.shutdown();
    }
}

