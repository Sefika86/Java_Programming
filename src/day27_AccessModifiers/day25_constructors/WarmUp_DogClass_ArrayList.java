package day27_AccessModifiers.day25_constructors;

import day17_CustomClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp_DogClass_ArrayList {
    public static void main(String[] args) {


        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

//1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList
//question says do not use loop ,but we will do both ways, loop & removeIf()

/*

        ArrayList<Dog> smallDogs = new ArrayList<>();
        for (Dog each : dogs) {
            if(each.size.equalsIgnoreCase("small")){
                smallDogs.add(each);
            }
        }
        System.out.println(smallDogs);

 */

//with removeIF
        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));  //once butun doglari ekliyor

        smallDogs.removeIf(p-> ! p.size.equalsIgnoreCase("Small"));  //sonra small olmayani cikariyor

        System.out.println(smallDogs);

        System.out.println("----------------------------------------------------------");


 //1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less
 // from the dogs array to youngDogs arrayList

/*

        ArrayList<Dog> youngDogs = new ArrayList<>();
        for (Dog each : youngDogs) {
            if(each.age <= 4) {
                youngDogs.add(each);
            }
        }
        System.out.println(youngDogs);

*/

//removeIf()

        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));

        youngDogs.removeIf(p-> p.age > 4);
        System.out.println(youngDogs);

        System.out.println("----------------------------------------------------------");

//1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F'
// the dogs array to femaleDogs arrayList

       ArrayList<Dog> femaleDogs =new ArrayList<>(Arrays.asList(dogs));
       femaleDogs.removeIf(p-> p.gender == 'M');

        System.out.println(femaleDogs);

        System.out.println("----------------------------------------------------------------------------");

//Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList


        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p-> p.gender == 'F');

        System.out.println(maleDogs);


        System.out.println("-----------------------------------------------------------------");


        //1.5 Create an smallDogs2 arrayList and then convert it back to an Array

        ArrayList<Dog> smallDog2 = new ArrayList<>(Arrays.asList(dogs));
        smallDog2.removeIf(p-> p.size.equalsIgnoreCase("small"));

        //smallDog2.toArray(new Dog[0]);
        //or
        dogs = smallDog2.toArray(new Dog[smallDog2.size()]);
        System.out.println(Arrays.toString(dogs));

    }
}

/*
warmup tasks:
	1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

	            Note: DO NOT use any loops

	    1.5 Create an smallDogs2 arrayList and then convert it back to an Array

 */