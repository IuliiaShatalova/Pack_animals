package animal_shelter.model.animals;

import java.time.LocalDate;

public class Donkey extends PackAnimal{
    public Donkey(String name, LocalDate birthDay, String color) {
        super(name, birthDay, color);
        this.animalType = "Вьючное животное. Осел";
    }
}
