package training;

public class starmaker {

	public static void main(String[] args) {
		
//		for(int i=0; i<10; i++){
//			for(int j=0; j<10 -i; j++){
//				System.out.println(" ");
//			}
//			for(int j=0; j<i * 2+1; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
						
		for(int i = 0; i < 10; i++ ){
			for(int j = 0; j < i ;j++){
				System.out.print(" ");
			}
			for(int j=10; j > i*2+1;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
