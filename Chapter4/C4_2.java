
//세 정수 입력받고 두번째로 큰 정수 출력

import java.util.Scanner;

public class C4_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a >= b && a <= c || a <= b && a >= c)
			System.out.println(a);
		else if (b >= a && b <= c || b <= a && b >= c)
			System.out.println(b);
		else
			System.out.println(c);

		s.close();
	}
}