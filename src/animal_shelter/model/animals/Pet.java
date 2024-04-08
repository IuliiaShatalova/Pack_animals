package animal_shelter.model.animals;

import java.time.LocalDate;

public abstract class Pet extends Animal{
    public String type;

    public Pet(String name, LocalDate birthDay, String color) {
        super(name, birthDay, color);
        this.type = "Домашнее животное";
    }
}
