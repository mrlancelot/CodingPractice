import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();

		int arr[][] = new int[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		String res = "";

		for (int i = 0; i < n; i++) {

			if (i != n - 1) {
				if ((arr[i][0] < arr[i + 1][0]) && (arr[i][1] > arr[i + 1][1])) {
					res = "Happy Alex";
					break;
				}

			} else if (i == (n - 1)) {
				if ((arr[i][0] > arr[0][0]) && (arr[i][1] < arr[0][1])) {
					res = "Happy Alex";
				} else if ((arr[i][0] < arr[0][0]) && (arr[i][1] > arr[0][1])) {
					res = "Happy Alex";
				} else {
					res = "Poor Alex";
				}
			}
		}
		System.out.println(res);
	}
}
