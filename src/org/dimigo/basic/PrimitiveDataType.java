package org.dimigo.basic;
/*<첫번째 수행평가 과제>
 * 내용 : 아이유의 프로필 출력하기
 * 작성일자 : 2015년 3월 13일
 * @author teacher
 * @version 1.0
 */
public class PrimitiveDataType {

	public static void main(String[] args) {
		//코딩 발암
		int age = 23;	//나이
		boolean female = true; //성별
		double high = 161.8; //키
		float weight = 44.3f; //몸무게
		char blood = 'A'; //혈액형
		String name = "아이유"; //이름
		
		System.out.println("<<아이유 프로필>>");	//제목
		System.out.printf("이름 : ");	//이름
		System.out.println(name);	//출력
		if(female) {
			System.out.println("성별 : 여자");	//true 일 때 여자 출력
		} else {
			System.out.println("성별 : 남자");	//false일 때 남자 출력
		}
		System.out.printf("키 : %.1f Cm\n", high);	//키 출력
		System.out.printf("몸무게 : %.1f Kg\n", weight);	//몸무게 출력
		System.out.printf("혈액형 : %c 형\n", blood);	//혈액형 출력
		

	}

}
