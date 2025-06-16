package designPattern.creational.prototype;

public class Implemtation {
    public static void main(String[] args) {
        // Create an original shape
        Shape originalShape = new Shape("Circle", "Red");
        System.out.println("Original Shape : " + originalShape);

        // Clone the original shape
        // The `clone()` method returns a `Prototype`, so we need to cast it to `Shape`.
        // This tells the compiler that the returned object should be treated as a `Shape`.
        Shape clonedShape = (Shape) originalShape.clone();
        System.out.println("Cloned Shape : " + clonedShape);

        // Modify the cloned shape
        clonedShape.setColor("Blue");
        System.out.println("Modified Cloned Shape : " + clonedShape);

        // Original shape remains unchanged
        System.out.println("Original Shape After Modification : " + originalShape);
    }
}
