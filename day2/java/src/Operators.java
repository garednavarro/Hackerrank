import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Operators {
    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = (tip_percent / 100.0) * meal_cost;
        double tax = (tax_percent / 100.0) * meal_cost;
        double total = meal_cost + tip + tax;
        DecimalFormat df = new DecimalFormat("#####");
        int aux = Integer.parseInt(df.format(total));
        System.out.println("" + aux);
    }


    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
        double meal_cost = 10.25;

        //int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());
        int tip_percent = 17;

        //int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());
        int tax_percent = 5;

        Operators.solve(meal_cost, tip_percent, tax_percent);

        //bufferedReader.close();
    }

}
