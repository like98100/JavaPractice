/**
 * 
 */
package org.dimigo.exception;

/**
 *  <pre>
 * org.dimigo.exception
 * |_MovieTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 22. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class MovieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try	{
			Movie[] movies = {
					new Movie("앤트맨", 12), new Movie("사도", 12), new Movie("베테랑", 15)
			};
			int age = 13;
			for(Movie movie : movies)	{
				buyTicket(movie, age);	//여기서 예외 던짐
			}
		}	catch(Exception e)		{
			System.out.println(e.getMessage());
		}

	}
	
	public static void buyTicket(Movie movie, int age)	throws AgeCheckException{
	if(movie.getLimitAge() > age)	throw new AgeCheckException(movie);
		else	System.out.println(movie.getTitle() + " 영화 즐감하세요");
	}

}
