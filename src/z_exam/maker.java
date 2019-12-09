package z_exam;

import java.util.Scanner;

public class maker {
	
	int Str, Int;
	
	
	maker(){
		Str = (int) (Math.random()*10+1);
		Int = (int) (Math.random()*10+1);
	
	}
	
	void state(){
		System.out.println();
		System.out.print("\t"+"먹이 : ");
		for(int i =  1; i <= 15; i++){
			if(i <= Str){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
		System.out.print("\t"+"행복 : ");
		for(int i =  1; i <= 15; i++){
			if(i <= Int){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
	}
	
	int food(){
		String food[]= {"초콜릿","강아지사료","커피","참치캔","계란","닭가슴살","소고기"};
		for(int i = 0; i < food.length * 10; i++){
			int random = (int)(Math.random()*food.length);
			String temp = food[0];
			food[0] = food[random];
			food[random] = temp;
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t"+"\t"+"\t"+food[0]);
		if(food[0].equals("초콜릿")){
			Str = Str-3;
			badcat();
		}
		else if(food[0].equals("강아지사료")){
			Str = Str-3;
			badcat();
		}
		else if(food[0].equals("커피")){
			Str=Str-3;
			badcat();
		}
		else if(food[0].equals("참치캔")){
			Str = Str+2;
			goodcat();
		}
		else if(food[0].equals("계란")){
			Str = Str+2;
			goodcat();
		}
		else if(food[0].equals("닭가슴살")){
			Str = Str+2;
			goodcat();
		}
		else if(food[0].equals("소고기")){
			Str = Str+2;
			goodcat();
		}
	
		if(Str>15){
			Str=15;
		}
				
		return Str;
	}
	
	int play(){
		String play[]= {"쓰다듬기","간지럽히기","찌르기","산책","목욕","같이잠자기","레이저포인트","스크래쳐","깃털낚시"};
		for(int i = 0; i < play.length * 10; i++){
			int random = (int)(Math.random()*play.length);
			String temp = play[0];
			play[0] = play[random];
			play[random] = temp;
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t"+"\t"+"\t"+play[0]);
		if(play[0].equals("쓰다듬기")){
			Int = Int+1;
			goodcat();
		}
		else if(play[0].equals("간지럽히기")){
			Int = Int-2;
			badcat();
		}
		else if(play[0].equals("찌르기")){
			Int = Int-2;
			badcat();
		}
		else if(play[0].equals("산책")){
			Int = Int-2;
			badcat();
		}
		else if(play[0].equals("목욕")){
			Int= Int-2;
			badcat();
		}
		else if(play[0].equals("같이잠자기")){
			Int = Int+2;
			goodcat();
		}
		else if(play[0].equals("레이저포인트")){
			Int=Int+2;
			goodcat();
		}
		else if(play[0].equals("스크래쳐")){
			Int = Int+2;
			goodcat();
		}
		else if(play[0].equals("깃털낚시")){
			Int = Int+2;
			goodcat();
		}
		
		if(Int>15){
			Int=15;
		}
		return Int;		
	}
			
	int coin(){	
		System.out.println("랜덤!");
		String coin[]= {"먹이주기","놀아주기"};
		for(int i = 0; i < coin.length * 10; i++){
			int random = (int)(Math.random()*coin.length);
			String temp = coin[0];
			coin[0] = coin[random];
			coin[random] = temp;
			
		}
		System.out.println(coin[0]);
		
		
		if (coin[0].equals("먹이주기")){
			food();
		}
		else if (coin[0].equals("놀아주기")){
			play();
		}
		state();
		return Int;
		
	}
			
	void gameover(){
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■■□□□□□■□□□□□■□□■□□■□□□□□■■■■□□□□□■□■■■□■□□□□□■□□□□□■■");
		System.out.println("■■□■■■■■□■■■□■□■□■□■□■■■■■■■■□■■■□■□■■■□■□■■■■■□■■■□■■");
		System.out.println("■■□■□□□■□□□□□■□■□■□■□□□□□■■■■□■■■□■□■■■□■□□□□□■□□□□□■■");
		System.out.println("■■□■■■□■□■■■□■□■□■□■□■■■■■■■■□■■■□■■□■□■■□■■■■■□■■□■■■");
		System.out.println("■■□□□□□■□■■■□■□■□■□■□□□□□■■■■□□□□□■■■□■■■□□□□□■□■■■□■■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}		
	
	void babycat(){
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println();
		System.out.println("\t"+"\t"+"       "+"■      ■       ■■■");
		System.out.println("\t"+"\t"+"     "+"■ ■    ■ ■     ■ ■");
		System.out.println("\t"+"\t"+"   "+"■    ■ ■    ■    ■ ■");
		System.out.println("\t"+"\t"+"  "+"■            ■    ■ ■");
		System.out.println("\t"+"\t"+"  "+"■ ■■      ■■ ■    ■ ■");
		System.out.println("\t"+"\t"+"  "+"■            ■     ■ ■");
		System.out.println("\t"+"\t"+"    "+"■          ■  ■  ■ ■");
		System.out.println("\t"+"\t"+"     "+"■                ■");
		System.out.println("\t"+"\t"+"     "+"■ ■  ■  ■ ■   ■ ■");
		System.out.println("\t"+"\t"+"     "+"■ ■ ■ ■     ■ ■ ■");
		System.out.println();		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		

	}
	
	void adultcat(){
		System.out.println("축하합니다! 고양이가 잘 컸어요!");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println();
		System.out.println("\t"+"\t"+"       "+"■      ■       ■■■");
		System.out.println("\t"+"\t"+"     "+"■ ■    ■ ■     ■ ■ ■ ■ ");
		System.out.println("\t"+"\t"+"   "+"■   ■ ■ ■   ■    ■ ■   ■ ■ ");
		System.out.println("\t"+"\t"+"  "+"■            ■    ■ ■  ■ ■ ");
		System.out.println("\t"+"\t"+"  "+"■ ■■    ■■■   ■   ■ ■");
		System.out.println("\t"+"\t"+"  "+"■           ■     ■ ■");
		System.out.println("\t"+"\t"+"    "+"■          ■     ■ ■");
		System.out.println("\t"+"\t"+"     "+"■         ■■■■■  ■");
		System.out.println("\t"+"\t"+"     "+"■ ■ ■ ■ ■ ■ ■ ■ ■");
		System.out.println("\t"+"\t"+"     "+"■ ■ ■      ■ ■ ■");
		System.out.println("\t"+"\t"+"    "+"■ ■ ■      ■ ■ ■");
		System.out.println("\t"+"\t"+"   "+"■ ■ ■      ■ ■ ■");
		System.out.println();		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		
	}
	
	void badcat(){
		System.out.println();	
		System.out.println("\t"+"\t"+"       "+"■      ■       ■  ■");
		System.out.println("\t"+"\t"+"     "+"■ ■    ■ ■     ■ ■  ■ ■");
		System.out.println("\t"+"\t"+"   "+"■    ■ ■   ■     ■ ■  ■ ■");
		System.out.println("\t"+"\t"+"  "+"■           ■       ■  ■");
		System.out.println("\t"+"\t"+"  "+"■ ■    ■■   ■    ");
		System.out.println("\t"+"\t"+"  "+"■           ■     ");
		System.out.println("\t"+"\t"+"    "+"■         ■    ");
		System.out.println();	
	}
	
	void goodcat(){
		System.out.println();
		System.out.println("\t"+"\t"+"       "+"■      ■       ");
		System.out.println("\t"+"\t"+"     "+"■ ■    ■ ■     ■ ");
		System.out.println("\t"+"\t"+"   "+"■    ■ ■    ■  ■ ■ ■  ");
		System.out.println("\t"+"\t"+"  "+"■             ■  ■ ■ ");
		System.out.println("\t"+"\t"+"  "+"■ ■■      ■■  ■   ");
		System.out.println("\t"+"\t"+"  "+"■    ■■■      ■    ");
		System.out.println("\t"+"\t"+"    "+"■         ■  " );
		System.out.println();	
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("당신은 고양이를 만났습니다.");				
		System.out.println();
		System.out.println("이름을 입력해주세요.");
		String name = s.nextLine();
		System.out.println("\t"+"아기고양이 이름 : "+name);
		
		maker mk = new maker();
		
		mk.babycat();
		mk.state();
				
		for(int i = 0; i <  10; i++){
			
			System.out.println();
			System.out.println();
			System.out.println("______________________메뉴_______________________");
			System.out.print("1: 먹이주기       ");
			System.out.print("2: 놀아주기       ");
			System.out.print("3: 병원가기       ");
			System.out.print("4: 놓아주기       ");
			System.out.print("5: 랜덤         ");
					
			
			int sel = s.nextInt();
			
			if (sel==1){
				mk.food();			
				mk.babycat();
				mk.state();
			}
			else if(sel==2){
				mk.play();			
				mk.babycat();
				mk.state();
			}
			else if(sel==3){
				mk.Str = 9;	
				mk.babycat();
				mk.state();
			}
			else if(sel==4){
				System.out.println();
				System.out.println("\t"+"바이바이"+"\t"+name+"\t"+"~~~~~");
				i=10;
			}
			else if(sel==5){
				mk.coin();
			}
			
			if(mk.Str<=0||mk.Int<=0){
				System.out.println();
				System.out.println("\t"+name+"는 눈앞이 깜깜해졌다.");
				mk.gameover();;
				mk.Str=0;
				mk.Int=0;
				i= 10;
			}
			else if(mk.Str==15||mk.Int==15){
				System.out.println();
				i= 10;
				mk.adultcat();
				mk.Str=15;
				mk.Int=15;
			}
			
		}

	}	
		
}
