package com.eoe.basic.day03.Exercise;

import java.util.Scanner;

public class Exercise13 {
	/**
	 * 键盘输入一个5分制分数，用或运算计算并显示该数是否为5分制的分数。
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个五分制分数：");
		int score = scanner.nextInt();
		boolean isnotScore = score < 0 || score > 5;
		System.out.println("不是五分制分数：" + isnotScore);

	}
}
