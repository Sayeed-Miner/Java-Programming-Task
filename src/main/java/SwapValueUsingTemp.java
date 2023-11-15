/*
Suppose, a=10 and b=20. Now swap the value using a temp variable. Output: a=20, b=10
*/

public class SwapValueUsingTemp {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("Given Value");
        System.out.println("a="+a);
        System.out.println("b="+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping Value");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}