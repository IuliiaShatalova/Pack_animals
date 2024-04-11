package animal_shelter.view.commands;

import animal_shelter.view.View;

public class LearnNewCommand extends Command{

    public LearnNewCommand(View view) {
        super("Добавить новую команду", view);
    }

    public void execute(){
        view.learnNewCommand();
    }
}
