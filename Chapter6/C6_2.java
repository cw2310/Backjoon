
/*
�� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ��� A = 150, B = 266, C = 427 �̶�� 
A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
*/

import java.util.Scanner;

public class C6_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int cnt[] = new int[10];

		Integer abc = a * b * c;

		String str = abc.toString();

		for (int i = 0; i < str.length(); i++) {
			switch ((int) (str.charAt(i) - 48)) {
			case 0: cnt[0]++; break;
			case 1: cnt[1]++; break;
			case 2: cnt[2]++; break;
			case 3: cnt[3]++; break;
			case 4: cnt[4]++; break;
			case 5: cnt[5]++; break;
			case 6: cnt[6]++; break;
			case 7: cnt[7]++; break;
			case 8: cnt[8]++; break;
			case 9: cnt[9]++; break;
			default: 
			}
		}
		for(int i=0; i<cnt.length; i++)
				System.out.println(cnt[i]);

		s.close();
	}
}