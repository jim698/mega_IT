package com.tj.op;
// �Ҵ�(����)������ =, +=, -=, *=, /=, %=
public class Ex06 {
	public static void main(String[] args) {
		int n1 = 10*3; // n1 = 30
		n1 += 10; // n1 = n1 + 10 (40)
		n1 -= 10; // n1 = n1 - 10 (30)
		n1 *= 10; // n1 = n1 * 10 (300)
		n1 /= 10; // n1 = n1 / 10 (30)
		n1 %= 10; // n1 = n1 % 10 (0)
		System.out.println(n1);
	}
}
