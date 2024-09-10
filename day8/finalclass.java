public class finalclass {
    public static void main(String[] args)
    {
        Car obj = new Car();
        int r1 =obj.add(12, 12);
        System.out.println(r1);
        int r2=obj.add(13,13);
        System.out.println(r2);

        
    }
    
}
final class Car
{
    public int add(int a,int b)
    {

        return a+b;
    }
}
