package day17_CustomClass;

public class TestDogObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();  //this is our object(instance of Dog Class)
        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "Gray";
        System.out.println(dog1);  //Eger dog class ta toString method creat yapmazsak,bunu run yapinca soyle birsey cikiyor : day17_CustomClass.Dog@2f7a2457
        //buna hashcode denir, bunu engellemek icin DOg class ta String return type'li toString method creat yapmaliyiz

        System.out.println("------------------------------------------------------------");

        Dog dog2 = new Dog();  // my second object, bunu toString ile yaptik
        dog2.name = "Bella";
        dog2.breed = "Golden Retriever";
        dog2.gender = 'F';
        dog2.age = 2;
        dog2.size = "Small";
        dog2.color = "Orange";
        System.out.println(dog2);

        dog2.drink(); // //this drink method is an instance method, so the drink action only will be happen with dog2 object

        System.out.println("------------------------------------------------------------");


        Dog dog3 = new Dog();  //3rd object bunu da setInfo ile yaptik (en kisasi en kolayi)
        dog3.setInfo("Loki", "Chow chow", 'M', 3, "Medium", "black");
        System.out.println(dog3);

        dog3.eat(); //this eat method is an instance method, so the eat action only will be happen with dog3 object

        System.out.println("------------------------------------------------------------");


        Dog dog4 = new Dog();
        dog4.setInfo("Chuck", "Bulldog", 'M', 5,"Small", "White");
        System.out.println(dog4);





    }
}
