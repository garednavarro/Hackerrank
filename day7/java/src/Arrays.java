import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Arrays {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            bufferedReader.close();

            for (int longitud = arr.size() - 1; longitud >= 0; longitud--) {
                System.out.print("" + arr.get(longitud) + " ");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
