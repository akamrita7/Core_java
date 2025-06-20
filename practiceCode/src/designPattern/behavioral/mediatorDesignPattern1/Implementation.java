package designPattern.behavioral.mediatorDesignPattern1;

import java.util.LinkedList;

public class Implementation {
    public static void main(String[] args)
    {
        IChatRoom chatroom = new ChatRoom();

        User user1 = new ChatUser(chatroom,"1", "Alex");
        User user2 = new ChatUser(chatroom,"2", "Brian");
        User user3 = new ChatUser(chatroom,"3", "Charles");
        User user4 = new ChatUser(chatroom,"4", "David");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        user1.sendMessage("Hello brian", "2");
        user2.sendMessage("Hey buddy", "1");
        user3.sendMessage("Hey buddy", "4");
        user4.sendMessage("Hey buddy", "3");
    }
}
