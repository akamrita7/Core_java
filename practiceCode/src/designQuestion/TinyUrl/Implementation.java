package designQuestion.TinyUrl;

public class Implementation {
    public static void main(String[] args) {

        TinyUrlService service = new TinyUrlService();

        String shortUrl1 = service.shortenUrl("https://google.com");
        String shortUrl2 = service.shortenUrl("https://openai.com");

        System.out.println("Short 1: " + shortUrl1);
        System.out.println("Short 2: " + shortUrl2);

        System.out.println("Original: " + service.getOriginalUrl(shortUrl1));
    }
}
