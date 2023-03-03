package day22_arrayList;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        int a1 = 10;  // this is primitive int

        Integer a2 = 10;  // this is wrapper class Integer

        //the diff between them: primitive can not be used in other data structures other than array but
        // wrapper class is supported by other data structures
        // we can convert primitives into wrapper class objects and back . They are done implicitly

        // we can convert primitive type into it's DEDICATED wrapper class object ==> Autoboxing

                int b1 = 100;
                Integer b2 = b1;  //autoboxing

                char ch1 = 'A';
                Character ch2 = ch1;  //autoboxing

                double d1 = 5.5;
                Double d2 = d1;  //autoboxing

        //we can also convert the object into primitive type ==> Unboxing

              Integer n1 = 20;
              int n2 = n1;    //unboxing

             // long n3 = n1;
             // double n4 = n1;  bu ikisi imp casting, unboxing degil


            Character ch = 'B';
            char ch3 = ch;      //unboxing


    }
}
