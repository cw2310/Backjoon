
//N을 입력받고 n째 줄에 n개씩 N줄까지 별찍기

import java.util.Scanner;

public class C3_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		s.close();
	}
}