package e_oop;

public class ClassMaker2 {
	
	public static void main(String[] args) {
		ClassMaker2 cm = new ClassMaker2();
		System.out.println(cm.var);
	}
	//전역변수 하나를 선언하고 명시저긍로 초기화 해주세요.
	
	int var = 297;

	//위에서 선언한 전역변수르 초기화 블럭을 사용해 초기화 해주세요.
	
	{
		var = 102;
	}
	
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요..
	
	ClassMaker2(int var){
		this.var = var;
		
	}
	
	
	ClassMaker2(long var){
		this.var = (int) var;
		
	}
	

	// 위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화해주세요.
	
	ClassMaker2(){
		this(30);
	


	}
	
	
	
	
	
}
