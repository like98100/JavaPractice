/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 *  <pre>
 * org.dimigo.io
 * |_SaveImageFromUrl
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 22. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String imageUrl = "http://thumbnail.egloos.net/460x0/http://pds27.egloos.com/pds/201410/22/24/c0045924_54473620c74d1.jpg";		//자신이 좋아하는 이미지 링크 가져오기
		
		try{
		URL url = new URL(imageUrl);
		
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream("Files/him.jpg");
		
		//File에 write 
		byte buf[]	=	 new byte[2048];
		
		int result;
		
		while((result = is.read(buf)) != -1)		{
			os.write(buf, 0, result);
		}
		System.out.println("Copy Complete");
		
		}	catch(Exception e)	{
			e.printStackTrace();
		}
	}

}
