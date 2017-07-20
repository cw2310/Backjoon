
/*
"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�.
������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�.���� ���, 10�� ������ ������ 3�� �ȴ�.
"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

import java.util.Scanner;

public class C6_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int c = s.nextInt();
		String str[] = new String[c];

		for (int i = 0; i < c; i++)
			str[i] = s.next();

		for (int i = 0; i < c; i++) {
			int sum = 0;
			int score[] = new int[str[i].length()];
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == 'O') {
					if (j == 0)
						score[0] = 1;
					else if (str[i].charAt(j - 1) == 'O')
						score[j] = score[j - 1] + 1;
					else
						score[j] = 1;
				} else
					score[j] = 0;

				sum += score[j];
			}
			System.out.println(sum);

		}
		s.close();
	}
}