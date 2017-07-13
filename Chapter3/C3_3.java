
//N을 입력받고 구구단 N단 출력

import java.util.Scanner;

public class C3_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 1; i <= 9; i++)
			System.out.println(n + " * " + i + " = " + n * i);
	}
}