package designPattern.behavioral.command;

public class DeleteCommand implements Command{
    @Override
    public void execute() {
        System.out.println("delete Command execute");
    }
}
