
/*
���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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