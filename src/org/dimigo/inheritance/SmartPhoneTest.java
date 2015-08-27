/**
 * 
 */
package org.dimigo.inheritance;

/**
 *  <pre>
 * org.dimigo.inheritance
 * |_SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 27. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IPhone iphone = new IPhone("iPhone 6", "Apple", 700000);
		Galaxy galaxy = new Galaxy("Galaxy S6", "Samasung", 650000);

		System.out.println(iphone.toString());
		iphone.turnOn();
		iphone.pay();
		iphone.useSpecialFunctiin(iphone);
		iphone.turnOff();
		System.out.println("----------------------------");
		System.out.println(galaxy.toString());
		galaxy.turnOn();
		galaxy.pay();
		galaxy.useSpecialFunctiin(galaxy);
		galaxy.turnOff();

	}

}
