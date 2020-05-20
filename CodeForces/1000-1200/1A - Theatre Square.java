import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n, m, a;
		n = sc.nextInt();
		m = sc.nextInt();
		a = sc.nextInt();

		long countn = n / a;
		long countm = m / a;

		if (n % a != 0)
			++countn;

		if (m % a != 0)
			++countm;

		System.out.println(countn * countm);
	}
}
