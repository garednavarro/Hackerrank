import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> book = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            //Write code here
            book.put(name, phone);
        }
        while (in.hasNext()){
            String s = in.next();
            int phone;
            if (book.get(s) != null) {
                phone = book.get(s);
                System.out.println(s + "=" + phone);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }

}
