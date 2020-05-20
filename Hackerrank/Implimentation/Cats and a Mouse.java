import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {

        int distA  = z - x;
        int distB = z - y;

        // if(distA < 0){
        //     distA = distA * -1;
        // }else if(distB < 0){
        //     distB = distB * -1;
        // }

        String result = "";

        if (Math.abs(distA) == Math.abs(distB)){
            result = "Mouse C";
        }else if(Math.abs(distB) < Math.abs(distA)){
            result = "Cat B";
        }else if(Math.abs(distB) > Math.abs(distA)){
            result = "Cat A";
        }
        // System.out.println(result);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}