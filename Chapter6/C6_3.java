
/*
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.예를 들어, 10번 문제의 점수는 3이 된다.
"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
*/

import java.util.Scanner;

public class C6_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int c = s.nextInt();
		String str[] = new String[c];

		for (int i = 0; i < c; i++)
			str[i] = s.next();

		for (int i = 0; i < c; i++) {
			int sum = 0;
			int score[] = new int[str[i].length()];
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == 'O') {
					if (j == 0)
						score[0] = 1;
					else if (str[i].charAt(j - 1) == 'O')
						score[j] = score[j - 1] + 1;
					else
						score[j] = 1;
				} else
					score[j] = 0;

				sum += score[j];
			}
			System.out.println(sum);

		}
		s.close();
	}
}