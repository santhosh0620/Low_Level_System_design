package paymentexample;

public class client {
    public static void main(String[] args) {
        paymentservice ps = new paymentservice();
        ps.addpayment("santhosh", new debitcard("123","santhosh"));
        ps.makepayment("santhosh");
}
}
