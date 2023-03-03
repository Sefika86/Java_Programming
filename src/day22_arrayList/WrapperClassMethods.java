package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "20";
        System.out.println(str + 1);  //we will get 201 on the console

        // so we use parse method to convert this string into primitive type as number 20

        //Integer num1 = Integer.parseInt(str); //unboxing, we do not need this step

        int num = Integer.parseInt(str);  // primitives do not have methods ,so we have to call this
        // parse method from it's dedicated wrapper class

        System.out.println(num + 1);  // now we will get 20+1=21

        Integer num2 = Integer.valueOf(str); // a wrapper class assigned into a wrapper class, neither autoboxing nor unboxing

        System.out.println(num2);  //20


        System.out.println("---------------------------------------------------------");

        String s = "20.5";

        double d1 = Double.parseDouble(s);
        System.out.println(d1);

        Double d2 = Double.valueOf(s);
        System.out.println(d2);

        System.out.println("---------------------------------------------------------");


        String x = "true";  // if this was "maybe" for example, false should be executed.
        //because boolean is either true or false.

        boolean r1 = Boolean.parseBoolean(x);

        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("------------------------------------------------------");

        //Character Wrapper Class has some special methods...

        char ch = 'A';

        boolean isDigit = Character.isDigit(ch);
        System.out.println(isDigit); //false

        boolean isLetter = Character.isLetter(ch);
        System.out.println(isLetter);  //true

        boolean isUpper = Character.isUpperCase(ch);
        System.out.println(isUpper);   //true

        boolean isLower = Character.isLowerCase(ch);
        System.out.println(isLower);  //false

        boolean isSpecial = !Character.isLetterOrDigit(ch);  //false
        //boolean isSpecial = Character.isLetterOrDigit(ch);  //true

        System.out.println(isSpecial);


        System.out.println("-----------------------------------------------------------------");
        //Task ex: What is the sum of the digits?
        //this string literal is not a data structure you can always use for loop but not for each loop
        //if you want to use for each loop you have to create a data structure out of the string with toCharArray() method

        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) {

            if (Character.isDigit(each)){

                sum += Integer.parseInt("" + each);  // but each number in this string is a char ,so we need to convert
                                                        // them to primitive with parseInt method.

            }

        }

        System.out.println("sum = " + sum);
    }

}
