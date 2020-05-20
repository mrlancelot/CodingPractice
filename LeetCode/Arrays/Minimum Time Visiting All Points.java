import java.util.*;

public class Strings {
	public static int minTimeToVisitAllPoints(int[][] points) {
		int result = 0;
		for (int i = 0; i < points.length - 1; i++) {
			result += Math.max(Math.abs(points[i][0] - points[i + 1][0]), Math.abs(points[i][1] - points[i + 1][1]));
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] points = { { 3, 2 }, { -2, 2 } };
		int result;
		result = minTimeToVisitAllPoints(points);
		System.out.println(result);

	}
}
