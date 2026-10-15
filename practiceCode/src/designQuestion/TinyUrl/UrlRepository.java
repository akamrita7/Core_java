package designQuestion.TinyUrl;

import java.util.concurrent.ConcurrentHashMap;

public class UrlRepository {
    private final ConcurrentHashMap<String, String> shortToLong = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, String> longToShort = new ConcurrentHashMap<>();

    public void save(String shortCode, String longUrl) {
        shortToLong.put(shortCode, longUrl);
        longToShort.put(longUrl, shortCode);
    }

    public String getLongUrl(String shortCode) {
        return shortToLong.get(shortCode);
    }

    public String getShortCode(String longUrl) {
        return longToShort.get(longUrl);
    }
}
