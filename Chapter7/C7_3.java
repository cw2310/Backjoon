
/*
���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� T�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�ٽ� �������ڸ�, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ T�� ����� �ȴ�. 
S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./: �̴�.

ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 <= T <= 1,000)�� �־�����. �� �׽�Ʈ ���̽���  �ݺ� Ƚ�� R(1 <= R <= 8),
 ���ڿ� S�� �������� ���еǾ� �־�����. S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 
 */

import java.util.Scanner;

public class C7_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int[] r = new int[t];
		String[] s = new String[t];

		for (int i = 0; i < t; i++) {
			r[i] = sc.nextInt();
			s[i] = sc.next();
		}

		for (int i = 0; i < t; i++) {
			for (int j = 0; j < s[i].length(); j++)
				for (int k = 0; k < r[i]; k++)
					System.out.print(s[i].charAt(j));
			System.out.println();
		}

		sc.close();
	}
}