import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		n = sc.next();
		
		String k = n.replaceAll("WUB", " ");
		String p = k.trim();
		System.out.println(p);

	}
}