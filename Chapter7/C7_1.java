
//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class C7_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char c[] = str.toCharArray();
		System.out.println((int)c[0]);
		
		s.close();
	}
}