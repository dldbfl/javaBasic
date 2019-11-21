package b_operator;

import java.awt.SystemColor;

public class ComparisonOperator {

		public static void main(String[] args) {
			/*
			 * <<비교 연산자 >>
			 * - <  : 작다
			 * - >  : 크다
			 * - <= : 작거나 같다
			 * - >= : 크거나 같다
			 * - == : 같다
			 * - != : 같지 아니하다
			 */
			
			boolean b = 10 < 20; //비교연산자의 연산결과는 boolean타입이다.
			System.out.println(b);
			b = 10 <20 - 15;
			System.out.println(b); // 산술 연산 후 비교연산을 진행한다.
			
			b = 10 <= 10.0; // 타입이 같아야해
			System.out.println(b); // 형변환 해야하지만 생략가능한 부분 
			b = 65 >= 'B';
			System.out.println(b); // 마찬가지로 생략가능한 부분
			
			b = 10.0f == 10.0;
			System.out.println(b);
			b = 10.1f == 10.1;  // false 나옴. 실수가 값을 정확하게 표현못하니 
								// 좀더 정확하게 하고싶으면 double
			System.out.println(b); // float는 7자리까지 정확하게 표현, double은 15자리까지 표현함
			
			System.out.printf("%21.20f%n",10.1f);
			System.out.printf("%21.20f%n",10.1); //21자리로 표현해주세요. 그중에 소수점이 스무자리
			//float과 double은 정밀도가 달라 float를 double로 형변환하면
			//소수점을 정확하게 비교할 수 없다.
			//double을 float으로 형변환해야 정확하게 비교할 수 있다.
			b = 10.1f == (float)10.1;
			System.out.println(b);
			b = 10.1f == (double)10.1;
			System.out.println(b);
			
			//대소비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만
			//등가비교는 모든 타입을 비교할 수 있다. (같다, 같지않다.)
			b = 'A'==65;
			System.out.println(b);
			b = true != false;
			System.out.println(b);
			
			b= "abc" == "abc";
			System.out.println(b);//같은 스트링 리터럴은 같은 주소를 가진다.
			b= "abc" == new String("abc"); // new를 하면 기존과 다른 새 주소를 만든다.
			System.out.println(b);
			//참조형 타입은 저장된 메모리 주소를 비교하기 때문에
			//String은 등가비교 연산자로 내용을 비교할 수 없다.
			
			b = "abc".equals(new String("abc"));
			//이퀄을 사용하면 스트링의 내용을 비교할 수 있다.
			System.out.println(b); 
			
			b = !"abc".equals("ABC");
			//같지 않다의 결과를 얻기 위해서는 !(NOT)을 앞에 붙여준다.
			System.out.println(b);
			
			
			
			
		}
}
