/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 *  <pre>
 * org.dimigo.oop
 * |_Question
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 11. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("마비노기 영웅전의 북미 이름은?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		
		if("Vindictus".equalsIgnoreCase(answer))	System.out.println("Good");
		else	System.out.println("Wrong");
		
		System.out.println("Cytus 와 Deemo 를 개발한 회사는?");
		scanner = new Scanner(System.in);
		answer = scanner.nextLine();
		
		if("Rayark".equalsIgnoreCase(answer))	System.out.println("Good");
		else	System.out.println("Wrong");
		
		System.out.println("대한민국에서 가장 못 만든 애니메이션의 영어 이름은?");
		scanner = new Scanner(System.in);
		answer = scanner.nextLine();
		
		if("Gimchi Worrier".equalsIgnoreCase(answer))	System.out.println("Good");
		else	System.out.println("Wrong");

	}

}
