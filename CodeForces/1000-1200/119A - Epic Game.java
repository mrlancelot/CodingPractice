import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, l, resx, resy;
		n = sc.nextInt();
		m = sc.nextInt();
		l = sc.nextInt();
		while (l >= 0) {
			resx = gcd(n, l);
			l -= resx;
			if (l == 0) {
				System.out.println("0");
				break;
			}
			resy = gcd(m, l);
			l -= resy;
			if (l == 0) {
				System.out.println("1");
				break;
			}
		}
	}

	public static int gcd(int x, int y) {
		for (int i = x; i > 0; i--) {
			if (x % i == 0 && y % i == 0)
				return i;
		}
		return 0;
	}
}