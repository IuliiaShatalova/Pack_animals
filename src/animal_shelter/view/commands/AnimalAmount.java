package animal_shelter.view.commands;

import animal_shelter.view.View;

public class AnimalAmount extends Command{

    public AnimalAmount(View view) {
        super("Показать количество всех животных", view);
    }

    public void execute(){
        view.amountOfAnimalsImTheShelter();
    }
}