package obj.setter;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard parkCard = new CreditCard();
        CreditCard leeCard = new CreditCard();

        parkCard.owner = "박지성";
        parkCard.setNumber(1212_2323_3232_2121L);

        leeCard.owner = "이희민";
        leeCard.setNumber(6969_7474_6974_7469L);

        parkCard.use(100000);
        leeCard.use(50000);
        parkCard.payBill(50000);
        leeCard.payBill(10000);

        System.out.println(parkCard.owner + ": " + parkCard.getNumber());
        System.out.println("카드대금 잔액 : " + parkCard.getBalance());
        System.out.println("카드포인트 : " + parkCard.getPoint());
        System.out.println(leeCard.owner + ": " + leeCard.getNumber());
        System.out.println("카드대금 잔액 : " + leeCard.getBalance());
        System.out.println("카드포인트 : " + leeCard.getPoint());
    }
}
