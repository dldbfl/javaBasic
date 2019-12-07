package training;

import java.util.Scanner;

//////////////////////////////무기 검//////////////////////////
/// 무기 기본 ///
class weapon {
 String weapon = "none";
 int adddam = 0;
}

// 무기 상속 basic dagger//
class basic_dagger extends weapon {
 public basic_dagger() {
  weapon = "basic_dagger";
  adddam = 8;
 }
}

///////////////////////////// 방어구 갑옷/////////////////////////////
/// 갑옷 기본 ///
class armor {
 String armor = "none";
 int addef = 0;

}

// 갑옷 상속 basic tunic//
class basic_tunic extends armor {
 public basic_tunic() {
  armor = "basic_tunic";
  addef = 5;
 }
}

//////////////////////////// 방어구 액세서리/////////////////////////
/// 액세서리 기본///
class ring {
 String ring = "none";
 int addhp = 0;
}

// 액세서리 상속 basic ring//
class basic_ring extends ring {
 public basic_ring() {
  ring = "basic_ring";
  addhp = 10;
 }
}

///////////////////////// 플레이어 기본 파라미터/////////////////////
class Player {
 int hp = 20;
 int money = 0;
 int max_dam = 5;
 int min_dam = 2;
 int defense = 0;
 int pot = 0;
 int lv = 0;
 int exp = 0;
 int exp_req = 10;

 weapon wp = new weapon();
 ring rg = new ring();
 armor ar = new armor();

 public void wear() {
  hp += rg.addhp;
  defense += ar.addef;
 }

 // 공격//
 public int atk() {
  int damage = (int) (Math.random() * ((max_dam + wp.adddam) - min_dam + wp.adddam) + (min_dam + wp.adddam));
  return damage;
 }

 // 포션 마시기//
 public void drink() {
  System.out.println("포션을 마십니다.");
  if (pot >= 1) {
   pot -= 1;
   hp += 1000;
  } else
   System.out.println("포션이 없습니다");
 }

 // 튀기//
 public boolean run() {
  if (Math.random() <= 0.3)
   return true;
  else
   return false;
 }
}

/////////////////////// 몬스터 기본///////////////////
class mon {
 int max_dam;
 int min_dam;
 int hp;
 int defense;
 String name;
 int money;

 // 공격//
 public int atk() {
  int damage = (int) (Math.random() * (max_dam - min_dam) + min_dam);
  return damage;
 }

 // 회피//
 public boolean dodge() {
  if (Math.random() < 0.1)
   return true;
  else
   return false;
 }
}

/////////// 슬라임 파라미터//////////
class slime extends mon {
 public slime() {
  max_dam = 3;
  min_dam = 2;
  hp = 10;
  defense = 0;
  name = "슬라임 ";
  money = 500;
 }
}

/////////// 아기 드래곤 파라미터/////////
class baby_dragon extends mon {
 public baby_dragon() {
  max_dam = 5;
  min_dam = 5;
  hp = 50;
  defense = 0;
  name = "아기 드래곤";
  money = 9900;
 }
}

public class turn {
 public static void main(String[] args) throws InterruptedException {
  weapon wp = new weapon();
  ring rg = new ring();
  armor ar = new armor();
  Player pl = new Player();
  int sel;
  int buyno;
  System.out.print("Loading");
  for (int i = 0; i < 30; i++) {
   System.out.print("▶");
   Thread.sleep(50);
  }
  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

  pl.wear();

  while (true) {
   System.out.print("_________________메뉴_________________\n");
   System.out.println("hp:" + pl.hp);
   System.out.println("moeny:" + pl.money);
   System.out.println("lv:" + pl.lv);
   System.out.println("exp:" + pl.exp);
   System.out.print("1: 사냥터 가기        \n");
   System.out.print("2: 쇼핑        \n");
   System.out.print("3: 아이템 \n");
   System.out.print("4: 장비    (미지원)\n");
   Scanner scan = new Scanner(System.in);
   sel = scan.nextInt();
   if (sel == 1) {
    mon en;
    if (Math.random() <= 0.9) {
     en = new slime();
    } else {
     en = new baby_dragon();
    }
    System.out.println(en.name + " 출연하였습니다.");
    int select;
    while (en.hp > 0 && pl.hp > 0) {
     System.out.print("_________________싸움메뉴_________________\n");
     System.out.println("내 체력:" + pl.hp);
     System.out.println("적 체력:" + en.hp);
     System.out.print("1: 나대기        \n");
     System.out.print("2: 먹기           \n");
     System.out.print("3: 튀기           \n");

     select = scan.nextInt();
     if (select == 1) {
      if (en.dodge() == true)
       System.out.println("회피됨");
      else {
       en.hp -= pl.atk() - en.defense;
       Thread.sleep(500);
      }
     } else if (select == 2) {
      pl.drink();
      Thread.sleep(500);
     } else if (select == 3) {
      if (pl.run() == true) {
       Thread.sleep(500);
       break;

      }
     }
     pl.hp -= en.atk() - pl.defense;
    }
    if (en.hp <= 0) {
     System.out.println("이겼다");
     pl.money += en.money;
     pl.exp += 2;
     if (pl.exp >= pl.exp_req) {
      pl.lv += 1;
      System.out.println("레벨업 하였습니다.현재 레벨:" + pl.lv + "\n다음 레벨까지" + pl.exp_req + "남았습니다.");
     }

    } else if (pl.hp <= 0) {
     System.out.println("게임 오버");
     break;
    } else
     System.out.println("도망 성공");

   } else if (sel == 2) {
    System.out.print("살 개수를 입력 하시오.(하나에 1000원):");
    buyno = scan.nextInt();

    if (pl.money >= 1000 * buyno) {
     pl.pot += buyno;
     pl.money -= 1000 * buyno;
     buyno = 0;
    } else
     System.out.println("돈이 없습니다.");
   } else if (sel == 3) {
    pl.drink();
   } else if (sel == 4) {
    System.out.println("장비를 선택하십시오:");
    System.out.println("_______________현재 장비______________");
    System.out.println("          _______갑옷_______");
    System.out.println("  갑옷:"+ar.armor);
    System.out.println("          _______반지_______");
    System.out.println("  반지:"+rg.ring);
    System.out.println("          _______무기_______");
    System.out.println("  무기:"+wp.weapon);
   }

   else if (sel == 7777777) {
    System.out.println("이스터 에그 발견! 돈이 999999원 올라갑니다.");
    pl.money += 999999;
   } else
    System.out.println("없는 번호입니다.");
  }

 }
}