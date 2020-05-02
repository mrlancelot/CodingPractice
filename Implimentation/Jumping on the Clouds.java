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
		int count = -1;
        for (int i = 0; i < n; i++, count++) {
            if (i<n-2 && arr[i+2]==0) i++;
        }
        System.out.println(count);
	}
}
