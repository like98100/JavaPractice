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
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException	{
		RequestProcessor p = new RequestProcessor();
		InputStream is = p.getClass().getResourceAsStream("map.properties");
		
		if(is == null)	{
			System.out.println("Fail File Load");
		}
		else	{
			Properties prop = new Properties();
			prop.load(is);
			
			String actionName = prop.getProperty("update");
			
			if(actionName == null)	{
				System.out.println("등록된 action 정보가 없습니다.");
				return;
			}
			
			//Action Class 객체 생성
			Class cls = Class.forName(actionName);
			Action action = (Action)cls.newInstance();
			
			action.execute();
		}
	}

}
