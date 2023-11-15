/*
Suppose a=15.5276. print the value upto 2 decimal point. Output: a=15.52
*/

public class ValueUpto2DecimalPoint {
    public static void main(String[] args) {
        double a = 15.5276;
        System.out.println("Given Value");
        System.out.println("a=" + a);
        System.out.println("2 Decimal Point Value");
        System.out.printf("a=%.2f%n", a);
    }
}