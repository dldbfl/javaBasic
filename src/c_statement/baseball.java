package c_statement;

import java.util.Scanner;

public class baseball {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
				
		int q1 = (int)(Math.random()*9+1);
		int q2 = 0;
			q2 = (int)(Math.random()*9+1);
		while(q1==q2) 
			q2 = (int)(Math.random()*9+1);
		int q3 = 0;	
			q3 = (int)(Math.random()*9+1);
		while(q3==q2||q3==q1)
			q3 = (int)(Math.random()*9+1);
						
		int count = 0;
		int strike = 0;
		int ball = 0;
		int out = 0;
		int input = 0;
		int a = 0;
		int b = 0;
		int c = 0;
				
		do{ 
			count++;
			System.out.println("\n숫자를  입력해주세요");
			input = s.nextInt();
						
			while(input != 0){
								a = input % 10;
								input = input/10;
								b = input % 10;
								input = input/10;
								c = input % 10;
								input = input/10;
								System.out.println(c+""+b+""+a);
								}	
				
			if(a==b||b==c||c==a) 
			System.out.println("숫자가 겹치면 안되오.");
		
			if(c == q1) strike++; 
			else if (c == q2 || c == q3) ball++;
			else out++;
					
			if(b == q2) strike++; 
			else if (b == q1 || b == q3) ball++;
			else out++;
				
			if(a == q3) strike++; 
			else if (a == q1 || a == q2) ball++;
			else out++;
			
			System.out.print(strike+"S "+ball+"B "+out+"O");
			
			strike=0;
			ball=0;
			out=0;
					
			} while(c!=q1||b!=q2||a!=q3);
		System.out.println("\n"+q1+""+q2+""+q3);
		System.out.println("정답입니다.");
		System.out.println("총 횟수는  "+count);
	}
}
