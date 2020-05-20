import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s;
		s = sc.nextInt();
		String p = "";
		int count = 0;
		for (int i = 0; i < s; i++) {
			String k = sc.next();
			StringBuilder sb = new StringBuilder();
			k.chars().distinct().forEach(c -> sb.append((char) c));
			System.out.println(sb.length());
		}

	}
}
