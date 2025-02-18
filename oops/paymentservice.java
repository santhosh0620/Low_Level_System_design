package paymentexample;

import java.util.HashMap;

public class paymentservice {
    HashMap<String,paymentmathods> hs;

    public paymentservice(){
        hs = new HashMap<>();
    }

    public void addpayment(String name,paymentmathods pm){
        hs.put(name, pm);
    }
    public void makepayment(String name){
        paymentmathods pm = hs.get(name);
        pm.pay();
    }
}
