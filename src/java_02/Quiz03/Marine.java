package java_02.Quiz03;

public class Marine {

    int x = 0, y = 0; // Marine의 위치좌표(x,y)
    int hp = 60; // 현재 체력
    int weapon = 6; // 공격력
    int armor = 0; // 방어력

    void weaponUp() {
        weapon++;
    }

    void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x; // this.x는 인스턴스 변수, x는 지역변수
        this.y = y; // this.y는 인스턴스 변수, y는 지역변수
    }
}
/*
【문항3】 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버중에 static을 붙여야
하는 것은 어떤 것들이고 그 이유는 무엇인지 서술하세요. (단, 모든 병사의 공격력과 방어력은 같아야
한다.)(10점)

정답: 병사들을 정적메소드인 main메소드에서 이동시키고 업그레이드하려면 관련 멤버들을 정적 멤버로 만들어야함
따라서, 필드의 int x, int y, int weapon, int armor, 메소드의 weaponUp(), armoreUp() 이 정적멤버가 되어야한다.
 */
