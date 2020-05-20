import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		n = sc.next();
		int ca = 0;
		int cb = 0;
		for (int i = 0; i < n.length(); i++) {

			if (n.charAt(i) == '0') {
				ca++;
				cb = 0;
			} else {
				cb++;
				ca = 0;
			}
			if (ca == 7 || cb == 7) {
				System.out.println("YES");
				break;
			}
		}
		if (ca < 7 && cb < 7) {
			System.out.println("NO");
		}

	}
}