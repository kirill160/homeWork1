package com.company;

public class Main {

    public static void main(String[] args) {
        //Дана сторона квадрата a. Найти его периметр P = 4·a
        /*int a = 5;
        int p = 4 * a;
        System.out.println(p);
         */
        //Дана сторона квадрата a. Найти его площадь S = a*2
//        int a = 4;
//        int S =(int) Math.pow(a,2);
//        System.out.println(S);
        //Даны стороны прямоугольника a и b. Найти его площадь S = a·b и
        //периметр P = 2·(a + b).
//        int a = 7;
//        int b = 3;
//        int s = a * b;
//        int p = 2 * (a + b);
//        System.out.println("площадь прямоугольника равна : " + s + "/n периметр прямоугольника равен : " + p);
        //Дан диаметр окружности d. Найти ее длину L = π·d. В качестве
        //значения π использовать 3.14.
//        int d = 10;
//        double pi = Math.PI;
//        int l = (int) ( d * pi);
//        System.out.println(l);
        //Дана длина ребра куба a. Найти объем куба V = a3 и площадь его поверхности S = 6·a2
//            double a = 7;
//            double v = Math.pow(a,3);
//            double s = 6 * Math.pow(a,2);
//        System.out.println(v);
        //Даны длины ребер a, b, c прямоугольного параллелепипеда.
        // Найтиего объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
//        int a = 25;
//        int b = 36;
//        int c = 15;
//        int V = a * b * c;
//        int S = 2 * (a * b + b * c + a * c);
//        System.out.println("объем равен : " + V + "\nПлощадь равна : " + S);
        //Найти длину окружности L и площадь круга S заданного радиуса R:
        //L = 2·π·R, S = π·R2
        //В качестве значения π использовать 3.14.
//        double R = 10;
//        double L = 2 * Math.PI * R;
//        double S = Math.PI * Math.pow(R,2);
        //Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2
//        int a = 5;
//        int b = 7;
//        int summ = (a + b) /2;
        //Даны два неотрицательных числа a и b.
        // Найти их среднее геометрическое, то есть квадратный корень из их произведения: √a·b.
//        int a = 3;
//        int b = 4;
//        double c = Math.sqrt(a * b);
//        System.out.println(c);
        //Даны два ненулевых числа. Найти сумму, разность, произведение и
        //частное их квадратов.
//        double a = 7;
//        double c = 3;
//        if (a != 0 && c != 0){
//            double summ =  (a + c);
//            System.out.println(summ);
//            double prod = a * c;
//            System.out.println(prod);
//            double diff = a - c;
//            System.out.println(diff);
//            double quot = a / c;
//            System.out.println(quot);
//            double prodPow = Math.pow(a, 2 ) * Math.pow(c,2);
//            System.out.println(prodPow);
//        }
        // Даны два ненулевых числа. Найти сумму, разность, произведение и
        //частное их модулей.
//        int a = 7;
//        int c = 4;
//        if (a != 0 && c != 0) {
//            int summ = a + c;
//            System.out.println(summ);
//            int diff = a - c;
//            System.out.println(diff);
//            int prod = a * c;
//            System.out.println(prod);
//
//        }
        // Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P:
        //c =√a 2 + b 2, P = a + b + c.
//        double a = 3;
//        double b = 7;
//        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//        double p = a + b + c;
//        System.out.println("c : " +c + "\np : " + p);
        //Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
        //Найти площади этих кругов S1 и S2, а также площадь S3 кольца, внешний
        //радиус которого равен R1, а внутренний радиус равен R2: S1 = π·(R1)2,
        // S2 = π·(R2)2, S3 = S1 − S2.
//        double R2 = 15;
//        double R1 = 24;
//        double S1 = Math.PI * Math.pow(R1, 2);
//        double S2 = Math.PI * Math.pow(R2, 2);
//        double S3 = S1 - S2;
//        System.out.println(S1 + "\n" + S2 + "\n" + S3);
        //Дана длина L окружности. Найти ее радиус R и площадь S круга,
        //ограниченного этой окружностью, учитывая, что L = 2·π·R, S = π·R2 В
        //качестве значения π использовать 3.14.
       /* double L = 15;
        double R = L / 2 * Math.PI;
        double S = Math.PI * Math.pow(R, 2);
        System.out.println("Радиус равен " + R + "Площадь равна " + S);
*/
       //Дана площадь S круга. Найти его диаметр D и длину L окружности,
//ограничивающей этот круг, учитывая, что L = 2·π·R, S = π·R2. В качестве
//значения π использовать 3.14.
       /*double S = 35;
       double R = S / Math.PI;
       R = Math.sqrt(R);
       double L = 2 * Math.PI * R;
       double D = 2 * R;
        System.out.println(L + " " + R + " " + D);
        */
       //Найти расстояние между двумя точками с заданными координатами x1 и x2 на числовой оси: |x2 − x1|.
       /* int x1 = -255;
        int x2 = 30;
        int s = Math.abs(x1) - Math.abs(x2);
        System.out.println(s);
        */
       //Даны три точки A, B, C на числовой оси. Найти длины отрезков AC
        //и BC и их сумму
       /* int A = 3;
        int B = -5;
        int C = 7;
        int ac = C - A;
        int bc = C - B;
        int summ = ac + bc;
        */




    }
}




