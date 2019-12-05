package e_oop;

import java.util.Scanner;

public class SimLiTset {

	

	public static void main(String[] args) {
			String i = null;
			Scanner s = new Scanner(System.in);
			new SimLiTset().question1(i);
			i = s.nextLine();
			
	}	
	
	Scanner s = new Scanner(System.in);
	
	String[] question ={
						"1.나는 금방 사랑에 빠진다.",
						"2.연애할 때 끌려다니는 타입이다.",
						"3.데이트 코스는 미리 짜는게 편하다.",
						"4.감정기복이 크지않다.",
						"5.감정표현에 솔직한 편이다.",
						"6.활동적인 데이트가 좋다.",
						"7.연락이 없어도 믿고 기다리는 편이다.",
						"8.이성친구는 존재할 수 없다.",
						"9.아무것도 아닌 일에 쉽게 섭섭함이 쌓인다."
						};
	void question1(String i){
		
		System.out.println(question[0]);
		i = s.nextLine();
		if (i.equals("y")){
			question2(i);
		}
		else{
			question4(i);	
		}
	   }
	void question2(String i){
	
		System.out.println(question[1]);
		i = s.nextLine();
		if (i.equals("y")){
			new SimLiTset().question5(i);
		}
		else {
			new SimLiTset().question3(i);	
		}
	   }
	void question3(String i){
	
		System.out.println(question[2]);
		i = s.nextLine();
		if (i.equals("y")){
			new SimLiTset().question6(i);
		}
		else{
			new SimLiTset().question5(i);	
		}
	   }
	void question4(String i){
	
		System.out.println(question[3]);
		i = s.nextLine();
		if (i.equals("y")){
			new SimLiTset().question7(i);
		}
		else{
			new SimLiTset().question5(i);	
		}
	   }
	void question5(String i){
	
		System.out.println(question[4]);
		i = s.nextLine();
		if (i.equals("y")){
			new SimLiTset().question8(i);
		}
		else{
			new SimLiTset().question6(i);	
		}
	   }
	void question6(String i){

		System.out.println(question[5]);
		i = s.nextLine();
		if (i.equals("y")){
			new SimLiTset().question8(i);
		}
		else{
			new SimLiTset().question9(i);	
		}
	   }
	void question7(String i){
	
		System.out.println(question[6]);
		i = s.nextLine();
		if (i.equals("y")){
			new SimLiTset().question10(i);
		}
		else{
			new SimLiTset().question8(i);	
		}
	   }
	void question8(String i){

		System.out.println(question[7]);
		i = s.nextLine();
		if (i.equals("y")){
			new SimLiTset().question9(i);
		}
		else{
			new SimLiTset().question11(i);	
		}
	   }
	void question9(String i){
	
		System.out.println(question[8]);
		i = s.nextLine();
		if (i.equals("y")){
			new SimLiTset().question13(i);
		}
		else{
			new SimLiTset().question12(i);	
		}
	   }
	void question10(String i){
		
		System.out.println("A타입");
		
	   }
	void question11(String i){
		System.out.println("B타입");
		
	   }
	void question12(String i){
		System.out.println("C타입");
		
	   }
	void question13(String i){
		System.out.println("D타입");
		
	   }
	
	

}
