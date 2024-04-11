package animal_shelter.view;

import animal_shelter.view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> commandList;

    public Menu(View view) {
        commandList = new ArrayList<>();
        commandList.add(new AddAnimal(view));
        commandList.add(new CommandList(view));
        commandList.add(new LearnNewCommand(view));
        commandList.add(new SortByBirthDay(view));
        commandList.add(new AnimalAmount(view));
        commandList.add(new Save(view));
        commandList.add(new Load(view));
        commandList.add(new Finish(view));
    }

    public String print(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Выберете пункт меню: \n");
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commandList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int choice){
        Command command = commandList.get(choice-1);
        command.execute();
    }

    public int size(){
        return commandList.size();
    }
}
