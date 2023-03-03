package day16_NestedLoop;

import java.util.Scanner;

public class All_Loop_Practices {

    public static void main(String[] args) {

        //HOW TO CONVERT A FOR LOOP TO A WHILE LOOP

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello for loop");  //hello will execute 5 times
        }

//i is a local variable for this for loop, so it can be used inside the for loop
// but can not be used outside for loop
// but i can be used in another loop, does not give error
        System.out.println(); //aralarina bi bosluk vermek icin

        for (int i = 0; i < 5; i++) {
            System.out.println("hello for loop" + i);
        }


System.out.println("--------------------------------------------------------");

//in while loop you are not allowed to give the initialization  in the brackets
// but you can declare a variable before the while loop

        int i = 0;
        while (i < 5) {
            System.out.println("Hello While" + i);
            i++;
        }
//YOU SEE? While loop can do everything that For loop can do
//BUT; its best to use while when your repeating time is NOT KNOWN

 System.out.println("--------------------------------------------------------");

   // in do while, statement is executed once before condition checked
        do{
            System.out.println("Hello do while" + i);
            i++;
        }while (i < 5);


System.out.println("--------------------------------------------------------");
System.out.println("--------------------------------------------------------");
System.out.println("--------------------------------------------------------");
// while dan once if kullanarak repeat yapamiyorduk
//kac defa epear yapmak istiyorsak tek tek yaziyorduk
//ama simdi while loop var, repeat time i bilmiyorsan while kullan
//one more example:

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();  // bunu defalarca yazmak mi istersin yoksa
                                      // bi while loop yap o senin yerine repeat yapsin ?

        while(score>100 || score<0){ //condition = false
            System.out.println("Invalid score, please re-enter your score");
            score = input.nextInt();
        } //bu statement sen 100 den buyuk, sifirdan kucuk sayi girdikce execute olacak
        //yok normal 0-100 arasi bir sayi verirsen : if statement

        if(score >= 60){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }



    }
}
