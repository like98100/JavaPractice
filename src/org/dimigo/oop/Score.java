/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 *  <pre>
 * org.dimigo.oop
 * |_Score
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 12. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("국어 점수 입력");
		Scanner scanner = new Scanner(System.in);
		int kor = scanner.nextInt();
		
		System.out.println("수학 점수 입력");
		scanner =  new Scanner(System.in);
		int mat = scanner.nextInt();
		
		System.out.println("영어 점수 입력");
		scanner = new Scanner(System.in);
		int eng = scanner.nextInt();
		
		StringBuilder sb = new StringBuilder("국어 점수 : ")
		.append(kor + "점\n")
		.append("수학 점수 : ").append(mat + "점\n")
		.append("영어 점수 : ").append(eng + "점\n")
		.append("총점 : ").append((kor + mat + eng) + "점\n")
		.append("평균 : ").append(String.format("%.1f", (double)(kor + mat + eng)/3) + "점\n");
		System.out.println(sb);
		

	}

}
