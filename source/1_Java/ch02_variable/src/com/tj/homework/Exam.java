package com.tj.homework;
// ��, ��, ��, ����, ���
public class Exam {
	public static void main(String[] args) {
		int kor = 100;
		int eng = 99;
		int mat = 100;
		int tot = kor + eng + mat; // ����
//		double avg = (double)tot / 3;
		double avg = tot / 3.0;
		System.out.println("���� : "+kor+"\t���� : "+eng+"\t���� : "+mat);
		System.out.printf("���� : %d\t��� : %.2f\n", tot, avg);		
	}
}
