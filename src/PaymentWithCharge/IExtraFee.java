package PaymentWithCharge;

public interface IExtraFee {
    void CalculateDeliveryFee();
    void CalculateSurchargeAmount(int cardType, double productTotalAmount);

}
