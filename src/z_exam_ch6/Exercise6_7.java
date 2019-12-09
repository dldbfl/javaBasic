package z_exam_ch6;

class MyPoint {
	int x;
	int y;
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double getDistance(int a, int b) {
				
		return (double) Math.sqrt((x-a)*(x-a) + (y-b)*(y-b));
		

	}
}

class Exercise6_7 {
	public static void main(String args[]) {
	MyPoint p = new MyPoint(1,1);
	// p와 (2,2)의 거리를 구한다.
	System.out.println(p.getDistance(2,2));
	}
}




