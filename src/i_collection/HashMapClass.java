package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {
	
	public static void main(String[] args) {
		/*
		 * put()	: 지정된 키와 값을 저장
		 * get()	: 지정된 키의 값을 반환 (없으면 null)
		 * remove()	: 지정된 키로 저장된 값을 제거
		 * keySet()	: 저장된 모든 키를 Set으로 반환
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("title", "제목입니다.");
		map.put("content", "내용입니다.");
		map.put("user", "박종민");
		map.put("date", "2019-12-18 3:43");
		
		System.out.println(map);
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		map.put("user", "홍길동"); // 1개의 key 당 1개의 값
		System.out.println(map.get("user"));
		
		map.remove("user");
		System.out.println(map.get("user")); // null값 확인
		
		map.put("me", "박종민");
		
		//map에 저장된 모든 내용 출력
		Set<String> keys = map.keySet();
		System.out.println(map);
		System.out.println(keys);
		
		for(String key : keys){
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		//
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		HashMap<String, Object> hm = new HashMap<String, Object>();
		
		//1번
		hm.put("LPROD_ID", 1);
		hm.put("LPROD_GU", "P101");
		hm.put("LPROD_NM", "컴퓨터제품");
		list.add(hm);
		System.out.println(list);
		//2번
		hm = new HashMap<String, Object>();
		hm.put("LPROD_ID", 2);
		hm.put("LPROD_GU", "P102");
		hm.put("LPROD_NM", "전자제품");
		list.add(hm);
		System.out.println(list);
		//3번
		hm = new HashMap<String, Object>();
		hm.put("LPROD_ID", 3);
		hm.put("LPROD_GU", "P201");
		hm.put("LPROD_NM", "여성캐주얼");
		list.add(hm);
		//4번
		hm = new HashMap<String, Object>();
		hm.put("LPROD_ID", 4);
		hm.put("LPROD_GU", "P202");
		hm.put("LPROD_NM", "남성캐주얼");
		list.add(hm);
		//5번
		hm = new HashMap<String, Object>();
		hm.put("LPROD_ID", 5);
		hm.put("LPROD_GU", "P301");
		hm.put("LPROD_NM", "피혁잡화");
		list.add(hm);
		//6번
		hm = new HashMap<String, Object>();
		hm.put("LPROD_ID", 6);
		hm.put("LPROD_GU", "P302");			
		hm.put("LPROD_NM", "화장품");	
		list.add(hm);
		//7번
		hm = new HashMap<String, Object>();
		hm.put("LPROD_ID", 7);
		hm.put("LPROD_GU", "P401");
		hm.put("LPROD_NM", "음반/CD");
		list.add(hm);
		//8번
		hm = new HashMap<String, Object>();
		hm.put("LPROD_ID", 8);
		hm.put("LPROD_GU", "P402");
		hm.put("LPROD_NM", "도서");	
		list.add(hm);
		//9번
		hm = new HashMap<String, Object>();
		hm.put("LPROD_ID", 9);
		hm.put("LPROD_GU", "P403");
		hm.put("LPROD_NM", "문구류");
		list.add(hm);
		
		for(String key : list.get(0).keySet()){
			System.out.print(key + "\t");
		}
		System.out.println();
		for(int i = 0; i < list.size(); i++){
			HashMap<String,Object> hashMap = list.get(i);
			Set<String> keyset = hashMap.keySet();
			for(String key : keyset){
				System.out.print(hashMap.get(key) + "\t\t");
			}
			System.out.println();
			
		}
	}

}




















