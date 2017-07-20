
/*
 영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 이 문장에는 몇 개의 단어가 있을까?
 이를 구하는 프로그램을 작성하시오. 단, 단어는 띄어쓰기 하나로 구분된다고 생각한다.
 */

import java.util.Scanner;

public class C6_1 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int cnt = 1;
		
		String str = s.nextLine();
		
		char a[] = new char[str.length()];
		
		for(int i=0; i<a.length; i++)
			a[i] = str.charAt(i);
		
		for(int i=0; i<a.length; i++)
			if(a[i] == ' ')
				cnt++;
		
		System.out.println(cnt);
		
		s.close();
	}
}