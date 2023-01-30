package Animals;

import java.time.LocalDate;

public abstract class Pet {

    private String name;
    private String address;
    private int birthYear;
    private String phone;

    public Pet(String name) {
        this(name, 0);
    }

    public Pet(String name, int age) {
        setName(name);
        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }
    }

    public void talk() {
        System.out.println("Я говорю пэт");

    }

    public abstract void eat();

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


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
