package day31_inheritance.shape_methodOverriding;

public class Shape {
    private String name;

    public Shape(){    // we created a default constructor with no parameters because we want to set every child shapes name as the same name with class
       setName(getClass().getSimpleName());
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double area(){
        return 0;  //return 0 because we do not have a common formula to calculate all shapes area
    }

    public double perimeter(){
        return 0;   ////return 0 because we do not have a common formula to calculate all shapes perimeter
    }

    public void draw(){
        System.out.println("Drawing a "+getClass().getSimpleName()+": ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName().replace("{", "") +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +       //we added line 35-36 later we generate to string with shortcut
                ", perimeter='" + perimeter() + '\'';
    }

}
