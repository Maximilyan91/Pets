import Animals.Pet;
import Animals.Trained;

public class Trainer<A extends Pet & Trained> {

    private String name;
    private String grade;

    public Trainer(String name) {
        this.name = name;
    }

    public void train(A pet) {
        System.out.println("Начинаю тренировку " + pet.getName());
        for (String command : pet.getAllCommands()) {
            pet.train(command);
            System.out.println("Обучаю команде " + command);
            System.out.println("Заканчиваю тренировку " + pet.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


}
