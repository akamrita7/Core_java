package designPattern.Structure.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemCompont {
    private String name;
    private List<FileSystemCompont> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }
    public void addComponent(FileSystemCompont com){
        components.add(com);
    }

    @Override
    public void showDeatils() {
        System.out.println(name);
        for (FileSystemCompont fil : components){
            fil.showDeatils();
        }
    }

    public static void main(String[] args) {
        FileSystemCompont f1 = new Files("f1");
        FileSystemCompont f2 = new Files("f2");
        FileSystemCompont f3 = new Files("f3");
        FileSystemCompont f4 = new Files("f4");
        FileSystemCompont f5 = new Files("f5");
        Directory d1 = new Directory("Dir");
        d1.addComponent(f1);
        d1.addComponent(f2);
        d1.addComponent(f3);
        d1.addComponent(f3);
        d1.addComponent(f5);
        d1.showDeatils();
    }
}
