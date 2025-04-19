package designPattern.behavioral.command;

public class Client {
    public static void main(String[] args) {
        Menu menu =  new Menu();
        menu.setCommand("delete",new DeleteCommand());
        menu.setCommand("create", new CreateCommand());
        menu.exceuteCommand("create");
        menu.exceuteCommand("delete");
    }
}
