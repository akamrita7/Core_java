package designPattern.Structure.apadter2;

public class IPhone6s implements IPhone{

    private  Iphone4sTo6sAdapter iphone4sTo6sAdapter;

    public IPhone6s(Iphone4sTo6sAdapter iphone4sTo6sAdapter) {
        this.iphone4sTo6sAdapter = iphone4sTo6sAdapter;
    }

    @Override
    public void OnCharge() {
        iphone4sTo6sAdapter.charge();
    }
}
