package day14_Overloading_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        for (int i = 10; i >= 5; i--) {          // 6 tane cydeo olusacak, sirayla 10, 9,  8,  7,  6,  5,
            System.out.println("CYDEO" + i);  //boyle +  i yazarsak consolda net gorunur
        }


        System.out.println("--------------------------------------------");

        //write a program that sum of all the numbers between 1- 100

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;  // sum = sum + i
        }

        System.out.println(sum);  // this statement should be outside of loop {}
                                    // otherwise it repeats the math for every number between 1-100

        System.out.println("------------------------------------------------------------------------------");

        // print all alphabet letters A~Z

        for (char i = 'A'; i<= 'Z'; i++){  //char is character but it also has a number in ascii table
            System.out.print(i + " ");  // we used print instead of println and add a space between the letters
        }

        System.out.println();  // this empty print statement helps to start from a new line for the next print statements

        System.out.println("------------------------------------------------------------------------------");

        //print all alphabet letters in backwards

        for (char i ='Z'; i >= 'A'; i--){   // this time we used >= and i-- because backwards
            System.out.print(i+ " ");
        }





    }


}
