import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n;
		long m,l,s;
		n = sc.nextLong();
		
		if(n%2 ==0) {
			m = n/2;
			l = n/2;
		}else {
			m = (n+1)/2;
			l = n-m;
		}
		
		s = ((l*l)+l) - (m*m);
		System.out.println(s);
		
	}
}