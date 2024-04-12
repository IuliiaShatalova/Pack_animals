package animal_shelter.model.animals;

import java.time.LocalDate;

public class Camel extends PackAnimal{
    public Camel(String name, LocalDate birthDay, String color) {
        super(name, birthDay, color);
        this.animalType = "Вьючное животное. Верблюд";
    }
}
