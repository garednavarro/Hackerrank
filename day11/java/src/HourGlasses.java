import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class HourGlasses {

    public static int hourGlassSum(List<List<Integer>> arr, int x, int y){
        int suma = arr.get(y).get(x) + arr.get(y).get(x + 1) + arr.get(y).get(x + 2);
        suma += arr.get(y + 1).get(x + 1);
        suma += arr.get(y + 2).get(x) + arr.get(y + 2).get(x + 1) + arr.get(y + 2).get(x + 2);

        return suma;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int size = arr.size();
        int resultado = -10000;

        for (int y = 0; y < size - 2; y++){
            for(int x = 0; x < size - 2; x++){
                resultado = Math.max(resultado, HourGlasses.hourGlassSum(arr, x, y));
            }
        }

        System.out.println(resultado);

        bufferedReader.close();
    }


}
