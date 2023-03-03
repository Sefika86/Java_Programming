package day27_AccessModifiers;

public class Test {

    public static void main(String[] args) {


        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);


//BEST CHOICE TO INITIALIZE THE STATIC VARIABLES IS ==> STATIC BLOCK  ==>IN StaticInitializationBlock CLASS
//WE TRIED TO DO WITH CONTS. METHOD BUT IT NEEDS OBJ. AND IT EXECUTES THESE STATICS AS THE NUMBER OF OBJECTS WHICH NO NEED
//WE TRIED TO DO WITH MAIN METHOD BUT WE GET (O.0, O.0, NULL)


        System.out.println("---------------------------------------------------------------------------");

    //testing different access modifiers:


        System.out.println(AccessModifiers.publicData); // public is accessible within same package

        System.out.println(AccessModifiers.protectedData); // protected is accessible within same package

        System.out.println(AccessModifiers.defaultData); // default is accessible within same package

        //  System.out.println(AccessModifiers.privateData); // private is not accessible within same package

        new AccessModifiers();

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        // AccessModifiers.privateMethod();




    }
}
