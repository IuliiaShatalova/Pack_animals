package animal_shelter.view.commands;

import animal_shelter.view.View;

public class AddAnimal extends Command{

    public AddAnimal(View view) {
        super("Добавить животное", view);
    }

    public void execute(){
        view.addAnimalToTheShelter();
    }
}
