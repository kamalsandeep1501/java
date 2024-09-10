public class test
 {
    public static void main(String[] args) {
        int a,b;
        a=12;
        b=2;
        System.out.println("before swapping");
        System.out.println(a);
        System.out.println(b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.err.println("after swapping");
        System.err.println(a);
        System.err.println(b);
    }
}