import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, div;

		n = sc.nextInt();
		m = sc.nextInt();

		int count = n;
		int remainder = 0;
		while (n >= m) {
			 div = n/m;
			 count += div;
			 remainder = n%m;
			 n = div+remainder;
		}
		System.out.println(count);
	}
}