package observerDesginPattern;

public class Phone implements Observers{
    private String weather;
    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    private void display() {
        System.out.println("Phone Display weather update = " + weather);
    }
}
