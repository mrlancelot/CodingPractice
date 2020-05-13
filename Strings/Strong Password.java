import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		String s;
		s = sc.next();
		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-+";

		boolean bool[] = new boolean[4];

		for (int i = 0; i < n; i++) {
			if (numbers.indexOf(s.charAt(i)) != -1)
				bool[0] = true;
			if (lower_case.indexOf(s.charAt(i)) != -1)
				bool[1] = true;
			;
			if (upper_case.indexOf(s.charAt(i)) != -1)
				bool[2] = true;
			;
			if (special_characters.indexOf(s.charAt(i)) != -1)
				bool[3] = true;
			;

		}
		int count = 0;
		for (int i = 0; i < bool.length; i++) {
			if (bool[i] == true)
				count++;
		}
		int x = 4 - count;
		if (s.length() >= 6)
			System.out.println(x);
		else if ((6 - s.length() >= x))
			System.out.println(6 - s.length());
		else {
			System.out.println(x);
		}
	}
}
