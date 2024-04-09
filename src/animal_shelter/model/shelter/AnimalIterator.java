package animal_shelter.model.shelter;

import animal_shelter.model.animals.Animal;

import java.util.Iterator;
import java.util.List;

public class AnimalIterator implements Iterator<Animal> {
    private int index;
    private List<Animal> animalList;

    public AnimalIterator(List<Animal> animalList){
        this.animalList = animalList;
    }

    @Override
    public boolean hasNext() { return index < animalList.size(); }

    @Override
    public Animal next() {
        return animalList.get(index++);
    }
}
