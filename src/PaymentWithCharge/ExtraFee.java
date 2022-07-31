package PaymentWithCharge;

public interface ExtraFee {
    void CalculateDeliveryFee();
    void CalculateSurchargeAmount(int cardType, double productTotalAmount);


}
