package animal_shelter.model.animals;

import java.time.LocalDate;

public class Horse extends PackAnimal{
    public Horse(String name, LocalDate birthDay, String color) {
        super(name, birthDay, color);
        this.animalType = "Вьючное животное. Лошадь";
    }
}
