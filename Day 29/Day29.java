package thirty_days_of_code;
import java.io.*;
import java.util.*;
public class Day29 {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			int K = in.nextInt();

			int max = 0;

			for (int j = 1; j < N; j++) {
				for (int k = j + 1; k <= N; k++) {
					int h = j & k;
					if (h < K && max < h) max = h;
				}
			}

			System.out.println(max);
		}
	}
}

