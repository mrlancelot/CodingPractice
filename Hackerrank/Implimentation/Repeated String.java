import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k;
		k = sc.next();
		long n;
		int s;
		n = sc.nextLong();

		if (k.length() < n)
			s = (int) (n % k.length());
		else
			s = (int) n;
		int count = 0;
		int subCount = 0;
		for (int i = 0; i < k.length(); i++) {
			if (k.charAt(i) == 'a') {
				count++;
			}
		}
		String subk = k.substring(0, s);
		if (subk.length() > 0) {
			for (int i = 0; i < subk.length(); i++) {
				if (subk.charAt(i) == 'a') {
					subCount++;
				}
			}
		}
		long multiply = (n / k.length());
		System.out.println(count * multiply + subCount);
	}
}
