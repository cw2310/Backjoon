
/*
���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
*/

import java.util.Scanner;

public class C7_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int[] a = new int[26]; // a[0]~a[25]�� A~Z ���ڰ� ���� Ƚ�� ����

		for (int i = 0; i < s.length(); i++) { // 'a' = 97, 'A' = 65
			if (s.charAt(i) > 96) // �빮���϶�
				a[s.charAt(i) - 97]++;
			else 				// �ҹ����϶�
				a[s.charAt(i) - 65]++;
		}

		int idx = 0; // idx:���� ���� ���� ������ �ε���
		int max = a[0]; // max:���� ��� Ƚ��

		for (int i = 1; i < a.length; i++)
			if (max < a[i]) { // max���� ū�� ã����
				max = a[i]; // max�� idx �ٲ�
				idx = i;
			}

		int cnt = 0; // ���Ƚ���� max�� ���� ����

		for (int i = 0; i < a.length; i++)
			if (a[i] == max) //���� ��� Ƚ���� max�̸�
				cnt++;		//cnt ����

		if (cnt != 1) // ���� ���� ���� ���ڰ� ��������
			System.out.println("?"); //'?'���
		else										// �ϳ���
			System.out.println((char) (idx + 65)); //max�� ���� ���

		sc.close();
	}
}