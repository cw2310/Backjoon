
/*
어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
*/

import java.util.Scanner;

public class C5_2 {
	static boolean HS(Integer i) { // i가 한수이면 true
		String str = new String(i.toString());
		if (str.length() <= 2)
			return true;

		for (int j = 0; j < str.length() - 2; j++)
			if (str.charAt(j + 1) - str.charAt(j) != str.charAt(j + 2) - str.charAt(j + 1))
				return false;

		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			if (HS(i) == true)
				cnt++;
		}
		System.out.println(cnt);

		s.close();
	}
}