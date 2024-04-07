package animal_shelter.model.animals;

import java.time.LocalDate;

public class Horse extends PackAnimal{
    public Horse(int id, String name, LocalDate birthDay, String color) {
        super(id, name, birthDay, color);
    }
}
