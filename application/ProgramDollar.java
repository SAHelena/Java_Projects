package application;
import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;


public class ProgramDollar {

    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        converter.dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        converter.dollarBought = sc.nextDouble();
        System.out.printf("%s = %.2f", "Amount to be paid in reais", converter.amount());

        sc.close();
    }
}
