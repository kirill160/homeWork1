package Kirill.practic2;


public class Fractions {
    private double numerator;
    private double denominator;
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

    public double getDenominator() {
        return denominator;
    }

    public double getNumerator() {
        return numerator;
    }
    public double function( Fractions f){
        if (f.denominator == 0 ){
            denominator = 1;
        }
        summ = numerator / f.denominator;
        return summ;
    }
    public double adiition (Fractions f){
        double denominatorСalculation = denominator * f.denominator;
        double additionCalculation = (denominatorСalculation  / denominator * numerator) + (denominatorСalculation / f.denominator * f.numerator);
        return additionCalculation;
    }
    public double subtraction (){
        return 0;

    }
    @Override
    public String toString() {
        return "Fractions {" +
                "numerator " + numerator +
                '/' +
                "denaminator " + denominator+
                "summ " + summ +
                '}';

    }
}
class Test{
    public static void main(String[] args) {
        Fractions fractions = new Fractions(1,5);
        Fractions fractions1 = new Fractions(2, 3);
        fractions.function(fractions);
        System.out.println(fractions.adiition(fractions1));

        System.out.println(fractions.toString());
    }
}
