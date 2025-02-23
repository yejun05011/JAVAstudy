package inheritance.constructor;

public class Vehicle {
    public String name = "차량";        //이름
    public double maxSpeed;             //최대 속도
    public int seater;                  //정원

    //기본 생성자 구현
    public Vehicle() {

    }

    //다른 생성자 구현
    public Vehicle(double maxSpeed, int seater) {
        this.maxSpeed = maxSpeed;
        this.seater = seater;
    }
}
