package z_exam;

//public class exam07 {
	
	
	/*
	 * [7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.
		오버라이딩 뭘까. 라는 부분에서 나는 오버라이딩에 대해 다시한번 깊은 고찰을 하여나갈 필요성을 느꼈다.
		오버라이딩은 그거였다. 정확하게 그거라고 말하면서 기억은 하지 못하는게 오버라이딩이기도하지만 대개 오버라이딩이라하면 
		메소드를 재정의하는 것이다. 어째서 책에서는 정의를 하는 것이 아니라고 나왓는지는 모르겠지만 오버라이딩은
		내 기준으로 봤을 떄 재정의하는 것이다.
		
		왜 재정의하는것이 필요할까. 내용이 맘에 안들거나해서 바꿀 필요가 있을 때 오버라이딩을 한다.
		
		= 조상 클래스로부터 상속받은 메서드를 자손 클래스에 맞게 재정의 하는 것		
	 */
	
	/*
	 * [7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)
		a. 조상의 메서드와 이름이 같아야 한다.
		b. 매개변수의 수와 타입이 모두 같아야 한다.
		c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.
		d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.
		
		c,d
	 */
	
//}

	// [7-5]
	class Product {
		int price; // 제품의 가격
		int bonusPoint; // 제품구매 시 제공하는 보너스점수
		
		//이거 추가. 이게 생성자임. 밑에 TV(){안에 생략된 super가 생성자를 호출함. 밑에꺼에서 끌려감
		//이거 밑에 이미 int pirce 들어간 생성자있어서 자동생성안되니까 직접 작성해야함.
		Product(){
			
		};
		Product(int price) {
			this.price = price;
			bonusPoint = (int) (price / 10.0);
		}
	}
	
	class Tv extends Product {
		
		Tv() {
		}
	
		public String toString() {
			return "Tv";
		}
	}
	
//	class Exercise7_5 {
//		public static void main(String[] args) {
//			Tv t = new Tv();
//		}
//	}
		
	/*Tv클래스의 인스턴스를 생성할 때, 생성자  Tv( )가 호출되고 Tv( )는 조상 생성자 super( )를 호출한다. 
	     실제 코드에서는 super( )를 호출하는 곳이 없지만 컴파일러가 자동적으로 추가해준다. 
              그래서 컴파일을 하고 나면 Tv() { } -> Tv() { super(); }와 같이 변경된다. 
	     추가된 super( )는 조상클래스인 Product의 기본 생성자 Product( )를 호출하는 것인데, 
	  Product클래스에는 기본 생성자 Product( )가 정의되어 있지 않다. 
	  Product클래스에는 이미 Product(int price)라는 생성자가 정의되어 있기 때문에 컴파일러가 
	    자동적으로 추가해 주지도 않으므로 직접 Product클래스에 Product( ){ }를 넣어주면 문제가 해결된다.	
	 */
	
	//[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인가?
	
	/*	자손클래스의 인스턴스를 생성하면 조상으로부터 상속받은 인스턴스변수들도 생성되는데, 
		이 상속받은 인스턴스변수들 역시 적절히 초기화되어야 한다. 
		상속받은 조상의 인스턴스변수들을 자손의 생성자에서 직접 초기화하기보다는 조상의 생성자를 호출함으로써 
		초기화되도록 하는 것이 바람직하다.
		각 클래스의 생성자는 해당 클래스에 선언된 인스턴스변수의 초기화만을 담당하고, 
		조상클래스로부터 상속받은 인스턴스변수의 초기화는 조상클래스의 생성자가 처리하도록 해야하는 것이다.*/

	// = 부모에서 받은 인스턴스변수들도 같이 상속되는데 이놈들은 상속만 받았지 초기화안된 상태란거야.
	// 따라서 초기화 시켜줘야하는데 이게 생성자를 호출하면 알아서 호출될거란 말이다 이거야
	// 클래스의 생성자는 해당클래스의 선언된 인스턴스 변수의 초기화기능만 가지고 있어! <-(이게 중요함)
	// 그러니까 부모클래스에서 상속된 인스턴스변수 초기화는 부모 생성자를 끌고와서 처리시키는거지!

//	[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
	
class Parent {
	int x = 100;

