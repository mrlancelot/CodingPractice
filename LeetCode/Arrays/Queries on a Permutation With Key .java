import java.util.*;

public class Strings {
	public static int[] processQueries(int[] queries, int m) {
		int[] result = new int[queries.length];
		int count = 0;
		int p[] = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = i + 1;
		}
		String pS = Arrays.toString(p);
		String qS = Arrays.toString(queries);

//		System.out.println(pS + "---" + qS);

		for (int i = 0; i < queries.length; i++) {
			for (int j = 0; j < m; j++) {
//				System.out.println(queries[i] + "---" + p[j]);
				if (queries[i] == p[j] && count != queries.length) {
					result[count] = j;
//					System.out.println("Value:" + p[j]);
					int temp[] = new int[m];
					temp[0] = queries[i];
					int kc = 1;
					for (int k = 0; k < m; k++) {
						if (p[k] != temp[0]) {
							temp[kc] = p[k];
							kc++;
						}
					}
					String pin = Arrays.toString(temp);
//					System.out.println("temp value" + pin);
					p = temp;
//					p = num + p.substring(0, j) + p.substring(j + 1);

					count++;
					break;
				} else if (count == queries.length) {
					break;
				}

			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int queries[] = { 10, 7, 3, 3, 9, 4, 1, 4, 9, 9 };

		int m = 10;

		int[] result = new int[queries.length];
		result = processQueries(queries, m);
		String res = Arrays.toString(result);
		System.out.println(res);

	}
}
