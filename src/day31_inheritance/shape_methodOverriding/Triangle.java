package day31_inheritance.shape_methodOverriding;

public class Triangle extends Shape {


    private double height, base, side1, side2;

    public Triangle(double height, double base, double side1, double side2) {
        setHeight(height);
        setBase(base);
        setSide1(side1);
        setSide2(side2);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }


    @Override
    public double area() {
        return height * base / 2;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + base;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", height='" + height + '\'' +
                ", base='" + base + '\'' +
                ", side1='" + side1 + '\'' +
                ", side2='" + side2 + '\'' +
                '}';
    }

    @Override
    public void draw() {
        super.draw();


        int height  = 7;

        int i, j, k;
        for (i = 1; i < height; i++) {
            for (j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                if(k==1 || k==i){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        String lastLine = "";
        for (int l = 0; l < 7 ; l++) {
            lastLine += " *";
        }

        System.out.println(lastLine);





    }
}