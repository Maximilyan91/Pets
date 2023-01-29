package Animals;

import java.time.LocalDate;
import java.util.Arrays;

public class Cat {
    public static class Breed {

        private String breed;
        private String country;
        private String hairType;

        public Breed(String breed, String country, String hairType) {
            this.breed = breed;
            this.country = country;
            this.hairType = hairType;
        }

        public String getBreed() {
            return breed;
        }

        public String getCountry() {
            return country;
        }

        public String getHairType() {
            return hairType;
        }
    }

    public class FavToy {
        private String name;
        private String type;

        public FavToy(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getCatName() {
            return Cat.this.name;
        }
        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }
    }


    private String name;
    private int birthYear;
    private Cat[] friends;
    private static int count;
    private Breed breed;
    private FavToy toy;


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
        count++;
    }

    public void meow() {
        System.out.println();
        System.out.println("Функция мяу");
        System.out.println("Меня зовут " + getName());
        System.out.println("Мне " + getage() + " лет");
        System.out.println();
        System.out.println(getCount());
    }


    public Cat[] getFriends(){
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

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (breed == null) {
            this.breed = breed;
        }

    }

    public void addFriend(Cat friend) {
        this.friends = Arrays.copyOf(this.friends, getFriends().length + 1);
        this.friends[friends.length - 1] = friend;


    }

    public static int getCount() {
        return count;
    }

    public FavToy getToy() {
        return toy;
    }

    public void setToy(FavToy toy) {
        this.toy = toy;
    }
}
