package obj.constructor;

public class CreditCard {
    public String owner;
    private long number;


    //생성자 구현
    public CreditCard(String owner) {
        this.owner = owner;
    }

    public CreditCard(long number) {
        this.number = number;
    }

    public CreditCard(String owner, long number) {
        this.owner = owner;
        this.number = number;
    }

    //getter
    public long getNumber() {
        return number;
    }

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("권해동");
        CreditCard card2 = new CreditCard(1234_1234_2313_4242L);
        card2.owner = "권순미";
        CreditCard card3 = new CreditCard("권다혜", 9847_8418_8410_4141L);

        System.out.println("card1 : " + card1.owner + " " + card1.getNumber());
        System.out.println("card2 : " + card2.owner + " " + card2.getNumber());
        System.out.println("card3 : " + card3.owner + " " + card3.getNumber());
    }
}