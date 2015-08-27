/**
 * 
 */
package org.dimigo.oop;

/**
 *  <pre>
 * org.dimigo.oop
 * |_Snack
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 19. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class Snack {
		
		private String Name = "새우깡";
		private String Company = "농심";
		private int Price = 1100;
		private int Number = 2;
		
		public Snack(String Name, String Company, int Price, int Number)
		{
			this.Name = Name;
			this.Company = Company;
			this.Price = Price;
			this.Number = Number;
		}
		
		public String getName(){
			return Name;
		}
		
		public String getCompany()	{
			return Company;
		}
		
		public int getPrice()	{
			return Price;
		}
		
		public int getNumber()	{
			return Number;
		}
		
		public void setName(String newName){
		Name = newName;
	}
	
	public void setCompany(String newCompany){
		Company = newCompany;
	}
	
	public void setPrice(int newPrice){
		Price = newPrice;
	}
	
	public void setNumber(int newNumber){
		Number = newNumber;
	}
}
