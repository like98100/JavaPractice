/**
 * 
 */
package org.dimigo.inheritance;

/**
 *  <pre>
 * org.dimigo.inheritance
 * |_IPhone
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 27. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class IPhone extends SmartPhone{
	public IPhone()	{
		
	}
	
	public IPhone(String model, String company, int price)	{
		super(model, company, price);
	}
	
	public void pay()	{
		System.out.printf("Apple");
		super.pay();
	}
	
	public void useAirDrop()	{
		System.out.println("AirDrop 기능을 사용합니다.");
	}

}
