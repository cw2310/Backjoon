
//���� N���� �̷���� ���� A�� ���� X�� �־�����. �� ��, A���� X���� ���� ���� ��� ���

import java.util.Scanner;

public class C4_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();

		for (int i = 0; i < n; i++)
			if (a[i] < x)
				System.out.println(a[i]);

		s.close();
	}
}