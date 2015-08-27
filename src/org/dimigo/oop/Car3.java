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
public class Car3 {

	private String Company;
	private String Model;
	private String Color;
	private int MaxSpeed;
	private int Price;
	/**
	 * @param args
	 */
	
	public Car3(String Company, String Model, String Color, int MaxSpeed, int Price)	{
		this.Company = Company;
		this.Model = Model;
		this.Color = Color;
		this.MaxSpeed = MaxSpeed;
		this.Price = Price;
	}
	
	public Car3(String Company, String Model, String Color, int MaxSpeed)	{
		this(Company, Model, Color, MaxSpeed, 0);
	}
	
	public Car3(String Company, String Model, String Color)	{
		this(Company, Model, Color, 0, 0);
	}
	
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
	
//	public void setCompany(String newCompany)	{
//		Company = newCompany;
//	}
//	
//	public void setModel(String newModel){
//		Model = newModel;
//	}
//	
//	public void setColor(String newColor){
//		Color = newColor;
//	}
//	
//	public void setMaxSpeed(int newMaxSpeed){
//		MaxSpeed = newMaxSpeed;
//	}
//	
//	public void setPrice(int newPrice){
//		Price = newPrice;
//	}
}
