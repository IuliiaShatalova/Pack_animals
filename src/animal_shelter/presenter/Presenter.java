package animal_shelter.presenter;

import animal_shelter.model.service.Service;
import animal_shelter.model.writer.Writable;
import animal_shelter.view.View;

import java.io.IOException;
import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addAnimalToTheShelter(String name, LocalDate birthDay, String color, String type) {
        service.addAnimalToTheShelter(name, birthDay, color, type);
        getAnimalList();
    }

    public void getAnimalList() {
        String answer = service.getAnimalList();
        view.answer(answer);
    }

    public void commandsList(int id) {
        String answer = service.commandsList(id);
        view.answer(answer);
    }

    public void learnNewCommand(String command, int id) {
        service.learnNewCommand(command, id);
        commandsList(id);
    }

    public void sortByBirthday() {
        service.sortByBirthday();
        getAnimalList();
    }

    public void amountOfAnimalsImTheShelter() {
        String amount = service.amountOfAnimalsImTheShelter();
        view.answer(amount);
    }

    public boolean checkId(int id) {
        return service.checkId(id);
    }

    public void setWritable(Writable writable) {
        service.setWritable(writable);
    }

    public void save() {
        service.save();
    }

    public void load() throws IOException {
        service.load();
    }
}
