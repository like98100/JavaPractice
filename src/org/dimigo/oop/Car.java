/**
 * 
 */
package org.dimigo.oop;

/**
 *  <pre>
 * org.dimigo.oop
 * |_Car
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 13. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class Car {

	private String Company = "현대자동차";
	private String Model = "제네시스";
	private String Color = "검정색";
	private int MaxSpeed = 225;
	private int Price = 50000000;
	/**
	 * @param args
	 */
	public String getCompany()	{
		return Company;
	}

	public String getModel(){
		return Model;
	}
	
	public String getColor()	{
		return Color;
	}
	
	public int getMaxSpeed()	{
		return MaxSpeed;
	}
	
	public int getPrice()	{
		return Price;
	}
	
	public void setCompany(String newCompany)	{
		Company = newCompany;
	}
	
	public void setModel(String newModel){
		Model = newModel;
	}
	
	public void setColor(String newColor){
		Color = newColor;
	}
	
	public void setMaxSpeed(int newMaxSpeed){
		MaxSpeed = newMaxSpeed;
	}
	
	public void setPrice(int newPrice){
		Price = newPrice;
	}
}
