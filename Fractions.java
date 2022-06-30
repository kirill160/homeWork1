package com.company.lesson;

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
    public double function( Fractions f){
        if (f.denominator == 0 ){
            denominator = 1;
        }
            summ = numerator / f.denominator;
        return summ;
    }
    public double adiition (Fractions f){
        double denominatorСalculation = denominator * f.denominator;
        double divisorCalculation = f.denominator * numerator;
        double summ2 = denominatorСalculation + divisorCalculation;
        return summ2;
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
        Fractions fractions = new Fractions(83,0);
        Fractions fractions1 = new Fractions(15, 96);
        fractions.function(fractions);
        System.out.println(fractions.toString());
    }
}
