package com.tj.question;
import java.util.Scanner;
// (��������2) �Է��� ���� ¦������ Ȧ������ ���
public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��� ���� ?");
		int number = sc.nextInt();
		System.out.println(number%2==0? "¦�� �Է��Ͻ�":"Ȧ�� �Է��Ͻ�");
		sc.close();
	}
}