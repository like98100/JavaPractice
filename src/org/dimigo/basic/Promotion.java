package org.dimigo.basic;

/**
 *<< 2차 수행평가>>
 * 디미베네의 연간 인건비를 계산하기
 * 작성일자 : 2015년 3월 17일
 * @author 윤병창
 *
 */
public class Promotion {

	public static void main(String[] args) {
		int worker = 3;
		long month = 1700000;
		long cafe = 1500;
		long year = month * 12 * worker * cafe;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.printf("월 평균 급여 : " +String.format("%,d", month)+"원");
		System.out.printf("\n점포 내 직원 수 : ");
		System.out.println(worker + " 명");
		
		System.out.println("점포 수 : "+String.format("%,d", cafe)+"개");
		System.out.println("연간 인건비 : "+String.format("%,d", year)+"원");
	}

}
