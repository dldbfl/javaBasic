package f_oop2;

public class SampleParent /*extends Object*/ {
	//아무것도 상속받지않은 친구들은 오브젝트 클래스를 상속받고있따.
	String var;
	
	{
		var = "초기화 블럭을 물려주지 않는다.";
	}

	SampleParent(){
		var = "생성자도 물려주지 않는다.";
	}
	
	int method(int a, int b){
		return a+b;
	}
	
}
