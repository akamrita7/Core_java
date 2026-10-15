package designPattern.creational;

import java.io.Serializable;

public class Singleton implements Cloneable , Serializable {
    //private static variable
    //volatile read from memory and it will not catch for a thread
    private static volatile Singleton instance;
    //private constuctor
    private Singleton() {
        if(instance==null){
            throw new RuntimeException("Reflection not supported");
        }
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
    protected Object readResolve() {
        return instance;
    }


    public Singleton clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
