package java_01.Quiz08;

public class CarExample {
    public static void main(String[] args) {

        Tire tire = new Tire("한국타이어", 18);

        Car car = new Car ("현대자동차", "쏘나타", 18.9);

        System.out.println("정답확인: " + tire.company + " " + tire.size);
        System.out.println("정답확인: " + car.company + " " + car.model +" " + car.maxSpeed);
    }
}
