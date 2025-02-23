// package inheritance.basic, class Motor의 코드를 생성자를 구현하는 방식으로 살짝 바꾸어서 내가 만든코드

package inheritance.basic;

public class Mootor extends Vehicle {
    public String name = "자동차";
    public int displacement;

    //생성자 구현
    public Mootor(double maxSpeed, int seater, int displacement) {
        this.maxSpeed = maxSpeed;
        this.seater = seater;
        this.displacement = displacement;
    }

    public void printInfo() {
        System.out.print("name : " + name);
        System.out.println(", 최대속도 : " + maxSpeed + " km");
        System.out.print("정원 : " + seater + " 명");
        System.out.println(", 배기량 : " + displacement + " cc");
    }

    public static void main(String[] args) {
        Mootor myCar = new Mootor(160, 5, 1500);
        myCar.printInfo();
    }

}
