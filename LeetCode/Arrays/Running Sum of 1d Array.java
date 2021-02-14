import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = { 1, 2, 3, 4 };
		int arr[] = runningSum(nums);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] runningSum(int[] nums) {
		int arr[] = new int[nums.length];
		arr[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
				arr[i] = nums[i] + arr[i-1];
		}

		return arr;
	}
}
