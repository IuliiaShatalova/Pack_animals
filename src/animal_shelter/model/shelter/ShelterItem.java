package animal_shelter.model.shelter;

import java.util.List;

public interface ShelterItem<E> extends Comparable<E>{
    String getName();
    int getId();
    void setId(int id);
    String showCommands();

}
