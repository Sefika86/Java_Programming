package day13_ReturnMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {
        //1
        int total = addition(10, 20); // we can assign it OR:
        System.out.println(addition(10, 20));  // result will be 30

        //2
        int t = square(10);   //OR
        System.out.println(square(10));

        //3
        int r = cube(5);  //OR
        System.out.println(cube(5));


    }



    //1
    public static int addition(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }


    //2
    public static int square(int num) {
        int square = num * num;
        return square;
    }


    //3
    public static int cube(int num){
        int cube = square(num) * num;  //we used the return value that we created at top
        return cube;
    }




}
