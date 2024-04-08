package animal_shelter.model.animals;

import java.time.LocalDate;

public class PackAnimal extends Animal{
    public String type;

    public PackAnimal(String name, LocalDate birthDay, String color) {
        super(name, birthDay, color);
        this.type = "Вьючное животное";
    }
}
