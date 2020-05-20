import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		n = sc.next();
		int counth = 0;
		int counte = 0;
		int countl = 0;
		int counto = 0;
		char[] ch = n.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'h')
				counth++;
			if (counth >= 1 && ch[i] == 'e')
				counte++;
			if (counth >= 1 && counte >= 1 && ch[i] == 'l')
				countl++;
			if (counth >= 1 && counte >= 1 && countl >= 2 && ch[i] == 'o')
				counto++;
		}

		if (counth >= 1 && counte >= 1 && countl >= 2 && counto >= 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
