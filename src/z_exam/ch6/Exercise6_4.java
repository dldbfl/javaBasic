package z_exam.ch6;

public class Exercise6_4 {

	public static void main(String[] args) {
		
		Student s = new Student(null, 0, 0, 0, 0, 0);
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
		
		

	}

}
