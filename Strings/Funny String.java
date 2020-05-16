import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        ArrayList<String> st = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String e = sc.next();
            st.add(e);
        }
        for (String s : st) {
            StringBuilder str = new StringBuilder();
            str.append(s);
            str = str.reverse();
            int count = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                int a = Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
                int b = Math.abs((int) str.charAt(i) - (int) str.charAt(i + 1));
//                System.out.println("a: " + a + "b: " + b + "String" + s);

                if (a != b) {
                    count++;
                }

            }
            if (count > 0) {
                System.out.println("Not Funny");
            } else {
                System.out.println("Funny");
            }
        }

    }
}
