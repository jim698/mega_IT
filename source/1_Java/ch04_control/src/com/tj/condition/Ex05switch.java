package com.tj.condition;
import java.util.Scanner;
// �Է��� ���� ¦������ Ȧ������ ���(switch)
public class Ex05switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է��� ��?");
		int num = scanner.nextInt();
		switch(num%2) {
		case 0 : System.out.println("¦���� �Է��ϼ̳�");break;
		default: System.out.println("Ȧ���� �Է��ϼ̳�");
		}
	}
}
