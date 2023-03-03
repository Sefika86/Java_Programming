package day16_NestedLoop;


public class MentorQuestion {


    public static void main(String[] args) {



        String name = "   sefika akin  ";

        name = name.trim();
        name = name.substring(0,1).toUpperCase() + "." + name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2 ).toUpperCase() + ".";

        System.out.println(name);

    }


}
