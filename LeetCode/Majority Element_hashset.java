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
		int count = 0;
		int num = 0;
		Integer arr[] = new Integer[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arr[i] = Integer.valueOf(nums[i]);
		}
		Set<Integer> set = Collections.<Integer>emptySet();
		Collections.addAll(set = new HashSet<Integer>(Arrays.asList(arr)));
		System.out.println(set);
		for (Integer s : set) {
			int temp = 0;
			for (int i = 0; i < arr.length; i++) {
				if (s == arr[i])
					temp++;
			}

			if (temp > count++) {
				count = temp;
				num = s;
			}
		}

		return num;

	}

}
