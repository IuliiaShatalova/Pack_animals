package animal_shelter.view.commands;

import animal_shelter.view.View;

public class SortByBirthDay extends Command{

    public SortByBirthDay(View view) {
        super("Вывести список животных по дате рождения", view);
    }

    public void execute(){
        view.sortByBirthday();
    }
}