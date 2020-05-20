import java.util.*;

public class Strings {
	public static int[] createTargetArray(int[] nums, int[] index) {
		int[] target = new int[nums.length];
		ArrayList<Integer> run = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			run.add(index[i], nums[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			target[i] = run.get(i);
		}
		return target;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] nums = { 0, 1, 2, 3, 4 };
		int[] index = { 0, 1, 2, 2, 1 };
		int[] result = new int[nums.length];
		result = createTargetArray(nums, index);
		String res = Arrays.toString(result);
		System.out.println(res);

	}
}
