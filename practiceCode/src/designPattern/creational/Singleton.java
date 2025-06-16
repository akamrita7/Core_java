package designPattern.creational;

public class Singleton implements Cloneable{
    //private static variable
    private static volatile Singleton instance;
    //private constuctor
    private Singleton() {
    }
    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class)
            {
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public Singleton clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
