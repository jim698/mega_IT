package com.tj.question;
import java.util.Scanner;
//�ֹι�ȣ 7��° �ڸ����� �Է¹޾� �������� �������� ����ϼ���
public class Q5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ֹι�ȣ 7��° �ڸ��� ?");
		int no = scanner.nextInt();
		String result = (no==1 || no==3)? "����" : 
					(no==2 || no==4) ? "����" : "����";
		System.out.println(result);
		scanner.close();
	}
}