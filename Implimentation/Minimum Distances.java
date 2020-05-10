import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int dist = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j] && i != j && i < j) {
                    dist = j - i;
                    break;
                }

                if (count == 0 && dist != -1) {
                    count = dist;
                } else if (dist < count && dist != -1) {
                    count = dist;
                }
            }
        }
        if (count == 0) {
            count = dist;
        }
        System.out.println(count);
    }
}
