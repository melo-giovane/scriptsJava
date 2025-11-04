package membrosEstaticos1.exercicio2.util;

public class CurrencyConverter {
    public static double iof(double dollar){
        return dollar*0.06;
    };

    public static double finalValue(double dollar, double price){
        return (dollar + iof(dollar)) * price;
    }

}
