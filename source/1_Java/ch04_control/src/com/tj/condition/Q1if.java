package com.tj.condition;
import java.util.Scanner;
//���� �Է¹޾� ���밪�� ����ϴ� ���α׷�
public class Q1if {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է��Ͻ� ���� ? ");
		int num = scanner.nextInt();
		if (num >= 0) {
			System.out.println("�Է��Ͻ� ���� ���밪�� " + num);
		} else {
			System.out.println("�Է��Ͻ� ���� ���밪�� " + (-num));
			// System.out.println("�Է��Ͻ� ���� ���밪�� "+(num * -1));
		} // if
	}// main
}// class
