package f_oop2;




//싱글톤 패턴 : 객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴
//객체들간에 객체를 공유하기 위해 사용한다.

public class Singleton {
	
	private static Singleton instance;
	private static String instance2;
	
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		//여기서 인스턴스값에 초기화되서 한번들어간다.
		Singleton instance2 = Singleton.getInstance();
		//위에서 이미 들어가서 널값이 아니니까 더이상 초기화 안댄다.
		Singleton instance3 = Singleton.getInstance();
		//마찬가지다.
	}	
	
	//생성자의 접근제어자를 private으로 만들어 다른 클래스에서 객체 생성하는것을 막는다.
	private Singleton(){
		int x = 1;
		System.out.println(x);
		
	}
	
	//private로 막아둔거 쓸려면 겟인스턴스로 호출해서 사용한다. getInstance는 자주씁니다! 얍얍! 
	//니 이거 쓴다는거 알고잇니? 
	public static Singleton getInstance(){
		if(instance == null){
		   instance = new Singleton();
		   instance2= new String();
		}
		return instance;
	}
	
	
}
