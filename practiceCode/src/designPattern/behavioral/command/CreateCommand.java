package designPattern.behavioral.command;

public class CreateCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Create command executed");
    }
}
