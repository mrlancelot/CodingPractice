import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n,m;
		n = sc.next();
		m = sc.next();
		String result = "";
		for(int i=0; i<n.length();i++) {
			if(n.charAt(i) == m.charAt(i)) {
				result += "0";
			}else {
				result += "1";
			}
		}
		System.out.println(result);

	}
}
