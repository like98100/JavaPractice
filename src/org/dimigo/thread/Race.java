/**
 * 
 */
package org.dimigo.thread;

/**
 *  <pre>
 * org.dimigo.thread
 * |_Race
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 4. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		Thread Ook = new Runner("욱재");
		Thread UU = new Runner("어진");
		
		UU.setPriority(Thread.MAX_PRIORITY);
		Ook.setPriority(Thread.MIN_PRIORITY);
		
		Ook.start();		UU.start();
		
		System.out.println("Main Thread End");

	}

}
