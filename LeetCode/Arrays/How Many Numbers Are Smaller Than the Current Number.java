import java.util.*;

public class Strings {

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j])
					result[i]++;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] nums = { 8, 1, 2, 2, 3 };
		int[] result = new int[nums.length];

		result = smallerNumbersThanCurrent(nums);
		String res = Arrays.toString(result);
		System.out.println(res);

	}
}
