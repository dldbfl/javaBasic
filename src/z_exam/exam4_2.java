package z_exam;

import java.util.Scanner;

public class exam4_2 {

	private static String[] keys;

	public static void main(String[] args) {
		
		
		/*[4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
		드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
		어야 한다. (1)에 알맞은 코드를 넣으시오.
		[Hint] String클래스의 charAt(int i)을 사용*/
		
		/*String str = "12345";
		int sum = 0;
		
		
		for(int i=0; i < str.length(); i++) {
			sum += Integer.parseInt(String.valueOf(str.charAt(i)));
			System.out.println("sum="+sum);
			sum = 0;
			
			sum += str.charAt(i)-'0';
			
			System.out.println(str.charAt(i)); 
			
		}
		System.out.println("sum="+sum);*/
		
		/*[4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
		은 코드를 넣어서 프로그램을 완성하시오.*/
		
		/*String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
		// 하나씩 읽어서 검사한다.
		for(int i=0; i < value.length() ;i++) {
		
		(1) 알맞은 코드를 넣어 완성하시오.
		
		}
		if (isNumber) {
		System.out.println(value+"는 숫자입니다.");
		} else {
		System.out.println(value+"는 숫자가 아닙니다.");
		
		*/
		
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		//123456789 -> 123.456.789
		//12345 -> 12,345
		//1234 -> 1,234
		
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();;
		System.out.println(input); 
		int temp = input.length();
		int[] key = new int[temp+2];
		
		//이렇게 하면 for문이 적절할떄 끝나지않아요. 참고하세요.
		for(int i = temp; i > 0; i-=3){
			String sub = input.substring(0,temp-3);
			String sub1 = input.substring(temp-3);
			temp = temp-3;
			input = sub+','+sub1;
			if (temp==2 || temp == 1 ) i=0;
			}System.out.println(input);
		
		
		
		
		//			이렇게하면 앞에서부터 3개씩 뽑아냄
//		Scanner s = new Scanner(System.in);
//		
//		String input = s.nextLine();
//		System.out.println(input); 
//			
//		for(int i = input.length()-3; i > 0; i-=3){
//			String sub = input.substring(0,i);
//			String sub1 = input.substring(i);
//			input =sub+","+sub1;
//			System.out.println(input);
//			}
		
		
//		int in = 123456789;
//		System.out.printf("%,d", in);
//		
		
	}
}
