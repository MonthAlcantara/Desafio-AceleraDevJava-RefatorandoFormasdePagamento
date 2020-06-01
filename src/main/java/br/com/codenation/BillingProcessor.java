package br.com.codenation;

public class BillingProcessor {

    public Double calculate(Order order) {
        switch (order.getPaymentMethod()) {
            case CASH:
                return order.getPrice() * 0.9;
            case TRANSFER:
                return order.getPrice() * 0.92;
            case CREDIT_CARD:
                return order.getPrice() * 0.98;
            case DEBIT_CARD:
                return order.getPrice() * 0.95;
        }
        throw new RuntimeException("Payment method not implemented");
    }
}