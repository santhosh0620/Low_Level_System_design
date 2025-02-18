package paymentexample;

public class upi implements paymentmathods{

    String upiid;
    upi(String id){
        this.upiid = id;
    }

    @Override
    public void pay() {
        System.out.println("payment via upi");
    }
    
}
