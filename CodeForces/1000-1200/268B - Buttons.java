import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int res = 0;
		for (int i = 0; i < n; i++) {
			res += (n - i) * i;
		}
		System.out.println(n + res);
	}
}
