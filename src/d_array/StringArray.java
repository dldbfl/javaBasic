package d_array;

public class StringArray {

	public static void main(String[] args) {
		String s = new String("ABCD"); // 참조형 타입을 초기화 하는 방법
		String str = "ABCD"; // String은 자주쓰는거라 생략가능		
		
		
		char[] charArray = str.toCharArray();//그 문자배열을 반환해주는 메소드
		System.out.println(charArray);
		// char 배열은 특별히 배열의 내용이 출력된다.
		
		//String 클래스 내부에 문자배열을 다루는 여러가지 메서드가 정의되어 있다.
		
		
		/*
		 *  << String의 주요 메서드 >>
		 *  - equals()		: 문자열의 내용이 같은지 확인한다.
		 *  - length()		: 문자열의 길이를 반환한다.
		 *  - charAt()		: 문자열에서 해당 위치에 있는 문자를 반환한다.
		 *  - substring()	: 문자열에서 해당 범위에 있는 문자열을 반환한다.
		 *  - indexOf()		: 문자열 내의 특정 문자열의 인덱스를 반환한다.
		 *  - replace()		: 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.		
		*/
		
	for(int i = 0; i< str.length();i++){
		System.out.println(str.charAt(i)); //charArray[i]
		
	}
	
	String revStr = "";//str을 거꾸로 담을 변수
	//뒤에서부터 한글자씩 가져와서 새로운 변수에 더한다.
	for(int i = str.length() -1 ; i>=0;i--){
		revStr += str.charAt(i);
	}
	System.out.println(revStr); //charArray[i]
	
	str = "0123456789";
	String sub1 = str.substring(3);//3번 인덱스부터 끝까지 잘라서 반환
	System.out.println(sub1); 
	String sub2 = str.substring(5,8);
	System.out.println(sub2);
	
	str = "치킨 피자 돈까스 떡볶이";
	int idx = str.indexOf("돈까스"); // 돈까스의 시작 인덱스를 반환한다.
									// 공백도 포함
	System.out.println(idx);
	int idx2 = str.indexOf("햄버거");
	System.out.println(idx2); // 해당하는 문자열이 없는 경우 -1을 반환한다.
	
	String[] menus = {
			"치킨 18000원",
			"피자 9900원",
			"돈까스 8000원",
			"떡볶이 500원"
			};
	
			for(String menu : menus){
				String name = menu.substring(0, menu.indexOf(" "));
				System.out.println(name);
				
				int price = Integer.parseInt(menu.substring(menu.indexOf(" ")+1, menu.indexOf("원")));
				System.out.println(price);					
				
				
						
				//가격만 분리시켜 int형 변수에 담아주세요.
			}
			
			/*for(String menu : menus){
				String money = menu.substring(menu.indexOf(" "), menu.indexOf("원"));
				int moneyi = Integer.parseInt(money);
				System.out.println(moneyi);
			}*/
			
			
			
			
			str = "123456789";
			str = str.replace("3",  "짝");
			System.out.println(str);
			str = str.replace("6",  "짝");
			System.out.println(str);
			str = str.replace("9",  "짝");
			System.out.println(str);
			
			String pn = "010-2363-3647";
			//하이픈(-)을 제거해서 출력해주세요. 
			
			pn = pn.replace("-","");
			System.out.println(pn);
		
			
	
	}

}