	Parent() {		//순서대로 이게 3번
		this(200);
	}

	Parent(int x) {		//4번 
						// 밑에 설명한 바와 같이 super(); 코드가 생성됨. 따라서 Object()를 소환함. <ㅡ 이게 5번
		this.x = x;
	}

	int getX() {		
		return x;
	}
}

class Child extends Parent { 
	int x = 3000;

	Child() {					//1번 . 먼저들어왔으니
		this(1000);
	}
	//컴파일러는 생성자의 첫 줄에 다른 생성자를 호출하지 않으면 조상의 기본 생성자를 호출하는 코드 'super( );' 를 넣는다. 
	Child(int x) {				// 암튼 이게 2번
//		super( ); // 그래서 이게 안보이게 생성됨. 부모클래스의 기본생성자 소환코드임
		this.x = x;				
	}
}

class exam071 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX());
	}
}

//[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
//것은?
//a. public-protected-(default)-private <- 답
//b. public-(default)-protected-private
//c. (default)-public-protected-private
//d. private-protected-(default)-public



//[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
//옳지 않은 것은? (모두 고르시오)
//a. 지역변수 - 값을 변경할 수 없다. <- ㅇㅋ
//b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다. <- 이거 맞따
//c. 메서드 - 오버로딩을 할 수 없다. <-오버라이딩을 할수없따 X
//d. 멤버변수 - 값을 변경할 수 없다. <- 맞따


//[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
//수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
//getter와 setter메서드를 추가하라.

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) return;
		李典 = this.channel;
		this.channel = channel;
		

	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME ) return;
		this.volume = volume;
	} 		
	
	private int 李典; // 이전채널 변수를 만든다음에 이전채널에 그 변수 안에 집어넣어놓고

	public void gotoPrevChannel(){
		setChannel(李典);  // 그 변수에 해당하는 숫자를 보낸다.
	}
		
}

class exam07 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}

/*		[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
		a. public은 접근제한이 전혀 없는 접근 제어자이다. <- 이거 맞따 제한없다
		b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다. <- 그렇타 맞따
		c. 지역변수에도 접근 제어자를 사용할 수 있다. <- 이거 불가능하다
		d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다. <- 그렇다
		e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다. <- 그렇다
		
		
		
		
		[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?*/
		
		// 왜냐면 메쓰 클래스는 ?? 메쓰클래스가 머냐 랜덤이나 머 그런 숫자 넣는거같따 
		// 먼지 잘모르겠지만 private가 붙었으니 그 안쪽 클래스만 끌고오는것이다.
		// 따라서 유추해봣을떄 외부 접근들어오면 문제생기는걸 막을려고했을거시다. 외부의 개입을 막기위해서!


//		  Math클래스의 모든 메서드가 static메서드이고 인스턴스변수가 존재하지 않기 때문에 객체를 생성할 필요가 없기 때문

//	 	  Math클래스는 몇 개의 상수와 static메서드만으로 구성되어 있기 때문에 인스턴스를 생성할 필요가 없다.
// 		    그래서 외부로부터의 불필요한 접근을 막기 위해 생성자의 접근 제어자를 private으로 지정하였다.





//[7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은? (모두 고르시오)

/*	class Unit {} 
	
	class AirUnit extends Unit {} 
	
	class GroundUnit extends Unit {} 
	
	class Tank extends GroundUnit {} 
	
	class AirCraft extends AirUnit {} */
	
	
/*	Unit u = new GroundUnit(); 
	
	Tank t = new Tank(); 
	
	AirCraft ac = new AirCraft();*/

/*		a. u = (Unit)ac; 
		
		b. u = ac;
		
		c. GroundUnit gu = (GroundUnit) u; //u가 참조하는 객체가 GroundUnit 이므로 OK
		
		d. AirUnit au = ac;
		
		e. t = (Tank)u; ← 조상타입의 인스턴스(GroundUnit)를 자손타입(Tank)으로 형변환 할 수 없다. <- 마따 이게 답이다
		
		f. GroundUnit gu = t;*/



//  [7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
//	class Car {}
//	
//	class FireEngine extends Car implements Movable {}
//	
//	class Ambulance extends Car {}
//	
//	FireEngine fe = new FireEngine();

