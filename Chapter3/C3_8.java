//2007�� 1�� 1���� �������϶� 2007�� x�� y���� ���� �������� ���

import java.util.Scanner;

public class C3_8 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int y = s.nextInt();
		int day = 0; //1��0�Ϻ��� ��¥ �� (1�� 1���� day �� 1)
		
		for(int mon = 1; mon < x; mon++){
			if(mon == 4||mon == 6||mon == 9||mon == 11)
				day += 30;
			else if(mon == 2)
				day += 28;
			else
				day += 31;
		}
		
		day += y;
		
		switch(day % 7){
			case 0: System.out.println("SUN"); break;	
			case 1: System.out.println("MON"); break;
			case 2: System.out.println("TUE"); break;
			case 3: System.out.println("WED"); break;
			case 4: System.out.println("THU"); break;
			case 5: System.out.println("FRI"); break;
			case 6: System.out.println("SAT"); break;
		}
		s.close();
	}
}