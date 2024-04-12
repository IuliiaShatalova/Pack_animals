package animal_shelter.model.animals.builder;

import animal_shelter.model.animals.*;

import java.time.LocalDate;

public class Builder {
    public Animal build(String name, LocalDate birthDay, String color, String type){
        switch (type) {
            case "dog" -> { return new Dog(name, birthDay, color);}
            case "cat" -> {
                return new Cat(name, birthDay, color);
            }
            case "hamster" -> { return new Hamster(name, birthDay, color);}
            case "horse" -> { return new Horse(name, birthDay, color);}
            case "camel" -> { return new Camel(name, birthDay, color);}
            case "donkey" -> { return new Donkey(name, birthDay, color);}
        }
        return null;
    }
}
