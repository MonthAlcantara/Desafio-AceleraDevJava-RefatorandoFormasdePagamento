package br.com.codenation.paymentmethods;

public class CreditCard implements PriceStrategy {

    private final Double DESCONTO = 0.98;

    @Override
    public Double calculate(Double price) {
        return price * DESCONTO;
    }
}

