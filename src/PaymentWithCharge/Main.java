package PaymentWithCharge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double productTotalAmount;
        String customerName;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        customerName = sc.nextLine();

        System.out.println("Enter total product amount:");
        productTotalAmount = sc.nextDouble();

        Product prod = new Product(productTotalAmount, customerName);
        prod.CalculateDeliveryFee();

        System.out.println("Choose Payment method (1 or 2): \n");
        System.out.println("1. Card \n2. Cash");
        int paymentMethod = sc.nextInt();

        if(paymentMethod == 1){
            System.out.println("Your Payment method: Card");
            System.out.println("Choose your Card Type (1, 2 or 3):");
            System.out.println("1.Amex Card \n2.Gift Card \n3.Visa and other");
            int cardType = sc.nextInt();
            prod.CalculateSurchargeAmount(cardType,productTotalAmount);
        }
        else if (paymentMethod ==2 ) {
            System.out.println("Your Payment method: Cash");
            prod.CalculateSurchargeAmount();
        }
        else{
            System.out.println("Unknown payment method");
        }
        prod.DisplayFinalResult();

    }
}
