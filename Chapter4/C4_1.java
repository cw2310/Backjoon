
//시험 점수를 입력받아 90이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지는 F 출력

import java.util.Scanner;

public class C4_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score = s.nextInt();
		char grade;

		switch (score / 10) {
			case 10:grade = 'A'; break;
			case 9:grade = 'A'; break;
			case 8:grade = 'B'; break;
			case 7:grade = 'C'; break;
			case 6:grade = 'D'; break;
			default:grade = 'F'; break;
		}
		
		System.out.println(grade);
		
		s.close();
	}
}