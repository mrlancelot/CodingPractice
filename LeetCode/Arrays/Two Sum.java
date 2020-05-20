import java.util.*;

public class Strings {

	public static int[] twoSum(int[] nums, int target) {
		int res[] = new int[2];

		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			int sub = target - temp;
//			System.out.println(temp + "--" + sub);
			for (int j = 0; j < nums.length; j++) {
				if (sub == nums[j] && i != j) {
					res[0] = i;
					res[1] = j;
					return res;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = { 3, 2, 4 };
		int target = 6;

		int result[] = new int[2];
		result = twoSum(nums, target);
		String res = Arrays.toString(result);
		System.out.println(res);

	}
}
