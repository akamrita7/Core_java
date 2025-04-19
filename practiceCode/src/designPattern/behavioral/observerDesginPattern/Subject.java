package designPattern.behavioral.observerDesginPattern;


public interface Subject {
    void addObserver(Observers observers);
    void removeObserver(Observers observers);
    void notifyObserver();
}
