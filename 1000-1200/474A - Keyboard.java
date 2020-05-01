import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n, m;
		n = sc.next();
		m = sc.next();
		String s = "";
		String search = "qwertyuiop[]asdfghjkl;'zxcvbnm,./";
		if (n.equalsIgnoreCase("R")) {
			for (int i = 0; i < m.length(); i++) {
				for (int j = 0; j < search.length(); j++) {
					if (m.charAt(i) == search.charAt(j)) {
						s += search.charAt(j - 1);
					}
				}
			}
		} else {
			for (int i = 0; i < m.length(); i++) {
				for (int j = 0; j < search.length(); j++) {
					if (m.charAt(i) == search.charAt(j)) {
						s += search.charAt(j + 1);
					}
				}
			}
		}
		System.out.println(s);
	}
}