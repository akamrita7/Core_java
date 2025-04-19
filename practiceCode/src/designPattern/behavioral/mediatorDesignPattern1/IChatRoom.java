package designPattern.behavioral.mediatorDesignPattern1;


public interface IChatRoom {
    void sendMessage(String msg , String userId);
    void addUser(User user);
}
