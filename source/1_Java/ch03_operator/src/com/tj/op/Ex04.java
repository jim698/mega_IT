package com.tj.op;
//�������� (AND, OR => &&, ||)
public class Ex04 {
	public static void main(String[] args) {
		int i=1, j=10, h=10;
		System.out.println("&&(AND) (i>j) && (++j>h) : "+((i>j) && (++j>h)));
		//                                                  F   &&  T
		System.out.println(j); // &&�������� ������ false�� ��� ���� ���� �� ��
		System.out.println("||(OR) (i>j) || (++j>h) : "+((i<j) || (++j>h)));
		//                                                 T   ||  T
		System.out.println(j); // ||�������� ������ true�� ��� ���� ���� �� ��
	}
}
