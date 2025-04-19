package designPattern.behavioral.mediatorDesignPattern1;

public class ChatUser extends User{

    public ChatUser(IChatRoom mediator, String id, String name) {
        super(mediator, id, name);
    }

    @Override
    public void sendMessage(String msg, String userId) {
        System.out.println(this.getName() + " :: Sending Message : " + msg);
        getMediator().sendMessage(msg,userId);
    }

    @Override
    public void recieve(String msg) {
        System.out.println(this.getName() + " :: Received Message : " + msg);
    }
}
