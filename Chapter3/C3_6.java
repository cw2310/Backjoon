
//N을 입력받고 첫째 줄에N개~N째 줄에1개씩 N줄까지 별찍기(1<=N<=100)

import java.util.Scanner;

public class C3_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n < 1 || n > 100) return;

		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--)
				System.out.print("*");
			System.out.println();
		}
		s.close();
	}
}