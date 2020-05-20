import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		TreeSet<Integer> h = new TreeSet<Integer>();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			h.add(arr[i]);
		}
		Arrays.sort(arr);
//		System.out.println(h.toString());

		int count = 0;
		int temp = 0;
		for (Integer k : h) {
			for (int i = 0; i < n; i++) {
//				System.out.println(k);
				if (k == arr[i]) {
					temp++;
				} else {
					temp = 0;
				}
//				System.out.println("temp : " + temp + " k: " + k + " arr[i]: " + arr[i]);
				if (temp >= count) {
					count = temp;
				}
//				System.out.println("count" + count);
			}
		}

		System.out.println(n - count);
	}
}
