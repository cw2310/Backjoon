
/*
세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
예를 들어 A = 150, B = 266, C = 427 이라면 
A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
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