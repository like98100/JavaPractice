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
 * |_MelonGenreChart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 24. 
 * </pre>
 *
 * @author : 윤병창
 * @version : 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		
		System.out.println("<<Melon Genre Chart>>");
		
		List<Music> balad = new ArrayList<>();
		map.put("Ganre", (List<Music>)balad);
		balad.add(new Music("내 첫사랑", "베리굿"));
		balad.add(new Music("또 다시 사랑", "임창정"));
		balad.add(new Music("부산에 가면", "박진연"));
		
		List<Music> dance = new ArrayList<>();
		map.put("Dance", (List<Music>)dance);
		dance.add(new Music("커피", "유재환, 김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
		
		printMap(map);
		
		System.out.println("<<발라드 3위 변경>>");
		balad.set(2, new Music("지우고 지워도", "차수경"));
		printMap(map);
		
		System.out.println("<<발라드 1위 삭제>>");
		balad.remove(0);
		printMap(map);
		
		System.out.println("<<전체 삭제>>");
		map.clear();
		balad.clear();
		dance.clear();
		
		
	}
	
	public static void printMap(Map<String, List<Music>> map){
		int i = 0;
		for(String key : map.keySet())	{
			System.out.println("[" + key + "]");
			for(Music m : map.get(key))	{
				i++;
				System.out.println(i + ". " + m.toString());
			}
			i = 0;
		}
		System.out.println();
		
	}

}
