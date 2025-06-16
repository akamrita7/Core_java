package designPattern.behavioral.command;

import java.util.HashMap;

public class Menu {

    HashMap<String,Command> command = new HashMap();

    public void setCommand(String name, Command c) {
        command.put(name,c);
    }

    public void exceuteCommand(String instruction){
        this.command.get(instruction).execute();
    }
}
