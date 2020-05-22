import java.util.*;

public class Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String test = "hackerrank";

		while (n > 0) {
			String s = sc.next();
			int count = 0;
			for (int i = 0; i < test.length(); i++) {
				for (int j = 0; j < s.length(); j++) {
//					System.out.println(test.charAt(i) + "---" + s.charAt(j));
					if (test.charAt(i) == s.charAt(j)) {
						s = s.substring(j + 1);
//						System.out.println(s);
						count++;
						break;
					}
				}
			}

			if (count == 10) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			n--;
		}

	}
}
