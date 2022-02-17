import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DecimalToBinary {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());
        int n = 35;
        int count = 0;
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (n > 0){
            int resto = n % 2;
            n = n/2;
            arr.add(resto);
            System.out.print(resto);
        }
        System.out.println("");
        for (Integer integer : arr) {
            if (integer == 0) {
                count = 0;
            } else {
                count++;
                result = Math.max(result, count);
            }
        }
        System.out.println(result);
        bufferedReader.close();
    }
}
