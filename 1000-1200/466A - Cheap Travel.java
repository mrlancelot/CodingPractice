import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, a, b, main;

		n = sc.nextInt();
		m = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();

		if ((n / m) * b < n * a) {
			main = (n / m) * b;
			if ((n % m) * a > b) {
				main += b;
			} else {
				main += (n % m) * a;
			}
		} else {
			main = n * a;
		}

		System.out.println(main);

	}
}