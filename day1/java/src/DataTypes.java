import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        StringBuilder aux = new StringBuilder();


        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i2 = scan.nextInt();
        d2 = scan.nextDouble();

        while (scan.hasNext()){
            aux.append(scan.next()).append(" ");
        }

        System.out.println("" + s + aux.toString());
        scan.close();
    }
}
