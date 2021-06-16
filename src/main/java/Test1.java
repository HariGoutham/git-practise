import java.io.Serializable;
import java.util.Arrays;

public class Test1 implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		int n = 117;

		for (int i = 0; i <= n/2 ; i++) {

			for (int j = 0; j <= n; j++) {

				int sum = i + j;

				int k = (n / 2 + 2 * i);

				if (sum >= n / 2 && sum <= k) {

					System.out.print("*");

				} else {

					System.out.print(" ");

				}

			}

			System.out.println("");
		}

	}
}
