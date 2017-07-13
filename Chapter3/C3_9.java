
//n을 입력받고 1~n까지 합 출력

import java.util.Scanner;

public class C3_9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++)
			sum += i;

		System.out.println(sum);

		s.close();
	}
}