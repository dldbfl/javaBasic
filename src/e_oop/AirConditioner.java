package e_oop;


public class AirConditioner {
	
	Boolean power;//전원
	int temperature;//온도
	int airVolume;//풍량
	
	
	AirConditioner(){
		//변수 초기화
		power = false;
		temperature = 24;
		airVolume = 1;
		
	}
	public static void main(String[] args) {
		
		AirConditioner aircon = new AirConditioner();
		
		aircon.power();
		System.out.println(aircon.power);
		aircon.temperatureUp();
		aircon.temperatureUp();
		aircon.temperatureUp();
		aircon.temperatureUp();
		aircon.temperatureUp();
		aircon.temperatureUp();
		aircon.temperatureUp();
		System.out.println(aircon.temperature);
		aircon.temperatureUp();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		System.out.println(aircon.temperature);
			
		
	}
	
	//전원 버튼과 같은 동작을 하는 메서드
	
	void power(){
		power = !power;
	}
	
	//온도 + 버튼
	
	void temperatureUp(){
		if(power&&temperature<30){
			temperature++;
		}
	}
	
	//온도 - 버튼
	
	void temperatureDown(){
		if(power&&18<temperature){
			temperature--;
		}
	}
	
	//풍량 조작  1,2,3,-> 1,2 버튼
	
		void airvolum(){
			if(power){
				if(3 < ++airVolume){
					airVolume=1;
				}
			}				
		}
	//온도가 18~ 30까지만 변경할 수 있게 해주시고,
	//전원을 켰을때만 버튼들이 작동되도록 메서드들을 변경해주세요.
	
	
}
