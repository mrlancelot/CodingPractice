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

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
       
        int count1 = 0 ;
        int count2 = 0 ;
        int count3 = 0 ;
        int count4 = 0 ;
        int count5 = 0 ;

        for (Integer a : arr){
            if (a ==1){
                 count1++;
            }else if(a ==2){
                 count2++;
            }else if(a ==3){
                 count3++;
            }else if(a ==4){
                 count4++;
            }else{
                 count5++;
            }
        }
        
         int[] intArray = new int[]{count1,count2,count3,count4,count5 };
        int x = 0;
        int y = 1;
        for (int i=0; i < intArray.length; i++){
            if(intArray[i] > x){
                x = intArray[i];
                y = i+1;
            }
        }
        return y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}