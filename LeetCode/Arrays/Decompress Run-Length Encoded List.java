import java.util.*;

public class Strings {

	public static int[] decompressRLElist(int[] nums) {

		ArrayList<Integer> res = new ArrayList<>();

		for (int i = 0; i < nums.length;) {
			int freq = nums[i];
			int val = nums[i + 1];

			for (int j = 0; j < freq; j++) {
				res.add(val);
			}
			i += 2;
		}
		int[] result = new int[res.size()];
		for (int j = 0; j < res.size(); j++) {
			result[j] = res.get(j);
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = { 1, 2, 3, 4 };

		int[] result = decompressRLElist(nums);

		System.out.println(Arrays.toString(result));

	}
}
