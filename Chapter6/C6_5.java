
/*
�����̰� ����ġ�� ������ �� ���� ������ �������� ����, ����, ���, ��, �����̴�.
���� �� ������ �⸻��簡 �־���, �����̴� ���� �л����� �⸻��� �������� ä���ϰ� �ִ�.
�⸻��� ������ 40�� �̻��� �л����� �� ���� �״�� �ڽ��� ������ �ȴ�.
������, 40�� �̸��� �л����� �����н��� ��� ������ �����ϸ� 40���� �ް� �ȴ�.
�����н��� �ź��� �� ���� ������, 40�� �̸��� �л����� �׻� 40���� �ް� �ȴ�.
�л� 5���� ������ �־����� ��, ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
import java.util.Scanner;

public class C6_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;

		for (int i = 0; i < score.length; i++)
			score[i] = s.nextInt();

		for (int i = 0; i < score.length; i++)
			if (score[i] < 40)
				score[i] = 40;

		for (int i = 0; i < score.length; i++)
			sum += score[i];

		System.out.println(sum / 5);

		s.close();
	}
}