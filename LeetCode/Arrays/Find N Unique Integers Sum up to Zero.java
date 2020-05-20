import java.util.*;

public class Strings {

	public static int[] sumZero(int n) {
		int[] result = new int[n];
		int itr = 0;
		if (n % 2 == 0) {
			for (int i = -n / 2; i < 0; i++) {
				result[itr] = i;
				itr++;
				System.out.println(i);
			}
			for (int i = 1; i < (n / 2) + 1; i++) {
				result[itr] = i;
				itr++;
				System.out.println(i);
			}
		} else {
			int value = (n - 1) / 2;
			for (int i = -value; i < 0; i++) {
				result[itr] = i;
				itr++;
				System.out.println(i);
			}
			for (int i = 0; i < value + 1; i++) {
				result[itr] = i;
				itr++;
				System.out.println(i);
			}

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] result = sumZero(n);

		System.out.println(Arrays.toString(result));
	}
}