/*		a. fe instanceof FireEngine
		b. fe instanceof Movable
		c. fe instanceof Object
		d. fe instanceof Car
		e. fe instanceof Ambulance*/

		
//		[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이
//		클래스를 상속받도록 코드를 변경하시오.

		class Marine extends Unit { // 보병
			int x, y; // 현재 위치
			void move(int x, int y) { /* 지정된 위치로 이동 */ }
			void stop() { /* 현재 위치에 정지 */ }
			void stimPack() { /* 스팀팩을 사용한다.*/}
		}
		class Tank extends Unit { // 탱크
			int x, y; // 현재 위치
			void move(int x, int y) { /* 지정된 위치로 이동 */ }
			void stop() { /* 현재 위치에 정지 */ }
			void changeMode() { /* 공격모드를 변환한다. */}
		}
		class Dropship extends Unit { // 수송선
			int x, y; // 현재 위치
			void move(int x, int y) { /* 지정된 위치로 이동 */ }
			void stop() { /* 현재 위치에 정지 */ }
			void load() { /* 선택된 대상을 태운다.*/ }
			void unload() { /* 선택된 대상을 내린다.*/ }
		}
		abstract class Unit{
			int x,y;
			abstract void move(int x, int y); //추상클래스
			void stop(){/*현재 위치에 정지*/}
		}
		
		
//		[7-20] 다음의 코드를 실행한 결과를 적으시오.
		
//	class exam07_1 {
//		public static void main(String[] args) {
//			Parent p = new Child();
//			Child c = new Child();
//			System.out.println("p.x = " + p.x);
//			p.method();
//			System.out.println("c.x = " + c.x);
//			c.method();
//		}
//	}
	
//	class Parent {
//		int x = 100;
//	
//		void method() {
//			System.out.println("Parent Method");
//		}
//	}
//	
//	class Child extends Parent {
//		int x = 200;
//	
//		void method() {
//			System.out.println("Child Method");
//		}
//	}
		
	
		/*	p.x = 100

			Child Method

			c.x = 200

			Child Method*/

			/*

			조상클래스에 선언된 멤버변수와 같은 이름의 인스턴스변수를 자손 클래스에 중복으로 정의했을 때, 
			조상타입의 참조변수로 자손 인스턴스를 참조하는 경우와 자손타입의 참조변수로 자손 인스턴스를 참조하는 경우는 
			서로 다른 결과를 얻는다.

			메서드의 경우 조상 클래스의 메서드를 자손의 클래스에서 오버라이딩한 경우에도 참조변수의 타입에 관계없이 항상 
			실제 인스턴스의 메서드(오버라이딩된 메서드)가 호출되지만, 멤버변수의 경우 참조변수의 타입에 따라 달라진다.


			타입은 다르지만, 참조변수 p, c 모두 Child 인스턴스를 참조하고 있다. 그리고,
			Parent클래스와 Child클래스는 서로 같은 멤버들(x)을 정의하고 있다. 
			이 때 조상타입의 참조변수 p로 Child인스턴스의 멤버들을 사용하는 것과 자손타입의 참조변수 c로 
			Child인스턴스의 멤버들을 사용하는 것의 차이를 알 수 있다.

			메서드인 method( )의 경우 참조변수의 타입에 관계없이 항상 실제 인스턴스의 타입인 Child클래스에
			정의된 메서드가 호출되지만, 인스턴스변수인 x는 참조변수의 타입에 따라서 달라진다.*/

/*	[7-24] 다음 중 인터페이스의 장점이 아닌 것은?
			a. 표준화를 가능하게 해준다.
			b. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
			c. 독립적인 프로그래밍이 가능하다.
			d. 다중상속을 가능하게 해준다.
			e. 패키지간의 연결을 도와준다.  <- 이게 답 */
	
	
/*  1. 개발시간을 단축시킬 수 있다.

	2. 표준화가 가능하다.

	3. 서로 관계없는 클래스들에게 관계를 맺어줄 수 있다.

	4. 독립적인 프로그래밍이 가능하다.

	- 인터페이스를 이용하면 클래스의 선언과 구현을 분리시킬 수 있기 때문에 실제구현에 독립적인 프로그램을 작성하는 것이 가능하다. */


	
	
	
		
		
//		https://developer-ek.tistory.com/13

