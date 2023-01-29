import java.time.LocalDate;
import java.util.Arrays;

public class Cat {

    String name;
   private int birthYear;

    private Cat[] friends;

    public Cat(String name) {
        this(name, LocalDate.now().getYear());
        this.name = name;
        birthYear = 1;
    }

    public Cat(String name, int age) {
        this.name = name;

        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }
 //       friends = new Cat[10];
    }

    void meow() {
        System.out.println();
        System.out.println("Функция мяу");
        System.out.println("Меня зовут " + getName());
        System.out.println("Мне " + getage() + " лет");
        System.out.println();
    }


    Cat[] getFriends(){
        if (friends == null) {
            friends = new Cat[0];
        }
        return friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }
    }

    public int getage() {
        return LocalDate.now().getYear() - birthYear;
    }

    void addFriend(Cat friend) {
        this.friends = Arrays.copyOf(this.friends, getFriends().length + 1);
        this.friends[friends.length - 1] = friend;


    }
}
