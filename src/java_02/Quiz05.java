package java_02;

public class Quiz05 {
    /*
    【문항5】 아래 코드의 실행결과가 왜 아래와 같이 나오는지 서술하세요.(10점)

    정답:
    Parent parent = new Child();  상속관계인 자식객체가 부모타입으로 자동타입변환이 되었으므로
    부모타입의 멤버들만 접근할수있습니다.
    따라서, 실행클래스에서 parent.method1();가 실행이되고, parent.method2();의 경우
    부모 메소드로부터 오버라이드된 메소드가 실행되므로 오버라이드된  method2()가 실행이 됩니다.
    자식 메소드를 실행 parent.method3(); 는 에러가 발생하게 됩니다.


public class Parent {
public String field1;
public void method1() {
 System.out.println("Parent-method1()");
}
public void method2() {
 System.out.println("Parent-method2()");
}
}

public classChild extendsParent {
public String field2;
public void method3() {
 System.out.println("Child-method3()");
}
@Override
public void method2() {
 System.out.println("Child-method2()");
}
}

public classChildExample {
 public static void main(String[] args) {
 Parent parent = new Child();
 parent.field1 = "data1";
 parent.method1(); parent.method2();

 parent.field2 = "data2"; //(불가능)
 parent.method3(); //(불가능)

}
}

 */
}

