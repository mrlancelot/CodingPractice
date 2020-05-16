import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n, m;
        n = sc.next();
        m = sc.next();

        char arr1[] = n.toCharArray();
        char arr2[] = m.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr1[i] = 0;
                    arr2[j] = 0;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                count++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
