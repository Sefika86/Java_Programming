package day33_abstraction.shapeTask_homework;

public abstract class Shape {  //parent class  //abstract class

    private String name;



    public Shape(String name) {
        setName(name);
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }




//abstract method without a body, for providing the method that will be needed by subclasses
    public abstract double area();


    public abstract double perimeter();


    public abstract void draw();


    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                '}';
    }
}
