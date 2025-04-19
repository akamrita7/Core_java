package designPattern.behavioral.command;

public class CreateCommand implements Command{
    @Override
    public void excute() {
        System.out.println("Create command executed");
    }
}
