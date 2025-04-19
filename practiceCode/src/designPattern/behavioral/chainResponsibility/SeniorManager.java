package designPattern.behavioral.chainResponsibility;

public class SeniorManager extends RequestHandler{
    public SeniorManager() {
        super("SeniorManager");
    }

    @Override
    void setNext(RequestHandler next) {
        this.next = next;
    }
    @Override
    public void approve(int id) {
        if(id>=21 && id<=40)
        {
            System.out.println("Request Approved by SeniorManager");
        }
        else{
            super.approve(id);
        }
    }
}
