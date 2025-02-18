package obj.field;

public class CreditCard {
    private long number;
    public String owner;
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard();

        myCard.number = 1234_1234_1234_1234L;
        myCard.owner = "유 재석";
        
        System.out.print("카드번호 : " + myCard.number);
        System.out.println(", 카드소유자 : " + myCard.owner);
        
    }
    
}
