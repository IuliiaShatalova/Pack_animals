package animal_shelter.model.animals;

import java.time.LocalDate;

public class Cat extends Pet{
    public Cat(String name, LocalDate birthDay, String color) {
        super(name, birthDay, color);
        this.type = "Домашнее животное, кот";
    }
}
