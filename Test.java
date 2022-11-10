package itStep.Interval;

public class Test {
    public static void main(String[] args) {
        Interval interval = new Interval(1, 3, 5, 0, 6 );
        System.out.println(interval.concatenationOfValues(new Interval(1,3,5,0,6)));
    }
}
