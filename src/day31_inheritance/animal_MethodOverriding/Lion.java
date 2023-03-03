package day31_inheritance.animal_MethodOverriding;

public class Lion extends Animal{


    //additional variable
    private boolean isAfricanLion;


    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
;
    }


    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }



    @Override
    public void eat() {
        System.out.println("Lion " + getName() + " is eating deer.");
    }



    public void roar(){
        System.out.println("Lion " + getName() + " is roaring.");
    }


    //when we have additional variables in a subclass, we must override toString method too. to be able to see those
    //unique variables on the console


    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", African Lion='" + isAfricanLion + "\'" +   //we copy&paste from parent class and add this line
                '}';
    }



    //OR

/*

    @Override
    public String toString() {
        return  super.toString().replace("}", "") +
                ", African lion='" + isAfricanLion + '\'' +
                '}';


 */





}





