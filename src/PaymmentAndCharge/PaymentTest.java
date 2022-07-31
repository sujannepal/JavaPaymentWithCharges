package PaymmentAndCharge;
import java.util.*;
public class PaymentTest {
    public static void main (String args[]){

        double productTotalAmount = 0.0, surchargeAmount = 0.0, deliveryFee = 0.0, grandTotal = 0.0;
        System.out.println("Enter total product amount:");
        Scanner sc = new Scanner(System.in);
        productTotalAmount = sc.nextDouble();

        if(productTotalAmount < 50){
            deliveryFee = 10;
        }
        else if(productTotalAmount >=50 && productTotalAmount <100){
            deliveryFee = 5;
        }
        else{
            deliveryFee = 0;
        }

        System.out.println("Choose Payment method (1 or 2): \n");
        System.out.println("1. Card \n2. Cash");
        int paymentMethod = sc.nextInt();

        if(paymentMethod == 1){
            System.out.println("Your Payment method: Card");
            System.out.println("Choose your Card Type (1, 2 or 3):");
            System.out.println("1.Amex Card \n2.Gift Card \n3.Other Card");
            int cardType = sc.nextInt();
            if(cardType == 1){
                surchargeAmount = productTotalAmount * (3.0/100);
            }
            else if(cardType == 2){
                surchargeAmount = 0;
            }
            else{
                surchargeAmount = productTotalAmount * (1.5/100);
            }
        }
        else if (paymentMethod ==2 ) {
            System.out.println("Your Payment method: Cash");
            surchargeAmount = 0;
        }
        else{
            System.out.println("Unknown payment method");
        }

        grandTotal = productTotalAmount + deliveryFee + surchargeAmount;

        System.out.println("Product Total = " + productTotalAmount);
        System.out.println("Surcharge = " + surchargeAmount);
        System.out.println("Delivery fee  = " + deliveryFee);
        System.out.println("Grand Total = " + grandTotal);

    }
}
