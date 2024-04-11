package animal_shelter.view.commands;

import animal_shelter.view.View;

public class CommandList  extends Command{

    public CommandList (View view) {
        super("Вывести список команд", view);
    }

    public void execute(){
        view.commandsList();
    }
}