class MyClass
{
int x;
String y;
MyClass(int i)
{
x = i;
}
MyClass(String n)
{
y = n;
}
}
class NewClass
{
public static void main(String[] args)
{
MyClass t1 = new MyClass(10);
MyClass t2 = new MyClass("SIT");
System.out.println(t1.x + "  " +t2.y);
}
}