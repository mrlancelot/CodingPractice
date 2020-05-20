import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int matrix[][] = new int[n][3];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < n; i++) {

			a += matrix[i][0];
			b += matrix[i][1];
			c += matrix[i][2];
		}
		if (a == 0 && b == 0 && c == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
