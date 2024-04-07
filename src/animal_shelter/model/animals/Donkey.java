package animal_shelter.model.animals;

import java.time.LocalDate;

public class Donkey extends PackAnimal{
    public Donkey(int id, String name, LocalDate birthDay, String color) {
        super(id, name, birthDay, color);
    }
}
