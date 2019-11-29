package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
	/*	
	 * <<정렬>>
	 * 
	 *-선택 정렬: 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서
	 *				작은수와 자리바꾸기를 반복해 앞에서부터 작은수를 채워나가는 방식
	 *-버블정렬: 첫번째 숫자부터 바로 뒷숫자와 비교해서 작은수와 자리바꾸기를 
	 *				반복해 뒤에서부터 큰수를 채워나가는 방식
	 *-삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰수들을 뒤로 밀고 
	 *				중간에 삽입하는 방식
	 *-석차구하기:모든점수가 1등으로 시작해서 다른점수들과 비교해 자신의 점수가 작으면 등수를 1씩 증가시키는방식
	 */
		
		int[] numbers = new int[10];
		
		
		for(int i = 0; i < numbers.length;i++){
			numbers[i] = i + 1;
		}
		
		suffle(numbers);
		System.out.println(Arrays.toString(numbers));
		
		/*selectSoft(numbers); //선택정렬
		*/
		/*bubbleSort(numbers); // 버블정렬
		*/
		/*insertSort(numbers); // 삽입정렬zZ
	*/	
		printRank(numbers); //등수구하기
		
		
		
		
	}
	
	
	
	private static void printRank(int[] numbers) {
		int[] Rank =  new int [numbers.length];
		
		for(int a=0; a < Rank.length;a++){
			Rank[a] +=1;
		}
		
		for(int j = 0; j < numbers.length; j++){
			for(int i = 0; i < numbers.length; i++){
				
				if (numbers[i]<numbers[j]){
					
					Rank[i]++;
					}
				}	
			}
		for(int i = 0; i <numbers.length;i++){
			System.out.println(numbers[i]+ " : " + Rank[i]+ "등");
		}
		
		
		
	}



	private static void insertSort(int[] numbers) {
		
		for(int i = 1; i < numbers.length; i++){
			int temp = numbers[i];
			int j = 0;
			for(j= i-1 ; j >= 0; j--){
				if(temp < numbers[j]){
					numbers[j+1]=numbers[j];
				}else{
					break;
				}
				System.out.println(Arrays.toString(numbers));
			}
			numbers[j+1]=temp;
		}
		System.out.println(Arrays.toString(numbers));
	}
	
	
	
	
	private static void bubbleSort(int[] numbers){
		
		for(int j= 0 ; j<numbers.length-1; j++){	
			boolean changed = false;
			for(int i = 0 ; i < numbers.length-j-1; i++){
				if (numbers[i]>numbers[i+1]){
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					System.out.println(Arrays.toString(numbers));
					changed = true;
					}
				}
			if(!changed){
				break;
			}
			}
		}
			
		
		
		
	



	private static void selectSoft(int[] numbers) {		
		
		for(int j = 0; j < numbers.length-1; j++){
			for(int i= j + 1; i < numbers.length; i++){
				if (numbers[j]>numbers[i]){
					int temp = numbers[j];
					numbers[j]=numbers[i];
					numbers[i] = temp;
					System.out.println(Arrays.toString(numbers));
					}
				}
			}
		}
	



	private static void suffle(int[] numbers) {
		for(int i = 0; i < numbers.length * 10; i++){
			int random = (int)(Math.random()*numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
			
			
			
			
			
		}
	
		
		
		
		
	}


}
