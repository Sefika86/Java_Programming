package day12_CustomMethodsIntro;

import java.util.Scanner;

public class ReplitGiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String order = scan.nextLine();

        int fee = 0;
        int budget = 100;
        int balance= budget - fee;
        String message = " ";

        if (fee>0 && fee<=100){
            message = "Thank you for your purchase! \n Your current balance is: " + balance + "$";

            switch (order){
                case "Blanket":
                    fee =60;
                    break;
                case "Charger":
                    fee = 5;
                    break;
                case "Hat":
                    fee =25;
                    break;
                case "Headphones":
                    fee = 30;
                    break;
                case "Laptop":
                    fee =200;
                    break;

                default:
                    message = "Sorry, that is an invalid item";

            }

        }else{
            message = "Sorry, not enough funds on your gift card";
        }


        System.out.println(message);




    }
}
