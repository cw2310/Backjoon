
/*
� ���� ���� X�� �ڸ����� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�.
N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
*/

import java.util.Scanner;

public class C5_2 {
	static boolean HS(Integer i) { // i�� �Ѽ��̸� true
		String str = new String(i.toString());
		if (str.length() <= 2)
			return true;

		for (int j = 0; j < str.length() - 2; j++)
			if (str.charAt(j + 1) - str.charAt(j) != str.charAt(j + 2) - str.charAt(j + 1))
				return false;

		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			if (HS(i) == true)
				cnt++;
		}
		System.out.println(cnt);

		s.close();
	}
}