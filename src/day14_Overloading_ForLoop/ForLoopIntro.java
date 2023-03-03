package day14_Overloading_ForLoop;

public class ForLoopIntro {
    public static void main(String[] args) {

        System.out.println("Hello World");  //for example I wanna repeat this statement hundreds times, but it executes only once

        for (int i = 1; i < 10; i++) {  //does not matter if pre/post increment, sefika will be executed 9 times
            System.out.println("SEFIKA");
        }


        for (int i = 1; i <= 10; i++) {  // for ex here akin will be executed 10 times
            System.out.println("akin");
        }

        for (int i = 0; i < 11; i++) {   // SDET will be executed 0 1 2 3 4 5 6 7 8 9 10 ===> 11 times
            System.out.println("SDET");
        }

        for (int i = 1; i <= 10; i--){
            System.out.println("JAVA");
        }

        //i-- surekli i degerini azaltir yani i surekli olarak 10 dan kucuk olur
        // ve statement hep true olur bu yuzden sonsuz sayida java olur ki bunu tercih etmeyiz




    }
}
