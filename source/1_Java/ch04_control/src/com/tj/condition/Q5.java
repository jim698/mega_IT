package com.tj.condition;
import java.util.Scanner;
// you = 0,1,2(����������) computer=0,1,2
public class Q5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����(0),����(1),��(2) �� �ϳ��� �����ϼ��� : ");
		int you = scanner.nextInt(); // you�� 0,1,2 �� �ϳ� ����
		// 0 <= Math.random() <1 �� ������ �Ǽ��� �߻� 
		// 0 <= Math.random()*3 <3
		// (int)(Math.random*3) => 0,1,2 �� ������ �ϳ��� ���� ����
		int computer = (int)(Math.random()*3);
		if(you==0) {
			System.out.println("����� ����");
		}else if(you ==1) {
			System.out.println("����� ����");
		}else if(you ==2 ){
			System.out.println("����� ���ڱ�");
		}else {
			System.out.println("��ȿ���� �ʴ� ���Դϴ�");
			you = 3;
		}
		scanner.close();
		if(you!=3) {
			if(computer==0) {
				System.out.println("��ǻ�ʹ� ����");
			}else if(computer==1) {
				System.out.println("��ǻ�ʹ� ����");
			}else {
				System.out.println("��ǻ�ʹ� ���ڱ�");
			}
			// ���� �̰���� ���
			if((you +2 )%3 == computer) {
				System.out.println("����� �̰��");
			}else if(you==computer) {
				System.out.println("����");
			}else {
				System.out.println("��ǻ�Ͱ� �̰��");
			}
			/*
			 * if(you==0) { // ����� ���� if(computer==0) { System.out.println("����"); }else
			 * if(computer==1) { System.out.println("��ǻ�Ͱ� �̰��"); }else {
			 * System.out.println("����� �̰��"); } }else if(you==1) {//����� ���� if(computer==0) {
			 * System.out.println("����� �̰��"); }else if(computer==1) {
			 * System.out.println("����"); }else { System.out.println("��ǻ�Ͱ� �̰��"); } }else
			 * if(you==2) {// ����� ���ڱ� if(computer==0) { System.out.println("��ǻ�Ͱ� �̰��");
			 * }else if(computer==1) { System.out.println("����� �̰��"); }else {
			 * System.out.println("����"); } }
			 */
		}//if - you!=3
	}
}









