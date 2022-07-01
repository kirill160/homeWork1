package Kirill.practic2;


public class Fractions {
    private int numerator;
    private int denominator;
    private  double summ;
    Fractions( int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }
    public double function(){
        if (denominator == 0 ){
            denominator = 1;
        }
        summ = numerator / denominator;
        return summ;
    }
    public double adiition (Fractions f){
        double denominatorСalculation = denominator * f.denominator;
        double additionCalculation = ((denominatorСalculation  / denominator * numerator) + (denominatorСalculation / f.denominator * f.numerator)) / denominatorСalculation;
        return additionCalculation;
    }
    public double subtraction (Fractions f){
        double denominatorСalculation = denominator * f.denominator;
        double subtractionCalculation = ((denominatorСalculation  / denominator * numerator) - (denominatorСalculation / f.denominator * f.numerator)) / denominatorСalculation;
        return subtractionCalculation;

    }
    @Override
    public String toString() {
        return "Fractions {" +
                "numerator " + numerator +
                '/' +
                "denaminator " + denominator+
                '}';

    }
}
class Test{
    public static void main(String[] args) {
        Fractions fractions = new Fractions(1,2);
        Fractions fractions1 = new Fractions(1, 2);
        fractions.function();
        fractions1.function();
        System.out.println(fractions.adiition(fractions1));
        System.out.println(fractions.subtraction(fractions1));
        System.out.println(fractions.toString());
    }
}
