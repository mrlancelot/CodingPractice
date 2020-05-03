import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > 37) {
				if (arr[i] % 10 == 3 || arr[i] % 10 == 8) {
					arr[i] += 2;
				} else if (arr[i] % 10 == 4 || arr[i] % 10 == 9) {
					arr[i] += 1;
				}
			}
			System.out.println(arr[i]);
		}
	}
}
