package z_exam.ch6;

class Exercise6_19 {
		
	String change(String str) {
		
//		str += "456";
			return str = "456";
	}

	public static void main(String[] args) {

		String str ="ABC123";
//		change a = new change();
		System.out.println(str);

		str = new Exercise6_19().change(str);
	
		
		System.out.println("After change:" + str);
		
		str = new Exercise6_19().change(str);
	}
}




