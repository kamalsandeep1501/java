public class absuper {
    public static void main(String[] args) {
        Child obj = new Child("kamal");
        obj.display();
    }
}

class Parent {
    String name;

    public Parent(String name) 
    {
        this.name = name;
    }
}

class Child extends Parent {
    public Child(String name) 
    {
        super(name);
    }

    public void display() {
        System.out.println(name);
    }
}
