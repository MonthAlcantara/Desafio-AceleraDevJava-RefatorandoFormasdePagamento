package br.com.codenation.paymentmethods;

public class DebitCard implements PriceStrategy {

    private final Double DESCONTO = 0.95;

    @Override
    public Double calculate(Double price) {
        return price * DESCONTO;
    }
}
