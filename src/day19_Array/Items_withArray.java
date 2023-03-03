package day19_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Items_withArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] itemName = new String[5];
        int[] price = new int[5];


        int calculate = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("enter item name:");
            itemName[i] = input.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("enter price of item");
            price[i] = input.nextInt();
            calculate += price[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(itemName[i] + " -- " + price[i]);
        }

        System.out.println("itemName = " + Arrays.toString(itemName));
        System.out.println("price = " + Arrays.toString(price));
        System.out.println("Total price of items: $" + calculate);


        input.close();
    }
}
/*
6. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
 */