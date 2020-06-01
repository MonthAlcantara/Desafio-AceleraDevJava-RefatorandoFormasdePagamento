package br.com.codenation.paymentmethods;

public enum PaymentMethod {

    CASH(null), DEBIT_CARD(null), CREDIT_CARD(null), TRANSFER(null);

    private PriceStrategy priceStrategy;

    PaymentMethod(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public PriceStrategy getPaymentStrategy() {
        return priceStrategy;
    }
}