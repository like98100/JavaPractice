/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 *   |_ BMWEngine
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 27.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class BMWEngine extends Engine {

	public BMWEngine(String type) {
		super(type);
	}
	
	public void startEngine()		{
		System.out.println("Engine Start");
	}
	
	public void stopEngine()	{
		System.out.println("Engine Stop");
	}

	// 메소드 오버라이딩 : startEngine(), stopEngine()
	
}
