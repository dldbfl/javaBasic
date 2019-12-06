package e_oop;

import java.util.Scanner;

public class TV3 {

	boolean power;
	boolean mute;
	int ch;
	int vol;

	Scanner s = new Scanner(System.in);
	
	TV3(){
		power = false;
		mute = false;
		ch = 1;
		vol = 0;
		
	}
	
	
	public static void main(String[] args) {

		TV3 tv = new TV3();
		tv.power();
		System.out.println(tv.power);
		tv.chselect();
		System.out.println(tv.ch);
		tv.chup();
		System.out.println(tv.ch);
		tv.chdown();
		System.out.println(tv.ch);
		tv.volup();
		System.out.println(tv.vol);	
		tv.voldown();
		System.out.println(tv.vol);	
		
		if (tv.ch>1000){
			System.out.println("치지지ㅣ지지지지지ㅣㄱ");
		}
	}
	void power(){
		power = !power;
		System.out.println(power ? "TV켜짐":"TV꺼짐");
	}
	void mute(){
		mute = !mute;
	}
	void chdown(){
		if(power&&1<ch){
			ch--;
		}
	}
	void chup(){
		if(power&&ch<999){
			ch++;
		}
	}
	void voldown(){
		if(power&&0<vol){
			vol--;
		}
	}
	void volup(){
		if(power&&vol<100){
			vol++;
		}
	}
	void chselect(){
		ch = Integer.parseInt(s.nextLine());
	}
	void showvol(int vol){
		System.out.println("음량. ");
		for(int i = ch+ 1 ; i <= 10; i++){
			
		}
	}
	
	

}
