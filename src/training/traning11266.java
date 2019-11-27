package training;

public class traning11266 {

	public static void main(String[] args) {
		
		
		
		int q1 = (int)(Math.random()*9+1);
		int q2 = 0;
		while(q1==q2) 
			q2 = (int)(Math.random()*9+1);
		int q3 = 0;	
		while(q3==q2||q3==q1)
			q3 = (int)(Math.random()*9+1);
		
		System.out.println(q1+""+q2+""+q3);
		

		
	}

}
