package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
	int num = 1;
	
	for(int i = 0; i < 10; i++)	{
		for(int j = 1; j <= 10; j++)	{
			if(num == j)	{
				System.out.printf("*");
			}	else	{
				System.out.printf("%d", j);
				
			}
		}
		System.out.println(" ");
		num++;
	}
	
	
	}

}
