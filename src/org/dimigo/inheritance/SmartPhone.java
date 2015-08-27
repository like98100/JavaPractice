/**
 * 
 */
package org.dimigo.inheritance;

/**
 *  <pre>
 * org.dimigo.inheritance
 * |_SmartPhone
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 27. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone()	{
		
	}
	
	public SmartPhone(String model, String company, int price)	{
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn()	{
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff()	{
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public void pay()	{
		System.out.println(" 페이로 결제합니다.");
	}
	
	public void useSpecialFunctiin(SmartPhone phone)	{
		if(phone instanceof IPhone)	((IPhone)phone).useAirDrop();
		else if(phone instanceof Galaxy)	((Galaxy)phone).useWirelessCharging();
	}

	public String toString() {
		return "Model : " + model + ", Company : " + company + ", Price : " + String.format("%,d", price) + "￦";
	}
	
	

}
