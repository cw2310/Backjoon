
//두 수 A,B 입력받고 A+B 출력	(0<A, B<10), (A+B<10)

import java.util.*;

public class C2_7 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a, b;

		a = s.nextInt();
		if(a<=0) return;
		
		b = s.nextInt();
		if(b>=10) return;
		
		if(a+b>=10) return;
		System.out.println(a + b);
		
		s.close();
	}
}