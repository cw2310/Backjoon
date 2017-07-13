//2007년 1월 1일이 월요일일때 2007년 x월 y일은 무슨 요일인지 출력

import java.util.Scanner;

public class C3_8 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int y = s.nextInt();
		int day = 0; //1월0일부터 날짜 수 (1월 1일은 day → 1)
		
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