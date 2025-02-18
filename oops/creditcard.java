package paymentexample;

public class creditcard extends card {

    public creditcard(String cardno, String cardname) {
        super(cardno, cardname);
    }

    @Override
    public void pay() {
        System.out.println("paying though creditcard");
    }
    
}
