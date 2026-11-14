package example;

import lib.Payment;
import lib.UPIPayment;
import lib.Hello;

public class Main {
    public static void main(String[] args){
        System.out.println("Starting the code execution");
        Hello.sayHello();
        Payment p = new UPIPayment();
        p.pay();
        System.out.println("Ending the code execution");
        System.out.println("spring boot application");
        System.out.println("db changes done");
    }
}
