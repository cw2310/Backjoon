
//N을 입력받고 첫째 줄에N개~N째 줄에1개씩 N줄까지 별찍기 (오른쪽 정렬)(1<=N<=100)

import java.util.Scanner;

public class C3_7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n < 1 || n > 100)
			return;

		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(" ");
			for (int k = 1; k <= n - i; k++)
				System.out.print("*");
			System.out.println();
		}
		s.close();
	}
}