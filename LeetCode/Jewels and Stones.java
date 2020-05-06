import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n, m;
		n = sc.next();
		m = sc.next();
		int res = numJewelsInStones(n, m);
		System.out.println(res);
	}

	public static int numJewelsInStones(String J, String S) {
		int count = 0;
		for (int i = 0; i < J.length(); i++) {
			for (int j = 0; j < S.length(); j++) {
				if (J.charAt(i) == S.charAt(j))
					count++;
			}
		}
		return count;

	}
}
