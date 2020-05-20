import java.util.*;

public class Strings {

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		ArrayList<Boolean> res = new ArrayList<>();
		int temp = candies[0];
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > temp)
				temp = candies[i];
		}
		for (int i = 0; i < candies.length; i++) {
			if ((candies[i] + extraCandies) >= temp)
				res.add(true);
			else
				res.add(false);
		}
		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int candies[] = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;

		List<Boolean> result = new ArrayList<>();
		result = kidsWithCandies(candies, extraCandies);

		for (Boolean b : result) {
			System.out.println(b);
		}
	}

}
