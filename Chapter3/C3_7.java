
//N�� �Է¹ް� ù° �ٿ�N��~N° �ٿ�1���� N�ٱ��� ����� (������ ����)(1<=N<=100)

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