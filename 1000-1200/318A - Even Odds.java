import java.util.*;
 
public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n;
		long m;
		n = sc.nextLong();
		m = sc.nextLong();
 
		long odd = 0;
 
		if (n % 2 == 0) {
			odd = (((n - 1 - 1) / 2) + 1);
		} else {
			odd = (((n - 1) / 2) + 1);
		}
		if (m > odd) {
			m = m - odd;
			System.out.println(m * 2);
			return;
		} 			System.out.println((m * 2) - 1);
		
	}
}