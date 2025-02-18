package paymentexample;


abstract public class card implements paymentmathods{
    private String cardno;
    private String cardname;

    public card(String cardno,String cardname){
        this.cardno = cardno;
        this.cardname = cardname;
    }

    public String getcardno(){
        return cardno;
    }
    public String getcardname(){
        return cardname;
    }
}
