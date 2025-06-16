package designPattern.Structure.Composite;

public class Files implements FileSystemCompont {
    private String name ;

    public Files(String name) {
        this.name = name;
    }

    @Override
    public void showDeatils() {
        System.out.println(name);
    }
}
