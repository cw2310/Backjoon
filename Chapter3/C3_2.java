
//자연수 N을 입력받고 N~1 까지 한줄씩 출력

import java.util.Scanner;

public class C3_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = n; i >= 1; i--)
			System.out.println(i);

		s.close();
	}
}