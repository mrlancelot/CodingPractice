import java.util.*;

public class Strings {

	public static int findNumbers(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			String temp = String.valueOf(nums[i]);

			if (temp.length() % 2 == 0) {
				res++;
			}
		}
		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] nums = { 12, 345, 2, 6, 7896 };
//		int result = new int[nums.length];
		int result;
		result = findNumbers(nums);
//		String res = Arrays.toString(result);
		System.out.println(result);

	}
}
