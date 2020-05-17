import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s, p;

		s = sc.next();
		p = sc.next();

		char[] schar = s.toCharArray();
		char[] pchar = p.toCharArray();

		int length = schar.length - (pchar.length - 1);
		int iterate = pchar.length - 1;
		Arrays.sort(pchar);
		ArrayList<Integer> arl = new ArrayList<>();

		for (int i = 0; i < length;) {
			char temp[] = new char[pchar.length];
			for (int j = 0; j < pchar.length; j++) {
				temp[j] = schar[i];
				i++;

			}
			Arrays.sort(temp);
			if (Arrays.equals(temp, pchar)) {
//				System.out.println(i - pchar.length);
				arl.add(i - pchar.length);
			}
			i -= iterate;
			String printed = Arrays.toString(temp);
//			System.out.println(printed);

		}
		System.out.println(arl.toString());
	}
}
