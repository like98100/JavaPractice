/**
 * 
 */
package org.dimigo.abstractclass;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



/**
 *  <pre>
 * org.dimigo.abstractclass
 * |_RequestProcessor
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 1. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class RequestProcessor {
	
	public static void main(String[] args) throws IOException	{
		RequestProcessor p = new RequestProcessor();
		InputStream is = p.getClass().getResourceAsStream("map.properties");
		
		if(is == null)	{
			System.out.println("Fail File Load");
		}
		else	{
			Properties prop = new Properties();
			prop.load(is);
			
			String actionName = prop.getProperty("insert");
		}
	}

}
