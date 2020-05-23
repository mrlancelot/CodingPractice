import java.util.*;

public class Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		n = sc.nextInt();

		int counta = 0;
		int countb = 0;
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		String s = arr[0];
		String second = "";
		for (int i = 0; i < n; i++) {
			if (arr[i].equalsIgnoreCase(s)) {
				counta++;
			} else {
				second = arr[i];
				countb++;
			}
		}

		if (counta > countb) {
			System.out.println(s);
		} else {
			System.out.println(second);
		}
	}
}
