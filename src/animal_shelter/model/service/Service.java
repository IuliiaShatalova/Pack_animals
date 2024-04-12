package animal_shelter.model.service;

import animal_shelter.model.animals.Animal;
import animal_shelter.model.animals.builder.Builder;
import animal_shelter.model.shelter.Shelter;
import animal_shelter.model.writer.Writable;

import java.io.IOException;
import java.time.LocalDate;

public class Service {
    private Shelter<Animal> shelter;
    private Builder builder;
    private int counter = 0;
    private Writable writable;

    public Service() {
        shelter = new Shelter<>();
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

    public String amountOfAnimalsImTheShelter(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Animal animal: shelter){
            counter++;
        }
        stringBuilder.append("Количество животных в приюте = ");
        stringBuilder.append(counter);
        return stringBuilder.toString();
    }

    public boolean checkId(int id) {
        return shelter.checkId(id);
    }

    public void setWritable(Writable writable) {
        this.writable = writable;
    }

    public void save() {
        writable.save(shelter, "Test.data");
    }

    public void load() throws IOException {
        shelter = (Shelter) writable.read("Test.data");
    }
}
