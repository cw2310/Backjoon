
//첫째 줄에 N을 입력하고 둘째 줄에 N개의 수를 공백없이 입력하면 N개의 한자리 수 합 출력

import java.util.Scanner;

public class C3_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int num[] = new int[n]; // 각 숫자 저장할 배열
		int sum = 0;

		String str = s.next(); // 숫자를 문자열로 받음

		for (int i = 0; i < n; i++) // 받은 문자열의 각 문자를 정수형 배열에 저장
			num[i] = str.charAt(i) - 48; // 0의 아스키코드 48

		for (int i = 0; i < n; i++)
			sum += num[i];

		System.out.println(sum);

		s.close();
	}
}