import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String s;
        s = sc.next();
        int count = 0;
        for (int i = 0; i < n - 2;) {
            if (s.charAt(i) == '0' && s.charAt(i + 1) == '1' && s.charAt(i + 2) == '0') {
                i += 3;
                count++;
            } else {
                i++;
            }
        }
        System.out.println(count);

    }
}
