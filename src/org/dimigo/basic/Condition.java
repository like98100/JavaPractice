package org.dimigo.basic;
/*고속도로 통행료 계산
 * @author 윤 병창
 */
public class Condition {

	public static void main(String[] args) {
		String car = "고속버스";
		int kilo = 10;
		long money = 0;
		switch(car){
		case "고속버스":
			money = 850;
			break;
		case "경차" :
			money = 300;
			break;
		case "그 외" :
			money = 600;
			break;
			default :
				System.out.println("다른 차량을 골라주세요.");
				break;
		}
		if(kilo <= 0)	{
			System.out.println("음수와 0은 입력할 수 없습니다.");
			return;
		}
		
		switch(kilo % 10)	{
		
		case 0:	{
			
			switch(kilo / 10){
			
			case 1:
				break;
				
			default : {
				switch(car)	{
					
				case "고속버스":	{
						for(int plus = (int) (kilo / 10) -1; plus > 0; plus--)
							{
								money += 300;
							}
						break;
					}
				
				default :	{
					for(int plus = (int) (kilo / 10) - 1; plus > 0; plus--)
						{
							money += 200;
						}
					break;
					}
				}
					break;
			}
			
		}
			break;
			
		}
		
		default:	{


			switch(car)	{
			case "고속버스":	{
				for(int plus = (int) (kilo / 10); plus > 0; plus--)
				{
					money += 300;
				}
				break;
			}
				default:	{
					for(int plus = (int) (kilo / 10); plus > 0; plus--)
					{
						money += 200;
					}
					break;
		}
			}
		}
			}


		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + kilo + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + money + "원");
	}

}
