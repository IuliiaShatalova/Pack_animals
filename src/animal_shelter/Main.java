package animal_shelter;
import animal_shelter.model.shelter.Shelter;
import animal_shelter.model.writer.FileHandler;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

    }

    private static void save(Shelter shelter){
        String filePath = "src/animal_shelter/writer/shelter.txt";
        FileHandler fileHandler = new FileHandler();
        fileHandler.save(shelter, filePath);
    }


}
