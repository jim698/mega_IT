package com.tj.condition;
import java.util.Scanner;
//����ڷκ��� ����, ����, ���� ������ �Է¹޾� �� ���� ������ ��� �̻����� �̸����� ����� ����
public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ?");
		int kor = scanner.nextInt();
		System.out.print("���� ?");
		int eng = scanner.nextInt();
		System.out.print("���� ?");
		int mat = scanner.nextInt();
		double avg = (kor+eng+mat) / 3.0;
		if(kor>=avg) {
			System.out.printf("����� ���(%.2f)�̻�", avg);
		}else {
			System.out.printf("����� ���(%.2f)�̸�", avg);
		}//if-kor
		if(eng>=avg) {
			System.out.println("����� ����̻�");
		}else {
			System.out.println("����� ��չ̸�");
		}//if - eng
		if(mat>=avg) {
			System.out.println("������ ����̻�");
		}else {
			System.out.println("������ ��չ̸�");
		}//if-mat
		scanner.close();
	}//main
}//class
