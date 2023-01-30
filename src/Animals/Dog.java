package Animals;

import java.util.Arrays;

public class Dog extends Pet implements Trained{

    public static final String CMD_SIT = "Сидеть";
    public static final String CMD_STOYAT = "Стоять";
    public static final String CMD_GOLOS = "Голос";

    public static final String[] TRAINED_COMMANDS ={CMD_SIT, CMD_STOYAT, CMD_GOLOS};
    private String[] trainedCommands = new String[0];
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

    @Override
    public String[] getTrainedCommands() {
        return new String[0];
    }

    @Override
    public String[] getAllCommands() {
        return TRAINED_COMMANDS;
    }

    @Override
    public void train(String command) {
        trainedCommands = Arrays.copyOf(trainedCommands, trainedCommands.length + 1);
        trainedCommands[trainedCommands.length - 1] = command;
    }


    @Override
    public void doCommands(String command) {
        System.out.println("Выполняю команду " + command);
        switch (command) {
            case CMD_SIT:
                System.out.println("Собака садится");
                break;
            case CMD_STOYAT:
                System.out.println("Собака встает");
                break;
            case CMD_GOLOS:
                System.out.println("Собака лает");
                break;
        }
    }
}