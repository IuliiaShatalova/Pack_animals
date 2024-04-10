package animal_shelter.model.shelter;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Shelter<E extends ShelterItem<E>> implements Serializable, Iterable<E> {
    private List<E> humanFriends;
    private int animalID;

    public Shelter(){
        humanFriends = new ArrayList<>();
    }

    public void addAnimal(E animal){
        humanFriends.add(animal);
        animal.setId(animalID++);
    }

    public E findAnimalByID(int id){
        if (!checkId(id)) {
            return null;
        }
        for (E animal: humanFriends){
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
        for (E animal: humanFriends){
            stringBuilder.append(animal);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String commandsOfTheAnimal(int ID){
        StringBuilder stringBuilder = new StringBuilder();
        E animal = findAnimalByID(ID);
        stringBuilder.append("Команды питомца ");
        stringBuilder.append(animal.getName());
        stringBuilder.append("\n");
        stringBuilder.append(animal.showCommands());

        return stringBuilder.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new AnimalIterator<>(humanFriends);
    }

    public void sortByBirthday(){
        Collections.sort(humanFriends);

    }
}
