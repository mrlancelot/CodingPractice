import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < n; j++) {

				if (i == arr[arr[j] - 1]) {
					System.out.println(j + 1); //

				}
			}
		}

	}
}
