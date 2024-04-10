package animal_shelter.model.animals;

import java.time.LocalDate;

public class Hamster extends Pet{
    public Hamster(String name, LocalDate birthDay, String color) {
        super(name, birthDay, color);
        this.type = "Домашнее животное, хомяк";
    }
}
