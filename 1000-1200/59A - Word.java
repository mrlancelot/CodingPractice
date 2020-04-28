import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		n = sc.next();
		
		int uc = 0;
		int lc = 0;
		
		
		for(int i=0;i<n.length();i++) {
			if(Character.isUpperCase(n.charAt(i))) {
				uc++;
			}else {
				lc++;
			}
		}
		
		if(uc > lc) {
			System.out.println(n.toUpperCase());
		}else {
			System.out.println(n.toLowerCase());
		}

	}
}
