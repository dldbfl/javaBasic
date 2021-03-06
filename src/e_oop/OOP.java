package e_oop;

import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		
		/* 
		 * << OOP(Object Oriented Programming) : 객체지향 프로그래밍>>
		 * - 프로그래밍을 단순히 코드의 연소긍로 보는 것이 아니라 객체간의 상호작용으로 보는것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * << 객체 생성(인스턴스화) >>
		 * - 클래스를 사용하기 위해 메모리(heap영역)에 올려놓은 것.
		 * - new 클래스명(); -> 객체가 저장된 메모리 주소 반환.
		 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 * - 객체는 생성될때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
	 	 */
		
			new SampleClass().method1(); // 객체생성없이 사용할떄 쓰는것
			SampleClass sc = new SampleClass();
		
			sc.method1();

			sc.method2(5);
			
			String returnString = sc.method3();
			System.out.println(returnString);
			
			int returnInt = sc.method4(7, 15);
			System.out.println(returnInt);
			
			//test1() 호출시 출력되는 문장에 번호를 붙여주세요.
			
			sc.test1();
			
			//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
			
			ClassMaker cm = new ClassMaker();
			
			//객체가 저장된 변수를 통해 메서드들을 호출해주세요,
			//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
			//리턴타입이 있는 메서드는 리턴받은 값을 출력해주세요.
			
			cm.method1();
			
			int ds = cm.method2();
			System.out.println(ds);
			
			
		    cm.method3(3);
			
		 int method4 =cm.method4(3,5);
		 System.out.println(method4);
			
		 //5개의 산술연산을 각각 수행하는 5개의 메서드를 만들어주세요.
		 //각 메서드는 2개의 파라미터를 받아 연산결과를 리턴해주세요.
		 
		 //다음을 한줄씩 꼐산해서 최종 결과값을 출력해주세요.
		 //1. 123456+ 654321
		 //2. 1번의 결과값 *123456
		 //3. 2번의 결과값 /123456
		 //4. 3번의 결과값 - 654321
		 //5. 4번의 결과값 % 123456
		 
		 
		 Calculator as = new Calculator();
		 
		 int plus = as.plus(123456, 654321);
		 System.out.println(plus);
		 long multiplication = as.multiplication(plus, 123456);
		 System.out.println(multiplication);
		 long divide = as.divide(multiplication, 123456);
		 System.out.println(divide);
		 long minus = as.minus(divide, 654321);
		 System.out.println(minus);
		 long remainder = as.remainder(minus, 123456);
		 
		 System.out.println(remainder);
			
			
			
	}
}













































































































































































































                                                      