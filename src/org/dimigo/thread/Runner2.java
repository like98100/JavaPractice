/**
 * 
 */
package org.dimigo.thread;

import java.util.Random;

/**
 *  <pre>
 * org.dimigo.thread
 * |_Runner
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 4. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class Runner2 implements Runnable{

	private String name;
	private int meter = 100;
	
	public Runner2(String name)	{
		this.name = name;
	}
	
	@Override
	public void run()	{
		System.out.println(name + " 출발");
		for(int i = 0; i < 10; i++)	{
			 meter -= 10; 
			 System.out.printf("%s %d M \n", name, meter); 
			 System.out.println();
		}
		
		
		try {
			Thread.sleep(meter);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n" + name + " 골인");
		
	}
}
