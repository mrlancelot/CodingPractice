import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		// if min of (n,m) is odd Akshat or else malvika
		
		
		int test;
		if(m > n) {
			test = n;
		}else {
			test = m;
		}
		
		if(test%2 ==0) {
			System.out.println("Malvika");
		}else {
			System.out.println("Akshat");
		}
		
	}
}

