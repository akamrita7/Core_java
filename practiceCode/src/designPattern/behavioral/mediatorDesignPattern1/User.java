package designPattern.behavioral.mediatorDesignPattern1;

public abstract class User {

    private IChatRoom mediator;
    private String id ;
    private String name ;

    public User(IChatRoom mediator, String id, String name) {
        this.mediator = mediator;
        this.id = id;
        this.name = name;
    }
    public abstract void sendMessage(String msg , String userId);
    public abstract void recieve(String msg);

    public IChatRoom getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
