import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n, m, a;
		n = sc.nextDouble();
		m = sc.nextDouble();
		a = sc.nextDouble();

		double result = (Math.ceil(n/ a) * Math.ceil(m / a));
		int x = (int) result;
		System.out.println(x);
	}
}
