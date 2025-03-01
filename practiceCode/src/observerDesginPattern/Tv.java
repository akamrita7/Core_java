package observerDesginPattern;

public class Tv implements Observers{
    private String weather;
    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    private void display() {
        System.out.println("Tv Display weather update = " + weather);
    }
}
