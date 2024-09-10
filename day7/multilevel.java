class Animal
{
    String name;
}
class Mammal extends Animal
{
    String hasfur;
}
class Dog extends Mammal
{
    String breed;
    public void display()
    {
        System.out.println("species:"+name);
        System.out.println("has fur:"+hasfur);
        System.out.println("breed"+breed);
    }

}
public class multilevel {
    public static void main(String[] args)
    {
        Dog obj = new Dog();
        obj.name="canine";
        obj.hasfur="true";
        obj.breed=" Golden Retriever";
        obj.display();
        
    }
    
}
