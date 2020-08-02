import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		Arrays.sort(nums);
		System.out.println((nums[n - 1] - 1) * (nums[n - 2] - 1));
	}
}
