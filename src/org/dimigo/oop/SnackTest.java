/**
 * 
 */
package org.dimigo.oop;

/**
 *  <pre>
 * org.dimigo.oop
 * |_SnackTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 19. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack snack = null;
		Snack[] Snack = new Snack[]	{new Snack("콘칲", "오리온", 1, 1)};
		
		System.out.println("이름 : " + snack.getName());
		System.out.println("제조사 : " + snack.getCompany());
		System.out.println("가격 : " + String.format("%,d", snack.getPrice()) + "원");
		System.out.println("개수 : " + snack.getName() + "개");
		System.out.println();
	}

}
