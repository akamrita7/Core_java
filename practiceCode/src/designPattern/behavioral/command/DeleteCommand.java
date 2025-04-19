package designPattern.behavioral.command;

public class DeleteCommand implements Command{
    @Override
    public void excute() {
        System.out.println("delete Command execute");
    }
}
