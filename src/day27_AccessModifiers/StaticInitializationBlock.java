package day27_AccessModifiers;

public class StaticInitializationBlock {


    //let's create some static members(variables & methods)

    public static int a;   // we didn't set the static variable because we will need a block of code == static block
    public static double b;
    public static String c;


    //BEST CHOICE TO INITIALIZE THE STATIC VARIABLES IS ==> STATIC BLOCK

    static {

        a = 100;
        b = 20.5;
        c = "Java";
    }


    //WE TRIED TO DO WITH CONTS. BUT IT NEEDS OBJ. AND IT EXECUTES THESE STATICS AS THE NUMBER OF OBJECTS WHICH NO NEED
    /*
    public StaticInitializationBlock(){
        a = 100;
        b = 20.5;
        c = "Java";
    }
*/


//WE TRIED TO DO WITH MAIN METHOD BUT WE GET (O.0, O.0, NULL) AT THE TEST CLASS
    /*
    public static void main(String[] args) {
        a = 100;
        b = 20.5;
        c = "Java";
    }
*/

}
