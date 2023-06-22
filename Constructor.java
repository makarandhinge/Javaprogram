
public class Constructor {
    private String name;
    private int age;


    public Constructor() {
        name = "Makarand";
        age = 30;
    }


    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Constructor person1 = new Constructor();
        Constructor person2 = new Constructor("Seeya", 25);


        System.out.println("Person 1:");
        person1.displayInfo();
        System.out.println();

        System.out.println("Person 2:");
        person2.displayInfo();
    }
}
