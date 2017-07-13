
//자연수 N을 입력받고 1~N 까지 한줄씩 출력

import java.util.Scanner;

public class C3_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 1; i <= n; i++)
			System.out.println(i);

		s.close();
	}
}