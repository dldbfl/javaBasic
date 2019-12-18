package h_useful;

public class StringSpeedTest {

	public static void main(String[] args) {
//		String str = "a";
//		
//		long start = System.currentTimeMillis();
//		FOR(INT I = 0; I < 1000000; I++){
//			STR += "A";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start+"ms");
		
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start+"ms");

	}

}
