package designPattern.behavioral.chainResponsibility;

public class Manager extends RequestHandler{
    public Manager() {
        super("Manager");
    }

    @Override
    void setNext(RequestHandler next) {
        this.next = next;
    }
    @Override
    public void approve(int id) {
        if(id>=1 && id<=20)
        {
            System.out.println("Request Approved by Manager");
        }
        else{
            super.approve(id);
        }
    }
}
