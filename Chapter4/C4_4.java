
//���躻 ���� �� N�� �Է¹ް� ������ �Է��� �� ���� ������ �ִ밪��  M�̶� �ϰ� ��� ������ (����/M*100)���� ��ģ �� ��� ���(��°�ڸ� �ݿø�)

import java.util.Scanner;

public class C4_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double score[] = new double[n];
		double sum = 0;

		for (int i = 0; i < n; i++)
			score[i] = s.nextDouble();

		Double m = score[0];
		for (int i = 1; i < n; i++) // �ִ밪 ã��
			if (score[i] > m)
				m = score[i];

		for (int i = 0; i < n; i++) // ���� ����
			score[i] = score[i] / m * 100;

		for (int i = 0; i < n; i++) // ���� ��
			sum += score[i];
										// ��հ� �Ҽ��� ��°�ڸ� �ݿø� �ؼ� ���
		System.out.println((double) Math.round((sum / n) * 100) / 100);

		s.close();
	}
}