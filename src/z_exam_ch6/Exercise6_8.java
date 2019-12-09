//6-8
package z_exam_ch6;

public class Exercise6_8 {
	


//	class PlayingCard {
//		int kind;
//		int num;
//		static int width;
//		static int height;
//
//		PlayingCard(int k, int n) {
//			kind = k;
//			num = n;
//		}
//
//		public static void main(String args[]) {
//			PlayingCard card = new PlayingCard(1, 1);
//		}
//	}

/* 클래스변수 (static변수) : width, height
 * 인스턴스 변수 : kind, num
 * 지역변수 k, n, args, card
 */
//6-9
	
	static class Marine {
		int x = 0, y = 0; // Marine의 위치좌표(x,y)
		int hp = 60; // 현재 체력
		static int weapon = 6; // 공격력
		static int armor = 0; // 방어력

		static void weaponUp() {
			weapon++;
		}

		static void armorUp() {
			armor++;
		}

		void move(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}