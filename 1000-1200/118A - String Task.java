import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		n = sc.next();
		char ch[] = n.toCharArray();
		String abc = "";

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' || ch[i] == 'Y'
					|| ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'y') {
				abc = abc + "";
			} else {
				abc = abc + "." + ch[i];
			}
		}

		System.out.println(abc.toLowerCase());

	}
}
