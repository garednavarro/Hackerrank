import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Review {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{

            int numeroFrases = Integer.parseInt(bufferedReader.readLine());

            for(int i = 0; i < numeroFrases; i++){

                StringBuilder primero= new StringBuilder();
                StringBuilder segundo = new StringBuilder();
                String palabra = bufferedReader.readLine();

                int longitud = palabra.length();

                for(int j = 0; j < longitud; j++){
                    int checkEven = j % 2;

                    if(checkEven == 0){

                        primero.append(palabra.charAt(j));
                    } else {

                        segundo.append(palabra.charAt(j));
                    }
                }

                System.out.println(primero + " " + segundo);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
