import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		n = sc.next();
		String result = "";

		if (Character.isUpperCase(n.charAt(0))) {

			for (int i = 0; i < n.length(); i++) {
				if (Character.isUpperCase(n.charAt(i))) {
					result += String.valueOf(n.charAt(i)).toLowerCase();
				} else {
					result = n;
					break;
				}
			}
		} else {
			String front = n.substring(0, 1).toUpperCase();
			String back = "";
			int count = 0;
			for (int i = 1; i < n.length(); i++) {

				if (Character.isUpperCase(n.charAt(i))) {
					back += String.valueOf(n.charAt(i)).toLowerCase();
				} else {
					count++;
					break;
				}
			}
			if (count == 0) {
				result = front + back;
			} else {
				result = n;
			}

		}
		System.out.println(result);

	}
}
