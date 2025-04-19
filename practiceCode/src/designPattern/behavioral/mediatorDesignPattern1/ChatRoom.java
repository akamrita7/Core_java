package designPattern.behavioral.mediatorDesignPattern1;


import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements IChatRoom{
    Map<String, User> userMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String userId) {
        User u = userMap.get(userId);
        u.recieve(msg);
    }


    @Override
    public void addUser(User user) {
        userMap.put(user.getId(),user);

    }

}
