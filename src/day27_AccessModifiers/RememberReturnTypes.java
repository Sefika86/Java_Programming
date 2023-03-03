package day27_AccessModifiers;

public class RememberReturnTypes {

                                    //parameters
    public static void method(int yearBirth, int yearNow){

     //local Variable
        int age = yearNow - yearBirth;
        System.out.println(age);

    }

    public static int method2(int yearBirth, int yearNow){
        int age = yearNow - yearBirth;
        return age;
    }

    public static void main(String[] args) {
                   //arguments
      method(1986,2022);


      System.out.println(method2(1986, 2022));
    }



}
