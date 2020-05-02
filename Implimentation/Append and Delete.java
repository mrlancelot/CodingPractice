import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s, t;
		int k;
		int count = 0;
		s = sc.next();
		t = sc.next();
		k = sc.nextInt();
		int length = 0;
		int later = 0;
		if (s.length() > t.length()) {
			length = t.length();
			later = s.length();
		} else {
			length = s.length();
			later = t.length();
		}
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == t.charAt(i)) {
				count = i;
			} else {
				break;
			}
		}
		if ((s.length() + t.length() - 2 * count) > k) {
			System.out.println("No");
		} else if ((s.length() + t.length() - 2 * count) % 2 == k % 2) {
			System.out.println("Yes");
		} else if ((s.length() + t.length() - k) < 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
