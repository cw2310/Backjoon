
//���� ������ �Է¹޾� 90�̻� A, 80�̻� B, 70�̻� C, 60�̻� D, �������� F ���

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