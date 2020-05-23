import java.util.*;

public class Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String test = sc.next();
			int count = 0;
			for (int j = 0; j < test.length() - 1; j++) {
				if (test.charAt(j) == test.charAt(j + 1))
					count++;
			}
			System.out.println(count);
		}
	}
}
