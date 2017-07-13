
//두 수 A,B 입력받고 (A+B)(A-B)(A*B)(A/B 몫)(A%B) 출력

import java.util.*;

public class C2_5 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a, b;

		a = s.nextInt();
		b = s.nextInt();

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		s.close();
	}
}