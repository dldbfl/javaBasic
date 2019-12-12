package f_oop2.ex_abstract;

public abstract class Animal {

		void run(){
			System.out.println("달려간다~~~");
		}
	
		abstract void bark();
	
}


class Dog extends Animal{

	@Override
	void bark() {
		System.out.println("멍멍!!");
		
	}

}

class monkey extends Animal{

	@Override
	void bark() {
		System.out.println("우끼리리ㅣ끼ㅣ끼끼ㅣㄲ!!");
		
	}

}
class buffalo extends Animal{

	@Override
	void bark() {
		System.out.println("URRRRRRRR!!");
		
	}

}