import java.util.*;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int level;
		int x = 0;
		int y = 0;
		level = sc.nextInt();
		x = sc.nextInt();
		Integer arrx[] = new Integer[x];
		for (int i = 0; i < x; i++) {
			arrx[i] = sc.nextInt();
		}
		y = sc.nextInt();
		Integer arry[] = new Integer[y];
		for (int i = 0; i < y; i++) {
			arry[i] = sc.nextInt();
		}

		int position = 0;
		int length = x + y;
		Integer arrMerged[] = new Integer[length];
		for (int posx : arrx) {
			arrMerged[position] = posx;
			position++;
		}
		for (int posy : arry) {
			arrMerged[position] = posy;
			position++;
		}
		/*
		 * Arrays.sort(arrMerged); for (int i = 0; i < arrMerged.length; i++) {
		 * if(arrMerged[i] != arrMerged[i+1]) { count++; } } System.out.println(count);
		 */

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arrMerged));
		Integer[] count = linkedHashSet.toArray(new Integer[] {});

		if (level == (count.length)) {
			System.out.println("I become the guy.");
		} else {
			System.out.println("Oh, my keyboard!");
		}
	}
}
