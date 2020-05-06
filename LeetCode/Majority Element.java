import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int res = majorityElement(arr);
		System.out.println(res);
	}

	public static int majorityElement(int[] nums) {

		int curr = 1;
		int max = 1;

		int res = nums[0];
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				curr++;
			} else {
				if (curr > max) {
					max = curr;
					res = nums[i - 1];
				}
				curr = 1;
			}
		}
		if (curr > max) {
			max = curr;
			res = nums[nums.length - 1];
		}
		return res;

	}

}
