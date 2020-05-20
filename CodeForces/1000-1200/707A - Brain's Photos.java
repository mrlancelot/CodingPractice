import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int count = 0;
		n = sc.nextInt();
		m = sc.nextInt();

		String arr[][] = new String[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.next();
				if (arr[i][j].equalsIgnoreCase("C") || arr[i][j].equalsIgnoreCase("M")
						|| arr[i][j].equalsIgnoreCase("Y")) {
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("#Black&White");
		} else {
			System.out.println("#Color");
		}
	}
}
