package training;

import java.awt.List;
import java.util.ArrayList;

public class sql {

	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(15);
		intList.add(20);
		intList.add(25);
		intList.add(30);
		intList.add(35);
		intList.add(40);
		
		//리스트에 담긴 값으간격 평균
		int sum = 0;
		for(int i=0; i<intList.size()-1;i++){
			
			sum = sum + intList.get(i+1) - intList.get(i); 
		}
		System.out.println(sum/(intList.size()-1));
		
	}

}
