package day14_Overloading_ForLoop;

public class StringReverse_withCustomMethod {
    public static void main(String[] args) {

        System.out.println(reverse("JAVA"));

        System.out.println("-----------------------------------");

        String name = " Ermek Keneshbekovich Apazov";
        String result = reverse(name);
        System.out.println(result);


    }


    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);

        }

        return reverse;
    }


}