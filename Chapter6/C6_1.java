
/*
 ���� ��ҹ��ڿ� ���⸸���� �̷���� ������ �־�����. �� ���忡�� �� ���� �ܾ ������?
 �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �ܾ�� ���� �ϳ��� ���еȴٰ� �����Ѵ�.
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