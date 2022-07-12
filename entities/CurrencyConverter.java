package entities;

public class CurrencyConverter {
    
    public Double dollarPrice;
    public Double dollarBought;

    public Double amount() {
        return (0.06 * (dollarBought * dollarPrice)) + (dollarBought * dollarPrice);
    }
    
}
