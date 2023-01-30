package Animals;

public class Dog extends Pet {

    public Dog(String name) {
        super(name, 0);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Собака ест корм");
    }
}