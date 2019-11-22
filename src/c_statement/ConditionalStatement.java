package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * <<if문>> -if :조건식의 결과가 true이면 블럭안의 문장을 수행한다. -else if : 다수의 조건이 필요할때
		 * if 뒤에 추가한다. -elsf : 결과가 true인 조건식이 하나도 없는 경우를 위헤 추가한다. *
		 */
		int regNo = 1;
		String gender = null;

		// 수행할 내용이 동일한 경우 논리 연산자를 사용해 조건식을 결합할 수 있다.
		if (regNo == 1 || regNo == 3)
			gender = "남자";
		else if (regNo == 2 || regNo == 4)
			gender = "여자";

		else
			gender = "확인불가";
		System.out.println(gender);

		// 등급만들기
		int score = 87;

		String grade = null;
		if (90 <= score) {
			grade = "A";
			if (97 <= score)
				grade += "+";
			else if (93 >= score)
				grade += "-";
		}

		else if (80 <= score) {
			grade = "B";
			if (87 <= score)
				grade += "+";
			else if (83 >= score)
				grade += "-";
		} else if (70 <= score) {
			grade = "C";
			if (77 <= score)
				grade += "+";
			else if (73 >= score)
				grade += "-";
		} else if (60 <= score) {
			grade = "D";
			if (67 <= score)
				grade += "+";
			else if (63 >= score)
				grade += "-";
		}

		else
			grade = "F";

		System.out.println(score + "에 해당하는 점수는" + grade + "점입니다.");

		/*
		 * << switch문 >> - 조건식과 일치하는 case문 이후의 문장을 수행한다. - 조건식의 결과는 정수와
		 * 문자열만(jdk1.7 부터 문자열 허용) 한다.
		 */

		regNo = 75;
		gender = null;

		switch (regNo) { // 조건식의 연산결과는 정수와 문자열만 허용한다.
		case 1: // case문의 값은 리터럴과 상수만 사용할 수 있다.
			gender = "남자";
			break; // break를 만나면 switch문을 빠져나간다.
		case 2:
			gender = "여자";
			break;
		case 3:
			gender = "남자";
			break;
		case 4:
			gender = "여자";
			break;
		default:
			gender = "확인불가";
		}
		System.out.println("당신의 성별은" + gender + "입니다.");

		switch (regNo) { // 조건식의 연산결과는 정수와 문자열만 허용한다.

		case 1:
		case 3: // case문의 값은 리터럴과 상수만 사용할 수 있다.
			gender = "남자";
			break; // break를 만나면 switch문을 빠져나간다.

		case 2:
		case 4:
			gender = "여자";
			break;

		default:
			gender = "확인불가";
		}
		System.out.println("당신의 성별은" + gender + "입니다.");

		score = 75;
		grade = null;
		switch (score / 10) {

		case 9:
		case 10:
			grade = "A";
			// break;
		case 8:
			grade = "B";
			// break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";

		}
		System.out.println("짜잔짜잔!!! 당신으 점수는" + grade + "입니다");
		
		
	/*	//콘솔창에서 입력받는 방법
		
		Scanner s = new Scanner(System.in);
		
	//	System.out.println("문자열을 입력해주세요>");
		String input1 = s.nextLine(); //사용자에게 입력받은 문자열을 반환한다.
		System.out.println("입력받은 문자열 : " + input1);
		
		
	//	System.out.println("숫자를 입력하시오");
//		s.nextInt(); 이건 버그가있읍니다.
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자");
		
		//문자열을 입력받고 입력받은 문자열을 출력해주세요.
		
		
		
		
		System.out.println("문자를쓰라");
		String input3 = s.nextLine();
		System.out.println("문자쓸곳: " + input3);
		
		System.out.println("숫자를쓰라");
		int input4 = Integer.parseInt(s.nextLine());
		System.out.println("숫자쓸곳: " + input4);
				
				
		*/		
			
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		
		
		
		
		/*
		 * 
		 * System.out.println("숫자를 입력하시오");
		 
		int input2 = Integer.parseInt(s.nextLine());
//		System.out.println("입력받은 숫자"+ input2);
		
		if (input2 == 0) {
			System.out.println("이 숫자는 0이로쏘다.");}
		
			else System.out.println("이숫자는 0이 아니다.");
		
		*/
		
		
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		
		Scanner s = new Scanner(System.in);
		/*System.out.println("숫자를쓰시오");
		int input3 = Integer.parseInt(s.nextLine());
		
		if (input3 % 2 == 1) {
			System.out.println("이 숫자는 홀수로쏘이다.");
		}
		else if (input3==0) System.out.println("이건 0이다");
			else System.out.println("이 숫자는 짝수로쏘이다.");*/
		

		
		
		
		System.out.println("숫자를 입력하라.");
		int a1 = Integer.parseInt(s.nextLine());
		
		System.out.println("숫자를 입력하라.");
		int a2 = Integer.parseInt(s.nextLine());
		
		System.out.println("숫자를 입력하라.");
		int a3 = Integer.parseInt(s.nextLine());
		
		
		
		int sum = (a1+a2+a3);
		int avg = sum / 3	;	
		
				
		if (90 <= avg) {
			grade = "A";
			if (97 <= avg)
				grade += "+";
			else if (93 >= avg)
				grade += "-";
		}

		else if (80 <= avg) {
			grade = "B";
			if (87 <= avg)
				grade += "+";
			else if (83 >= avg)
				grade += "-";
		} else if (70 <= avg) {
			grade = "C";
			if (77 <= avg)
				grade += "+";
			else if (73 >= avg)
				grade += "-";
		} else if (60 <= avg) {
			grade = "D";
			if (67 <= avg)
				grade += "+";
			else if (63 >= avg)
				grade += "-";
		}

		else
			grade = "F";
				
		
		System.out.println(sum);

		System.out.println(avg);

		System.out.println(grade);
				
				
		
		
		
		
	}

}
