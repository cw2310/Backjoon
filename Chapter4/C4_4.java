
//시험본 과목 수 N을 입력받고 점수를 입력한 후 시험 점수중 최대값을  M이라 하고 모든 점수를 (점수/M*100)으로 고친 후 평균 출력(셋째자리 반올림)

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
		for (int i = 1; i < n; i++) // 최대값 찾기
			if (score[i] > m)
				m = score[i];

		for (int i = 0; i < n; i++) // 점수 조작
			score[i] = score[i] / m * 100;

		for (int i = 0; i < n; i++) // 점수 합
			sum += score[i];
										// 평균값 소수점 셋째자리 반올림 해서 출력
		System.out.println((double) Math.round((sum / n) * 100) / 100);

		s.close();
	}
}