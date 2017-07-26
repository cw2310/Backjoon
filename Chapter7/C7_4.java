
/*
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
단, 대문자와 소문자를 구분하지 않는다.
*/

import java.util.Scanner;

public class C7_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int[] a = new int[26]; // a[0]~a[25]에 A~Z 문자가 사용된 횟수 저장

		for (int i = 0; i < s.length(); i++) { // 'a' = 97, 'A' = 65
			if (s.charAt(i) > 96) // 대문자일때
				a[s.charAt(i) - 97]++;
			else 				// 소문자일때
				a[s.charAt(i) - 65]++;
		}

		int idx = 0; // idx:가장 많이 사용된 문자의 인덱스
		int max = a[0]; // max:문자 사용 횟수

		for (int i = 1; i < a.length; i++)
			if (max < a[i]) { // max보다 큰걸 찾으면
				max = a[i]; // max랑 idx 바꿈
				idx = i;
			}

		int cnt = 0; // 사용횟수가 max인 문자 개수

		for (int i = 0; i < a.length; i++)
			if (a[i] == max) //문자 사용 횟수가 max이면
				cnt++;		//cnt 증가

		if (cnt != 1) // 가장 많이 사용된 문자가 여러개면
			System.out.println("?"); //'?'출력
		else										// 하나면
			System.out.println((char) (idx + 65)); //max인 문자 출력

		sc.close();
	}
}