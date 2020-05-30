import java.util.*;

public class Strings {
	public static boolean canBeEqual(int[] target, int[] arr) {

		Arrays.sort(target);
		Arrays.sort(arr);
		if (Arrays.equals(target, arr))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] target = { 1, 2, 3, 4 };
		int[] arr = { 2, 4, 1, 3 };
		boolean res = canBeEqual(target, arr);

		System.out.println(res);
	}
}
