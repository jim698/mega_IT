package com.tj.condition;
import java.util.Scanner;
//���������� �� �ϳ��� ���� �� ���� ����ϼ���(��, ����ڴ� ������ ������ �� ���� 0�� �Է��ϰ� ������ �����ϰ��� �� ���� 1�� �Է��ϰ�, ���� �����ϰ��� �� ���� 2�� �Է�)
public class Q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����(0),����(1),��(2) �� �ϳ��� �����ϼ��� : ");
		int you = scanner.nextInt(); // 0,1,2
		if(you==0) {
			System.out.println("����� ����");
		}else if(you ==1) {
			System.out.println("����� ����");
		}else if(you ==2 ){
			System.out.println("����� ���ڱ�");
		}else {
			System.out.println("��ȿ���� �ʴ� ���Դϴ�");
		}
		scanner.close();
	}
}
