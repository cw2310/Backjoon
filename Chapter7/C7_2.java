
/*
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class C7_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] a = new int[26];

		for (int i = 0; i < a.length; i++)
			a[i] = -1;

		for (int i = 0; i < s.length(); i++)
			if (a[s.charAt(i) - 97] == -1) // 'a' = 97
				a[s.charAt(i) - 97] = i;

		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		sc.close();
	}
}