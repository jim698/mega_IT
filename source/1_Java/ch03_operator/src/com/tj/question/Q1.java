package com.tj.question;
import java.util.Scanner;
// ����ڷκ��� ������ �Է¹޾� 3�ǹ������ �ƴ��� ���
public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է��ϰ��� �ϴ� �������� ? ");
		int i = scanner.nextInt(); // Ű����κ��� ������ �Է�
		System.out.println(i%3==0 ? "3�� �����":"3�ǹ���� �ƴϱ�");
		scanner.close();
	}
}
