
//N을 입력받고 n째 줄에 n개씩 N줄까지 별찍기(오른쪽  정렬)

import java.util.Scanner;

public class C3_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
		s.close();
	}
}