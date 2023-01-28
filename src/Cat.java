public class Cat {

    String name;
    int age;

    public Cat() {
        name = "КОт";
        age = 1;
    }

    void meow() {
        System.out.println("Функция мяу");
        System.out.println("Меня зовут " + name);
        System.out.println("Мне " + age + " лет");
    }
}
