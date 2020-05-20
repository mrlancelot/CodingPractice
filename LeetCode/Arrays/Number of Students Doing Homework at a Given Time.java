import java.util.*;

public class Strings {
	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int result = 0;

		for (int i = 0; i < startTime.length; i++) {
			if (queryTime >= startTime[i] && endTime[i] >= queryTime)
				result++;
		}

		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] startTime = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] endTime = { 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		int queryTime = 5;
//		int[] result = new int[nums.length];
		int result;
		result = busyStudent(startTime, endTime, queryTime);
//		String res = Arrays.toString(result);
		System.out.println(result);

	}
}
