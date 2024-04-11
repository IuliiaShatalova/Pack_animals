package animal_shelter.view;

public interface View {
    void start();
    void answer(String answer);
    void scanMenu();
    void error();
    void finish();
    void amountOfAnimalsImTheShelter();
    void sortByBirthday();
    void learnNewCommand();
    void commandsList();
    void addAnimalToTheShelter();
    void printMenu();
    void save();
    void load();
}
