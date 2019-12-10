package f_oop2;

public class SampleChild extends SampleParent {
	
	void childMetod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);
		System.out.println(method(7,13));
		int result = method(7, 13);
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		System.out.println(sc.var);
//		System.out.println(sc.method(7,13));
		int result = sc.method(7, 13);
		System.out.println(result);
		
		sc.test(10);
		
		SampleParent sp = new SampleChild();
		//부모타입이 가지고 있는 멤버만 사용할 수 있다.
		System.out.println("sp.var : "+sp.var);
		System.out.println("sc.var : "+sc.var);
		System.out.println("sp.method() : "+sp.method(5,10));
		System.out.println("sc.method() : "+sc.method(5,10));
//		sp.childMethod();
//		sp.test();
		
		}	
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것.
	@Override // 어노테이션 : 안전장치 같은것
	int method(int a, int b){
		return a*b;
	}
	
	int var;
	
	void test(double var){
		System.out.println(var); //지역변수
		System.out.println(this.var); // 인스턴스변수
		System.out.println(super.var); //부모클래스의 인스턴스 변수
		//super : 부모클래스의 멤버와 자식클래스의 멤버가 이름이 중복될때 
		//둘을 구별하기 위해 사용한다.
		System.out.println(this.method(10, 20));
		System.out.println(super.method(10, 20));
	}
	SampleChild(){
		super();
		//super()를 사용해 부모클래스의 객체도 생성한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	}
	
}

