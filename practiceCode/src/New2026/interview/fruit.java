package New2026.interview;

public class fruit {
    public fruit() {
        System.out.println("fruit: " +this.getClass().getSimpleName());
        System.out.println(this.hashCode());
    }
}
 class Apple extends fruit{
    public Apple() {
        System.out.println("Apple : " + this.getClass().getSimpleName());
        System.out.println(this.hashCode());
    }
}
 class KashmiriApple extends Apple {
    public KashmiriApple() {
        System.out.println("KashmiriApple: " + this.getClass().getSimpleName());
        System.out.println(this.hashCode());
    }
    public static void main(String[] args){
        //KashmiriApple f = (KashmiriApple) new fruit(); //class ClassCastException
        fruit f = new KashmiriApple();
    }
}
