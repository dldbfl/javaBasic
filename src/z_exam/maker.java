package z_exam;

import java.util.Random;
import java.util.Scanner;

public class maker {
	
		
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = (int) (Math.random()*10+1);
		int b = (int) (Math.random()*10+1);
		
		System.out.println(a+" "+b);
		
		
		String numbers[] = {"b","f","c","v","b","f","v","b","n","10"};
		
		for(int i = 0; i < numbers.length * 10; i++){
			int random = (int)(Math.random()*numbers.length);
			
			String temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
		
		
		

		
		for(int i = 0; i < numbers.length-2;i++){
		
			System.out.println(numbers[i]);
			
		}
		
		
		
//		
//			System.out.print("체력. ");
//			for(int i =  1; i <= 10; i++){
//				if(i <= a){
//					System.out.print("■");
//				}else{
//					System.out.print("□");
//				}
//			}
//			System.out.println();
//			
//			b = Integer.parseInt(s.nextLine());
//			
//			
//			System.out.print("체력. ");
//			for(int i =  1; i <= 10; i++){
//				if(i <= b){
//					System.out.print("■");
//				}else{
//					System.out.print("□");
//				}
//			}
//			System.out.println();
//	
	
	
	
	
	
	}
	
}
