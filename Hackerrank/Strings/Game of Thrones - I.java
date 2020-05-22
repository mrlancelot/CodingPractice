import java.util.*;

public class Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		TreeSet<String> tr = new TreeSet<>();
		for (int i = 0; i < s.length(); i++) {
			tr.add(String.valueOf(s.charAt(i)));
		}
		int count = 0;
		for (String r : tr) {
			int temp = 0;
			for (int i = 0; i < s.length(); i++) {
				if (r.equalsIgnoreCase(String.valueOf(s.charAt(i)))) {
					temp++;
				}
			}

			if (temp % 2 != 0)
				count++;
		}
		if (count > 1)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
