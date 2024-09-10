class Overload
{
    public static void main(String[] args)
    {
        Calclator obj=new Calclator();
        System.out.println(obj.add(12.12,34.1));
        
    }
}
class Calclator
{
    public  int add(int a,int b)
    {
        return a+b;
    }
    public  int add(int a,int b, int c)
    {
        return a+b+c;
    }
    public  double add(double a, double b)
    {

        return  a+b;
    }
}


    