package designQuestion.TinyUrl;

import java.util.concurrent.atomic.AtomicLong;

public class TinyUrlService {
    private final UrlRepository repository = new UrlRepository();
    private final Base62Encoder encoder = new Base62Encoder();
    private final AtomicLong counter = new AtomicLong(1);

    public String shortenUrl(String longUrl) {

        // If already exists
        String existing = repository.getShortCode(longUrl);
        if (existing != null) {
            return existing;
        }

        long id = counter.getAndIncrement();
        String shortCode = encoder.encode(id);

        repository.save(shortCode, longUrl);

        return shortCode;
    }

    public String getOriginalUrl(String shortCode) {
        return repository.getLongUrl(shortCode);
    }
}
