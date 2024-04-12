package animal_shelter;
import animal_shelter.model.writer.FileHandler;
import animal_shelter.view.ConsoleUI;


public class Main {
    public static void main(String[] args) {
        ConsoleUI consoleUI= new ConsoleUI();
        consoleUI.setWritable(new FileHandler());
        consoleUI.start();
    }
}
