package Animals;

public class Parrot extends Pet {
    private String name;
    private int birthYear;
    private boolean talking;
    private String breed;

    public Parrot(String name) {
        this(name,0);
    }

    public Parrot(String name, int age) {
        super(name, age);
    }

    public void talk() {
        System.out.println("Hello!");
    }

    @Override
    public void eat() {
        System.out.println("Попугаю корм");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isTalking() {
        return talking;
    }

    public void setTalking(boolean talking) {
        this.talking = talking;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
