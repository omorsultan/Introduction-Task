package practice_problem_05;


 class Dog {

    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking!");
    }

    public void spin() {
        System.out.println(name + " is spinning!");
    }

    public void run() {
        System.out.println(name + " is running!");
    }

}
public class Dogdesign {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex", 3, "German Shepherd");

        myDog.bark();
        myDog.spin();
        myDog.run();
    }
}
