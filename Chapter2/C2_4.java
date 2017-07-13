
//두 수 A,B 입력받고 A/B 출력

import java.util.*;

public class C2_4 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a, b;

		a = s.nextInt();
		b = s.nextInt();

		System.out.println((double)a / b);
		
		s.close();
	}
}