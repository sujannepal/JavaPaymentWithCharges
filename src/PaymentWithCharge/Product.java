package PaymentWithCharge;

public class Product extends Customer implements IExtraFee {
    double productTotalAmount;
    private double deliveryFee;
    private  double surchargeAmount;
    private double grandTotal;
    private String paymentMethod;

    Product(double productTotalAmount, String customerName){
        this.productTotalAmount = productTotalAmount;
        this.setCustomerName(customerName);
    }

    @Override
    public void CalculateDeliveryFee(){
        if(productTotalAmount < 50){
            this.deliveryFee = 10.0;
        }
        else if(productTotalAmount >=50 && productTotalAmount <100){
            this.deliveryFee = 5.0;
        }
        else{
            this.deliveryFee = 0.0;
        }
    }
    @Override
    public void CalculateSurchargeAmount(int cardType, double productTotalAmount) {
        if(cardType == 1){
            this.surchargeAmount = productTotalAmount * (3.0/100);
            this.paymentMethod = "Amex Card";
        }
        else if(cardType == 2){
            this.surchargeAmount = 0;
            this.paymentMethod = "Gift Card";
        }
        else{
            this.surchargeAmount = productTotalAmount * (1.5/100);
            this.paymentMethod = "Visa and Other";
        }
    }

    public void CalculateSurchargeAmount(){
        //For Cash Check Payment
        this.surchargeAmount= 0;
        this.paymentMethod = "Cash Check";
    }
    public void DisplayFinalResult(){
        this.grandTotal = this.productTotalAmount + this.surchargeAmount + this.deliveryFee;

        System.out.println("########### FINAL BILLING ###########");
        System.out.println("Customer Name  = " + this.getCustomerName());
        System.out.println("Payment Method = " + this.paymentMethod);
        System.out.println("Product Total = " + this.productTotalAmount);
        System.out.println("Delivery Fee  = " + this.deliveryFee);
        System.out.format("Surcharge Amount  = %.2f \n", this.surchargeAmount);
        System.out.println("Grand Total = " + this.grandTotal);

    }
}
