import java.util.*;

public class Strings {
	public static int numTeams(int[] rating) {
		int count = 0;
		for (int i = 0; i < rating.length; i++) {
			for (int j = 0; j < rating.length; j++) {
				for (int k = 0; k < rating.length; k++) {
					if ((i < j && j < k) && (((rating[i] < rating[j]) && (rating[j] < rating[k]))
							|| ((rating[i] > rating[j]) && rating[j] > rating[k]))) {
						count++;
					}
				}
			}
		}

		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] rating = {1,2,3,4};

		int res = numTeams(rating);

		System.out.println(res);

	}
}
