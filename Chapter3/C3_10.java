
//ù° �ٿ� N�� �Է��ϰ� ��° �ٿ� N���� ���� ������� �Է��ϸ� N���� ���ڸ� �� �� ���

import java.util.Scanner;

public class C3_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int num[] = new int[n]; // �� ���� ������ �迭
		int sum = 0;

		String str = s.next(); // ���ڸ� ���ڿ��� ����

		for (int i = 0; i < n; i++) // ���� ���ڿ��� �� ���ڸ� ������ �迭�� ����
			num[i] = str.charAt(i) - 48; // 0�� �ƽ�Ű�ڵ� 48

		for (int i = 0; i < n; i++)
			sum += num[i];

		System.out.println(sum);

		s.close();
	}
}