
//N�� �Է¹ް� ù° �ٿ�N��~N° �ٿ�1���� N�ٱ��� �����(1<=N<=100)

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