package a_variable;

public class Variable {

	public static void main(String[] args) {
		/*
		 * <<변수>>
		 * - 하나의 데이터를 저장할 수있는 메모리 상의 공간
		 * 
		 * <<사용 가능한 기본형 데이터의 종류>>
		 * - 정수 : byte, short, int, long
		 * - 실수 : float, double
		 * - 문자 : char 
		 * - 논리 : boolean
		 * 
		 * byte=8 bit(0,1)
		 * 1byte = boolean, byte
		 * 2byte = char, short
		 * 3byte = int, float 
		 * 4byte = long, double
		 * 
		 * - 데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지, 그것의 이름이 무엇인지 알려줘야한다.
		 * 
		 * - 이름을 붙이기 위한 '명명규칙'은 자바의 정석 25~26쪽 참조
		 * 
		 */
		
		//변수 선언 방법 : 데이터 타입 + 변수 이름
		byte abc;
		char moonja;
		
		//모든 기본형 타입 을 사용해서 8개의 변수를 선언해주세요.
		
		boolean test1;
		short test2;
		int test3;
		float test4;
		long test5;
		double test6;
		byte test7;
		char test8;
		
		
		
		//선언한 이후 변수를 사용할 때는 변수의 이름을 사용한다.
//		System.out.println(test3); //컴파일 에러 발생 (문법 오류)
		// 변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
		
		
		//=(대입연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		test7 = 127; // 타입에 맞는 값을 저장해야 한다.
		test2 = 30000;
		test3 = 20;
		test5 = 900L; // long은 접미사 L을 붙여야한다.
		test4 = 3.14f; // float 접미사 : f 
		test6 = 3.14; // double 접미사 : d (생략가능)
		test8 = '가';
		test1 = true;
		// 초기화 : 변수에 처음으로 값을 저장하는 것.
		System.out.println(test3);
		//Ctrl + F11 : 프로그램 실행 단축키
		//F11 : 디버그 모드로 실행
		
		test3 = 30;
		System.out.println(test3);
		
		test3 = test3 + 40;
		System.out.println(test3);
		test3 = test2;
		System.out.println(test3);
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		test1 = false;
		test2 = 20000;
		test3 = 20;
		test4 = 4.78f;
		test5 = 666L;
		test6 = 4.78;
		test7 = 0;
		test8 = 'n';
		
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);
		System.out.println(test5);
		System.out.println(test6);
		System.out.println(test7);
		System.out.println(test8);
		
		
		//String: 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : ""(큰따옴표)로 감싸진 글자
		
		String _string = new String("초기화가 다름");		
		System.out.println(_string);
		_string = "생략가능"; //이 값을 리터럴 이라고 부름
		System.out.println(_string);
		
		
		/* <<리터럴의 종류>>
		 * 숫자 : 0, 10, -5, 3.14
		 * 문자 : '가', 'a', '0', ' '
		 * 문자열 : "가나다", "abc", "123", 
		 * 그 외 : true, false, null(값이 읎다)
		 * 
		 * <<참조형 타입>>
		 * - 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
		 * - ex) String, ABC, Variable
		 * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 변수의 크기는 4byte 입니다.
		 */
		
		//기본값 : 전역변수에 아무것도 저장하지 않았을때 저장되어 있는 값.=0
		//전역변수 : 매서드 밖에 선언되어있는 변수
		//지역변수 : 매서드 안에 있는 변수
		test1 = false;
		test2 = 0;
		test3 = 0;
		test4 = 0.0f;
		test5 = 0L;
		test6 = 0.0;
		test7 = 0;
		test8 = '\u0000'; //'' 
		_string = null;
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.(형변환)
		test7 = 127;
		test3 = 128;
		test7 = (byte)test3; // (형변환)
		System.out.println(test7); //오버되면 가장 작은 값으로 돌아간다. 128 -> -128 (오버플로우)
		
		
		test7 = -128;
		test3 = -129;
		test7 = (byte)test3;
		System.out.println(test7); // 반대로 넘어가면 가장 높은값으로. -120 -? 127 (언더플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다.
				
		//double 타입에서 int 타입으로 형변환 해서 출력해주세요. 
		test6 = 3.14223;
		test3 = (int)test6;
		System.out.println(test3);  //int는 소수점을 표현할 수 없으므로 소수점이 손실된다.
		
		//표현 범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다
		//그럼으로 형변환을 생략할 수 있다.
		test3 = test7;
		test5 = test3;
		test6 = test3;
		test6 = test4;
		test
		
		//수학에서 상수 - 코딩에서 리터럴
		/*
		 * <<상수>>
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간 (반대어 = 변수)
		 * - final int MAX_NUMBER; (final붙이고, 대문자로 넣는다)
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; // 값 바꾸려할시 컴파일 에러
		
		
	}
}
