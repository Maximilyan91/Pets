package Animals;

public interface Trained {

    String[] getTrainedCommands();

    String[] getAllCommands();

    void train(String command);

    void doCommands(String command);

}
