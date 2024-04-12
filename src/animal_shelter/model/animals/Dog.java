package animal_shelter.model.animals;

import java.time.LocalDate;

public class Dog extends Pet{
    public Dog(String name, LocalDate birthDay, String color) {
        super(name, birthDay, color);
        this.animalType = "Домашнее животное. Собака";
    }
}
