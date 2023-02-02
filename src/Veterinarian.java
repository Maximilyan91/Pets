import Animals.Pet;

import java.util.LinkedList;
import java.util.Queue;

public class Veterinarian<T extends Pet> {
    private String name;
    private String speciality;

    private Queue<T> queue = new LinkedList<>();

    public Veterinarian(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public void addPatient(T pet) {
        queue.offer(pet);
    }

    public void treat() {
        T pet = queue.poll();
        if (pet != null) {
            System.out.println("доктор " + name + " лечит " + pet);
            treat();
        } else {
            System.out.println("Очередь пуста");
        }


    }

    public int queueSize() {
        return queue.size();
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }
}
