import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		n = sc.next();
		int x = n.length();
		int count = 0;
		for (int i = 0; i < n.length();) {
			String k = n.substring(0, 3);
//			System.out.println(k.substring(0, 1) + "---" + k.substring(1, 2) + "---" + k.substring(2));
			if (!k.substring(0, 1).equalsIgnoreCase("S"))
				count++;
			if (!k.substring(1, 2).equalsIgnoreCase("O"))
				count++;
			if (!k.substring(2).equalsIgnoreCase("S"))
				count++;
			n = n.substring(3);
			i = 0;
		}
//		int res = (x / 3) - count;
		System.out.println(count);
	}
}
