package designPattern.creational.Builder;

public class CarBuilder {
    private  String name;
    private  String model;
    private  int year;
    private  String color;
    private  String engineType;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getEngineType() {
        return engineType;
    }

    private CarBuilder(Builder build) {
        this.name = build.name;
        this.model = build.model;
        this.year = build.year;
        this.color = build.color;
        this.engineType = build.engineType;
    }
    //static class
    public static class Builder{
        private  String name;
        private  String model;
        private  int year;
        private  String color;
        private  String engineType;

        public Builder(String name, String model) {
            this.name = name;
            this.model = model;
        }

        public Builder year(int year){
            this.year = year;
            return this;
        }
        public Builder color(String color){
            this.color = color;
            return this;
        }
        public Builder engineType(String engineType){
            this.engineType = engineType;
            return this;
        }

        public CarBuilder build(){
            return new CarBuilder(this);
        }
    }
}
