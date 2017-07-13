
//알파벳 대소문자로 이루어진 문자열 입력받고 한줄에 10글자씩 끊어서 출력

import java.util.Scanner;

public class C3_11 {
	public static void main(String[] args) {
		int cnt = 0;
		String str = new Scanner(System.in).next();

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));	//문자 하나씩 출력할때마다
			cnt++;								//cnt 증가
			if (cnt == 10) {			//10개 출력되면
				System.out.println();	//줄바꾸고
				cnt = 0;				//cnt 초기화
			}
		}
	}
}