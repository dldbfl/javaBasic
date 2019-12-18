package i_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListScore {
	
	public static void main(String[] args) {
		// 참고자료
		/*
		 * 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를
		 * 50 ~ 100 까지 랜덤으로 생성시켜주시고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균, 등급을 출력해주세요.
		 * 
		 * 순위 이름 Java Oracle HTML CSS JQuery JSP 총점 평균 등급
		 * 1   박종민  90    100   80   50   30    90 400 70 A
		 * 2   박종민  90    100   80   50   30    90 400 70 B
		 * 3   박종민  90    100   80   50   30    90 400 70 C
		 * 4   박종민  90    100   80   50   30    90 400 70 D
		 * 5   박종민  90    100   80   50   30    90 400 70 E
		 * 
		 */
		
//		----------------------------------------------------------------------------------------------------
		ArrayList<String> student = new ArrayList<String>();
//		----------------------------------------------------------------------------------------------------
		student.add("김지선\n");student.add("이누리\n");student.add("박종민\n");student.add("정대석\n");
		student.add("정재영\n");student.add("강현철\n");student.add("주향한\n");student.add("강현지\n");student.add("윤창훈\n");
		student.add("연은주\n");student.add("이병훈\n");student.add("구한나\n");student.add("박진영\n");student.add("백종빈\n");
		student.add("이승재\n");student.add("민태홍\n");student.add("이지형\n");student.add("정보람\n");student.add("이예림\n");
							student.add("김령환\n");										student.add("김경운");
//		----------------------------------------------------------------------------------------------------		
		ArrayList<String> line = new ArrayList<String>();
//		----------------------------------------------------------------------------------------------------
		line.add("\t순위\t");line.add("이름\t");line.add("Java\t");line.add("Oracle\t");line.add("HTML\t");line.add("CSS\t");
		line.add("JQuery\t");line.add("JSP\t");line.add("총점\t");line.add("평점\t");line.add("등급");
//		----------------------------------------------------------------------------------------------------
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//		----------------------------------------------------------------------------------------------------
		for(int i = 0; i < student.size(); i++){
			
		}
//		----------------------------------------------------------------------------------------------------		
		//구분선
		for(int i = 0; i < 100; i++){
			System.out.print("-");
		}
		System.out.println();
		//헤더표시
		for(int i = 0; i < line.size(); i++){
			System.out.print(line.get(i));	
		}
			System.out.println();
		//구분선
		for(int i = 0; i < 100; i++){
			System.out.print("-");
		}
		System.out.println();	
		
		
		//학생성명
		for(int i = 0; i < student.size(); i++){
			System.out.println("\t\t" + student.get(i));
		}
		
		//구분선
		for(int i = 0; i < 100; i++){
			System.out.print("-");
		}
		System.out.println();
		
		//과목별 평균
		System.out.print("\t        과목 별 평균 :");
		System.out.println();
		
		//구분선
		for(int i = 0; i < 100; i++){
			System.out.print("-");
		}
		System.out.println();
		
				
//		for (int i = 0; i < Transcript.length; i++) {
//			System.out.print(Rank[i]+"\t"+name[i]+"\t");
//			for (int j = 0; j <7; j++) {
//				
//				System.out.print(Transcript[i][j]+"\t");
//				
//			}
//			System.out.println(avg[i]);
//			
//		}	
		
//		int Transcript[][] = new int [21][7];
//		name= student ,line = title
		
		ArrayList<Integer> list5= new ArrayList();
				
				for(int i= 0; i< 7;i++){
					list5.add((int)(Math.random() * 90 + 10));
				}
				
				
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
				
						
//		
//		ArrayList<HashMap<Integer, Object>> list = new ArrayList<>();
//		HashMap<Integer, Object> hm = new HashMap<Integer, Object>();
//		
//		
//		for(int i = 0; i <10;i++){
//			System.out.print(list+"\t");
//			}
//			System.out.println();
////			int sum = new list.get(0).size();
////			어레이는 배열의 길이를 지정해줄 필요가없음.
//			ArrayList<Integer> sum = new ArrayList<>();
//			ArrayList<Integer> avg = new ArrayList<>();
//			
//			hm.put((int) (Math.random() * 90 + 10),2);
//			hm.put((int) (Math.random() * 90 + 10),2);
//			list.add(hm);
//			System.out.println(list);
//
//			for (int i = 0; i < list.size(); i++) {
//
//				for (int j = 0; j < list.size(); j++) {
//					list.add((int) (Math.random() * 90 + 10), hm);
//					
//				}

//				Transcript[i][6] = sum[i];
//				avg[i] = (int) (sum[i] * 10 + 0.5) / Transcript[i].length / 10.0;
//			}
//		
//		
//		System.out.println();
//		for(int i = 0; i < list.size(); i++){
//			HashMap<String,Object> hashMap = list.get(i);
//			Set<String> keyset = hashMap.keySet();
//			for(String key : keyset){
//				System.out.print(hashMap.get(key) + "\t\t");
//			}
//			System.out.println();
//			
//		}
				
				
				
				
				
				
	}
}
