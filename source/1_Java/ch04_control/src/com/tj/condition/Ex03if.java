package com.tj.condition;
import java.util.Scanner;
// �μ��� �Է¹޾� ���° ���� ��ū�� �׸��� �� ū ���� ���
public class Ex03if {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù���� ���� ?");
		int num1 = scanner.nextInt();
		System.out.print("�ι�° ���� ?");
		int num2 = scanner.nextInt();
		if(num1>num2) {
			System.out.println("ù��° �Է��� �� ("+num1+")�� �� Ŀ");
		}else if(num1 <num2) {
			System.out.println("�ι�° �Է��� �� ("+num2+")�� �� Ŀ");
		}else {
			System.out.println("���� ���� �ι� �Է��߳�");
		} // if-else
		scanner.close();
	} // main
} // class