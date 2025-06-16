package designPattern.Structure.adapter;

public class Client {
    public static void main(String[] args) {
        Pen pen = new PenAdapter();
        Assignment assignment = new Assignment();
        assignment.setPen(pen);
        assignment.write("I am writing assignment");
    }
}
