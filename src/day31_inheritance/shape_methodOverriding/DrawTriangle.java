package day31_inheritance.shape_methodOverriding;

public class DrawTriangle{


    public static void main(String[] args) {


        int height  = 7;

        int i, j, k;
        for (i = 1; i < height; i++) {
            for (j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                if(k==1 || k==i){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        String lastLine = "";
        for (int l = 0; l < 7 ; l++) {
            lastLine += " *";
        }

        System.out.println(lastLine);



    }
}
