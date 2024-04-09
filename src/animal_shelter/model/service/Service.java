package animal_shelter.model.service;

import animal_shelter.model.animals.Animal;
import animal_shelter.model.animals.builder.Builder;
import animal_shelter.model.shelter.Shelter;

import java.time.LocalDate;

public class Service {
    private Shelter shelter;
    private Builder builder;
    private int counter = 0;

    public Service() {
        shelter = new Shelter();
        builder = new Builder();
    }

    public void addAnimalToTheShelter(String name, LocalDate birthDay, String color, String type){
        Animal animal = builder.build(name, birthDay, color, type);
        shelter.addAnimal(animal);
    }

    public String getAnimalList(){
        return shelter.listOfAnimals();
    }

    public String commandsList(int id){
        return shelter.commandsOfTheAnimal(id);
    }

    public void learnNewCommand(String command, int id){
        Animal animal = shelter.findAnimalByID(id);
        animal.addCommand(command);
    }

    public void sortByBirthday(){
        shelter.sortByBirthday();
    }

    @Override
    public String toString() {
        return getAnimalList();
    }

    public int amountOfAnimalsImTheShelter(){
        for (Animal animal: shelter){
            counter++;
        }
        return counter;
    }
}
