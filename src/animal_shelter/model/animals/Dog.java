package animal_shelter.model.animals;

import java.time.LocalDate;

public class Dog extends Pet{
    public Dog(int id, String name, LocalDate birthDay, String color) {
        super(id, name, birthDay, color);
    }
}
