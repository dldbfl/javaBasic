package i_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * 
		 * add()	: 마지막 위치에 객체를 추가
		 * get()	: 지정된 위치의 개체를 반환
		 * set()	: 지정된 위치에 주어진 객체를 저장(수정)
		 * remove()	: 지정된 위치의 객체를 제거
		 * size()	: 저장된 객체의 수 반환
		 *  
		 */
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(10);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1, "456");
		
		for(int i = 0; i < list2.size();i++){
			System.out.println(list2.get(i));
		}
		System.out.println(list2.get(0));
		list2.remove(0);
		//리스트에 저장된 값을 삭제하면 그 뒤의 모든 값의 인덱스가 당겨진다.
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		//2차원 배열
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();	
		
		ArrayList<Integer>list4 = new ArrayList<>();
		list4.add(10);
		
		list3.add(list4);
		
		//정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 넣어주세요.
		ArrayList<Integer> list5= new ArrayList();
		
		list5.add(60);

		list5.add(10);

		list5.add(45);

		list5.add(900);

		list5.add(135);
		
		for(int i = 0; i < list5.size();i++){
			System.out.println(list5);
		}

		// 위에서 만든 ArrayList에 담긴 값들의 합계와 평균을 출력해주세요.
		
		int sum = list5.get(0)+list5.get(1)+list5.get(2)+list5.get(3)+list5.get(4);
		double avg = sum/list5.size();
		
		for(int i = 0; i< list5.size();i++){
			sum += list5.get(i);
		}
		
		System.out.println(sum+","+avg);
		
		//위에서 만든 ArrayList에 담긴 값중 최소값과 최대값을 출력해주세요.
		
		int Max = 0;
		int Min = 0;
		Max = list5.get(0);
		Min = list5.get(0);
		for(int i = 0; i< list5.size();i++){
			
			if (Max<list5.get(i)){
				Max = list5.get(i);
			}
			
			
			if (Min>list5.get(i)){
				Min = list5.get(i);
			}
			 
		}
				
		
		System.out.println(Max+","+Min);
		
		//위에서 만든 ArrayList의 값을 내림차순으로 정렬해주세요.
		
		for(int j  = 0; j < list5.size()-1; j++){
			for(int i= j + 1; i < list5.size(); i++){
				if (list5.get(j)>list5.get(i)){
					int temp = list5.get(j);
					list5.set(j,list5.get(i));
					list5.set(i,temp);
					
					}
				}
			}
		System.out.println(list5);
		
		
		Collections.reverse(list5);
		System.out.println(list5);
		Collections.sort(list5);
		
		
		
	}

}
