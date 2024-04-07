package animal_shelter.model.shelter;

import animal_shelter.model.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private List<Animal> humanFriends;
    private int animalID = 1;

    public Shelter(){
        humanFriends = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        humanFriends.add(animal);
        animal.setId(animalID++);
    }

    public Animal findAnimalByID(int id){
        if (!checkId(id)) {
            return null;
        }
        for (Animal animal: humanFriends){
            if (animal.getId() == id){
                return animal;
            }
        }
        return null;
    }

    public boolean checkId(int id){
        return id < animalID && id >= 0;
    }

    public String listOfAnimals(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Все животные в приюте: ");
        for (Animal animal: humanFriends){
            stringBuilder.append(animal);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String commandsOfTheAnimal(int ID){
        StringBuilder stringBuilder = new StringBuilder();
        Animal animal = findAnimalByID(ID);
        stringBuilder.append("Команды питомца ");
        stringBuilder.append(animal.getName());
        stringBuilder.append("\n");
        stringBuilder.append(animal.commands);

        return stringBuilder.toString();
    }

}
