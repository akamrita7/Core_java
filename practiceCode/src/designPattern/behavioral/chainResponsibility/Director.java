package designPattern.behavioral.chainResponsibility;

public class Director extends RequestHandler{
    public Director() {
        super("Director");
    }

    @Override
    void setNext(RequestHandler next) {
        this.next = next;
    }
    @Override
    public void approve(int id) {
        if(id>=41 && id<=80)
        {
            System.out.println("Request Approved by Director");
        }
        else{
            super.approve(id);
        }
    }
}
