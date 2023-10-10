class Animal
{
    void move()
    {
        System.out.println("Eating....");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("barking...");
    }
}
class TestInheritance
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.bark();
        d.move();
    }
}