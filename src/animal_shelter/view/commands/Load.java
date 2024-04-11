package animal_shelter.view.commands;

import animal_shelter.view.View;

public class Load extends Command{

    public Load(View view) {
        super("Загрузить список", view);
    }

    public void execute(){
        view.load();
    }
}
