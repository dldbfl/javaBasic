package z_exam;

import java.util.Scanner;

public class maker {
	
	int Str, Int, Dex, Luc;
		
	
	maker(){
		Str = (int) (Math.random()*10+1);
		Int = (int) (Math.random()*10+1);
		Dex = (int) (Math.random()*10+1);
		Luc = (int) (Math.random()*10+1);
	}
	
	void state(){
		
		System.out.print("체력. ");
		for(int i =  1; i <= 10; i++){
			if(i <= Str){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
		System.out.print("지능. ");
		for(int i =  1; i <= 10; i++){
			if(i <= Int){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
		System.out.print("민첩. ");
		for(int i =  1; i <= 10; i++){
			if(i <= Dex){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
		System.out.print("행운. ");
		for(int i =  1; i <= 10; i++){
			if(i <= Luc){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
	}
	
	void disease(){
		String disease[]= {"복통","두통","과제","탈진","코피","졸음"};
		for(int i = 0; i < disease.length * 10; i++){
			int random = (int)(Math.random()*disease.length);
			String temp = disease[0];
			disease[0] = disease[random];
			disease[random] = temp;
			
		}
		System.out.println(disease);
		if(disease.equals("복통")){
			Str = Str-2;
		}
		else if(disease.equals("두통")){
			Int = Int-2;
		}
		else if(disease.equals("과제")){
			Int = Int+1;
		}
		else if(disease.equals("탈진")){
			Str = Str-1;
		}
		else if(disease.equals("코피")){
			Dex = Dex-1;
			Str = Str-1;
		}
		else if(disease.equals("졸음")){
			Str = Str-2;
			Dex = Dex-2;
			Int = Int-2;
			
		}
		
	}
	
	void lucky(){
		String lucky[]= {"축복","물주기","쓰다듬기","칭찬","광합성"};
		for(int i = 0; i < lucky.length * 10; i++){
			int random = (int)(Math.random()*lucky.length);
			String temp = lucky[0];
			lucky[0] = lucky[random];
			lucky[random] = temp;
			
		}
		System.out.println(lucky);
		if(lucky.equals("축복")){
			Str = Str+2;
		}
		else if(lucky.equals("물주기")){
			Int = Int-2;
		}
		else if(lucky.equals("쓰다듬기")){
			Int = Int+1;
		}
		else if(lucky.equals("칭찬")){
			Str = Str-1;
		}
		else if(lucky.equals("광합성")){
			Dex = Dex-1;
			Str = Str-1;
		}
		
	}
	
	String coin(){
		String coin[]= {"앞면","뒷면"};
		for(int i = 0; i < coin.length * 10; i++){
			int random = (int)(Math.random()*coin.length);
			String temp = coin[0];
			coin[0] = coin[random];
			coin[random] = temp;
			
		}
		System.out.println(coin[0]);
		return coin[0];
	
	}
			
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
				
/*		String Q1 = "캐릭터를 생성하시겠습니까?";
		String Q1_1 = "[주의]님 동의??";
				
		System.out.println(Q1+"Y/N");
		String answer = s.nextLine();

		if(answer.equals("Y")||answer.equals("y")){
			System.out.println(Q1_1+"Y/N");
			answer = s.nextLine();
			if(answer.equals("Y")||answer.equals("y")){*/
		
		System.out.println("이름을 입력해주세요.");
		String input = s.nextLine();
		System.out.println(input);
		
		
		
		maker mk = new maker();
		mk.state();
		
//		System.out.println(mk.coin());
//		System.out.println();
		
		mk.disease();
//		if(mk.coin().equals("뒷면")){
//			mk.disease();
//		}
//		else if(mk.coin().equals("앞면")){
//			mk.lucky();
//				
//		}
			
		
		
		

		
		String numbers[] = {"집가기","복습","복습","복습","복습","예습","복습","복습","복습","복습"};
		
		for(int i = 0; i < numbers.length * 10; i++){
			int random = (int)(Math.random()*numbers.length);
			
			String temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
			
		}
		
		String night[] = {"자바 1장 연습문제", "자바 2장 연습문제", "자바 3장 연습문제", "자바 4장 연습문제","자바 5장 연습문제",
							"Git 전반적인 응용"};
		
	
		for(int i = 0; i < night.length * 10; i++){
			int random2 = (int)(Math.random()*night.length);
			
			String temp = night[0];
			night[0] = night[random2];
			night[random2] = temp;
			
		}
		
		

		
		for(int i = 0; i < numbers.length;i++){
					
			
		}
		
//		System.out.println(numbers[0]);
//		System.out.println(night[0]);
	
	
	
		}	
	
	
	
	

	
}
