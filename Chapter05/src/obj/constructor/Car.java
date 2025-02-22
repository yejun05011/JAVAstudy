package obj.constructor;

public class Car {
    private int maxSpeed;       //최고속도
    public String brandName;    //브랜드이름
    public int speed;           //현재속도

    //브랜드 이름을 지정하는 생성자
    public Car(String brandName) {
        this.brandName = brandName;
    }

    //브랜드 이름과 최고 속도를 지정하는 생성자
    public Car(String brandName, int maxSpeed) {
        this(brandName);
        this.maxSpeed = maxSpeed;
    }

    //속도 관련 메소드
    public int speedUp() {
        return speed += 30;
    }

    public int speedDown() {
        return speed -= 20;
    }

    //maxSpeed의 setter & getter
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public static void main(String[] args) {
        Car myCar = new Car("포르쉐", 300);
        myCar.speedUp();
        myCar.speedUp();
        System.out.print("차종 : " + myCar.brandName);
        System.out.print(", 최고 속도 : " + myCar.getMaxSpeed());
        System.out.println(", 현재 속도 : " + myCar.speedDown());
    }
}
