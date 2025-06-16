package designPattern.Structure.adapter;

public class Assignment {
    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void write(String str){
        pen.write( str);
    }
}
