package com.tj.question;
import java.util.Scanner;
// �Է��� �μ��� �񱳿����ڵ�(����, ũ��, �۴�, ũ�ų��۴�, �۰ų�����, �ٸ���)�� �̿��Ͽ�,
//    ���� �����  true�� O, false�� X�� ����Ͻÿ�
public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int num1 = scanner.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = scanner.nextInt();
		boolean result = num1 == num2;
		System.out.println("num1 == num2�� ����� "+ ( (result==true)? "O":"X") );
		result = num1 != num2;
		System.out.println("num1 != num2�� ����� "+ ( (result==true)? "O":"X") );
		result = num1 > num2;
		System.out.println("num1 > num2�� ����� "+ ( (result==true)? "O":"X") );
		result = num1 < num2;
		System.out.println("num1 < num2�� ����� "+ ( (result==true)? "O":"X") );
		scanner.close();
	}
}





