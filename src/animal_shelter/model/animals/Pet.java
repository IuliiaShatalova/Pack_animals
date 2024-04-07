package animal_shelter.model.animals;

import java.time.LocalDate;

public abstract class Pet extends Animal{
    public String type;

    public Pet(int id, String name, LocalDate birthDay, String color) {
        super(id, name, birthDay, color);
        this.type = "Домашнее животное";
    }
}
