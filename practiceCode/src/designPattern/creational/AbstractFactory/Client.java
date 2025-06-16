package designPattern.creational.AbstractFactory;


public class Client {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();
        modernChair.sitOn();
        modernTable.use();

        FurnitureFactory  victorian = new VictorianFurnitureFactory();
        Chair victorianChair = victorian.createChair();
        Table victoriantable = victorian.createTable();
        victoriantable.use();
        victorianChair.sitOn();
    }
}
