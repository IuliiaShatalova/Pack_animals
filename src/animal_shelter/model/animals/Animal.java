package animal_shelter.model.animals;

import animal_shelter.model.shelter.ShelterItem;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Serializable, Comparable<Animal>, ShelterItem<Animal> {
    private int id;
    private String name;
    private LocalDate birthDay;
    private String color;
    public String animalType;
    public List<String> commands;

    public Animal(String name, LocalDate birthDay, String color) {
        this.id = -1;
        this.name = name;
        this.birthDay = birthDay;
        this.color = color;
        this.animalType = "Неопознанный зверь";
        this.commands = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getColor() {
        return color;
    }

    public String getAnimalType() {
        return animalType;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public void addCommand(String command) {
        this.commands.add(command);
    }

    public String showCommands(){
        if (!(this.commands.isEmpty())){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(name + " умеет: ");
            stringBuilder.append(this.commands);
            return stringBuilder.toString();
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ID: ");
        stringBuilder.append(id);
        stringBuilder.append(", ");
        stringBuilder.append(animalType);
        stringBuilder.append(", Имя: ");
        stringBuilder.append(name);
        stringBuilder.append(", Дата рождения: ");
        stringBuilder.append(birthDay);
        stringBuilder.append(", Окрас: ");
        stringBuilder.append(color);

        return stringBuilder.toString();
    }

    @Override
    public int compareTo(Animal o) {
        return this.birthDay.compareTo(o.birthDay);
    }
}
