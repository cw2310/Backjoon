
//���ĺ� ��ҹ��ڷ� �̷���� ���ڿ� �Է¹ް� ���ٿ� 10���ھ� ��� ���

import java.util.Scanner;

public class C3_11 {
	public static void main(String[] args) {
		int cnt = 0;
		String str = new Scanner(System.in).next();

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));	//���� �ϳ��� ����Ҷ�����
			cnt++;								//cnt ����
			if (cnt == 10) {			//10�� ��µǸ�
				System.out.println();	//�ٹٲٰ�
				cnt = 0;				//cnt �ʱ�ȭ
			}
		}
	}
}