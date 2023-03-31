class GrandFather
{
    public void show()
    {
        System.out.println("I am grandfather her.");

    }
    
}
class Father extends GrandFather{
    public void show()
    {
        System.out.println("I am father.");
        super.show();
    }
}
class Son extends Father
{
    public void show()
    {
        System.out.println("I am son.");
       
    }
}
class Daughter extends Father{
    public void show()
    {
        super.show();
        System.out.println("I am a daughter");
    }
}
public class GenerationTest
{
    public static void main(String[] args) {
        Son s = new Son();
        Daughter d = new Daughter();
        s.show();
        d.show();
        
    }
}