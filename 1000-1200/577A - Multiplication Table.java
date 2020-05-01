import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int count = 0;
		n = sc.nextInt();
		m = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if ((m % i == 0) && (m / i <= n)) {
				count++;
			}
		}

		System.out.println(count);
	}
}
