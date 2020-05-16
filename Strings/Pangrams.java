import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = "";
        n += sc.nextLine();
        sc.close();
        n = n.toLowerCase();

        TreeSet<String> ch = new TreeSet<>();
        for (int i = 0; i < n.length(); i++) {
            char a = n.charAt(i);
            ch.add(String.valueOf(a));
        }
//        System.out.println(ch.size());

//        System.out.println(ch.toString());

        if (ch.size() == 27) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}
