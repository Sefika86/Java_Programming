package day13_ReturnMethods;

public class ReturnMethodPractice1 {

    public static void main(String[] args) {

        System.out.println(isOdd(8));  // bu sekilde main method altinda sorabiliriz

        System.out.println(isEven(98));

       sum(4,5);

//or bu sekilde condition yazmadan if statement ile sorabiliriz
        int num = 200;
        if (isEven(num)) {
            System.out.println(num + " is even number"); //ya da bu sekilde hic bir condition gostermeden main method altinda sorabiliriz,
        } else {
            System.out.println(num + " is odd number"); // cunku nasil olsa asagida return method olarak var
        }


    }


    //Create a method named isOdd, that can return true if a number is an odd number
    public static boolean isOdd(int num) {
        return (num % 2 != 0) ? true : false;
    }

    //Create a method named isEven, that can return true if a number is an even number
    public static boolean isEven(int num) {
        //return !isOdd(num); OR,
        return (num % 2 == 0) ? true : false;
    }


        public static int sum(int n1, int n2){
        int sum = n1 + n2;
            System.out.println(sum);
            return sum;
        }



}
