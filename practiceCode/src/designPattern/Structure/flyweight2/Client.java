package designPattern.Structure.flyweight2;
//https://www.geeksforgeeks.org/system-design/flyweight-design-pattern/
public class Client {
    public static void main(String[] args) {
        IconFactory iconFactory = new IconFactory();

        // Draw file icons at different positions
        Icon fileIcon1 = iconFactory.getIcon("file");
        fileIcon1.draw(100, 100);

        Icon fileIcon2 = iconFactory.getIcon("file");
        fileIcon2.draw(150, 150);

        // Draw folder icons at different positions
        Icon folderIcon1 = iconFactory.getIcon("folder");
        folderIcon1.draw(200, 200);

        Icon folderIcon2 = iconFactory.getIcon("folder");
        folderIcon2.draw(250, 250);
    }
}

/*
The Flyweight Design Pattern is a way to save memory in applications that create a large number of similar objects. Instead of creating a new object for each instance, the Flyweight pattern reuses existing ones wherever possible, sharing common parts between objects.

        Here’s how it works:

Shared vs. Unique Data: Objects are split into shared (intrinsic) data and unique (extrinsic) data. The shared data is stored in a central place and reused, while the unique data is kept separately.
Example: Imagine a text editor displaying thousands of characters. Using Flyweight, the program can store each unique character style (like font or color) only once and reuse it, rather than duplicating it for every character.
*/
