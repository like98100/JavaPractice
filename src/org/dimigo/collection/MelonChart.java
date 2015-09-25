/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  <pre>
 * org.dimigo.collection
 * |_MelonChart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class MelonChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		
		System.out.println("<<Melon Chart>>");
		list.add(new Music("바람이나 좀 쐐", "개리"));
		list.add(new Music("보통연애", "박경"));
		list.add(new Music("취향저격", "iKON"));
		printList(list);
		
		System.out.println("<<2위 추가>>");
		list.add(new Music("레옹", "이유갓지"));
		printList(list);
		
		System.out.println("<<3위 변경>>");
		list.set(2, new Music("맙소사", "황태지"));
		printList(list);
		
		System.out.println("<<4위 삭제>>");
		list.remove(3);
		printList(list);
		
		System.out.println("<<전체 삭제>>");
		list.clear();
		printList(list);

	}
	
	public static void printList(List<Music> list)	{
		int c = 0;
		for(Music value : list)	{
			c++;
			System.out.println(c + ".  " + value);
		}
		System.out.println();
	}

}
