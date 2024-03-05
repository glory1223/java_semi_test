package java_02.Quiz02;

public class Student {
    // 【문항2】 문항 1에서 정의한 Student클래스에 Object의 toString()메소드를 오버라이딩해 학생의 이름, 반, 번호를 아래와 같이 출력하는 코드를 작성하세요.(10점)

    String name = "김철수" ; //학생 이름
    int ban = 1; //반
    int no = 10; //번호
    int kor = 90; //국어점수
    int eng = 70; //영어점수
    int math = 85; //수학점수

    @Override
    public String toString() {
        System.out.println("이름: " + name + " 반: " + ban + " 번호: " + no);
        return "이름: " + name + " 반: " + ban + " 번호: " + no;
    }


}
