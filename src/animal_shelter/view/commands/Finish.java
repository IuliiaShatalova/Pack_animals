package animal_shelter.view.commands;

import animal_shelter.view.View;

public class Finish extends Command{

    public Finish(View view) {
        super("Закрыть програму", view);
    }

    public void execute(){
        view.finish();
    }
}