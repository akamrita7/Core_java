package designPattern.behavioral.chainResponsibility;

public abstract class RequestHandler {
    String name;
    RequestHandler next;
    public RequestHandler() {
    }
    public RequestHandler(String name) {
        this.name = name;
    }
    abstract void setNext(RequestHandler next);
    public void approve(int i){
        if(this.next != null){
            this.next.approve(i);
        }else {
            System.out.println("Request cant be approve");
        }
    }
}
