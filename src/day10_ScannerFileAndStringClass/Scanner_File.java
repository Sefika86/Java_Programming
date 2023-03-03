package day10_ScannerFileAndStringClass;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Scanner_File {
    public static void main(String[] args) throws IOException {

    Scanner scan = new Scanner(Path.of("src/day10_ScannerFileAndStringClass/Test.txt"));

        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());

    //we used nextLine because I want to read the entire sentence in the first line not only the first word
    //Each print statement with nextLine Method will read another line of our file
    // In the future we will learn loop to be able to read long files with only one print statement

        //System.out.println(scan.hasNext());   hasNext line to check if file is empty or not

        scan.close(); //object closed




    }
}
