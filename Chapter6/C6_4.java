
/*
�������� c d e f g a b C, �� 8�� ������ �̷�����ִ�.
�� �������� 8�� ���� ������ ���� ���ڷ� �ٲپ� ǥ���Ѵ�. c�� 1��, d�� 2��, ..., C�� 8�� �ٲ۴�.
1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 8���� 1���� ���ʴ�� �����Ѵٸ� descending, �� �� �ƴ϶�� mixed �̴�.
������ ������ �־����� ��, �̰��� ascending����, descending����, �ƴϸ� mixed���� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

import java.util.Scanner;

public class C6_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[8];
		int cnt1 = 0;
		int cnt2 = 0;

		for (int i = 0; i < a.length; i++)
			a[i] = s.nextInt();

		if (a[0] == 1) {
			for (int i = 1; i < a.length; i++)
				if (a[i] == i + 1)
					cnt1++;
		} else if (a[0] == 8) {
			for (int i = 1; i < a.length; i++)
				if (a[i] == 8 - i)
					cnt2++;
		}

		if (cnt1 == 7)
			System.out.println("ascending");
		else if (cnt2 == 7)
			System.out.println("descending");
		else
			System.out.println("mixed");

		s.close();
	}
}