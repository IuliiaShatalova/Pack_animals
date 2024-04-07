package animal_shelter.model.animals;

import java.time.LocalDate;

public class Hamster extends Pet{
    public Hamster(int id, String name, LocalDate birthDay, String color) {
        super(id, name, birthDay, color);
    }
}
