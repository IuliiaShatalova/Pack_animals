package animal_shelter.view.commands;

import animal_shelter.view.View;

public class Save extends Command{

    public Save(View view) {
        super("Сохранить список", view);
    }

    public void execute(){
        view.save();
    }
}
