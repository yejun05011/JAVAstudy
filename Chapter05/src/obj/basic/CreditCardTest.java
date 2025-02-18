package obj.basic;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard yourCard = new CreditCard();
        yourCard.owner = new String("이민정");
        System.out.println(", 카드소유자 : " + yourCard.owner);
        yourCard.use(150000);
        yourCard.use(100000);
        yourCard.payBill(100000);
    }
    
}
