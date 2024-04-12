package animal_shelter.view;

import animal_shelter.model.writer.Writable;
import animal_shelter.presenter.Presenter;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private Menu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new Menu(this);
    }

    @Override
    public void start() {
        System.out.println("Начинаем работу. \n");
        while (work){
            printMenu();
            scanMenu();
        }
    }

    public void scanMenu() {
        int choice = checkInt();
        try {
            if ( choice > 0 && choice <= menu.size()){
                menu.execute(choice);
            }
            else error();
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private int checkInt(){
        int value = 0;
        boolean flag = true;
        while (flag){
            String string = scanner.nextLine();
            if(string.matches("[0-9]+")){
                value = Integer.parseInt(string);
                flag = false;
            } else { System.out.println("Вы ввели неверное значение"); }
        }
        return value;
    }

    private int checkId(){
        int id = 0;
        boolean flag = true;
        while (flag){
            id = checkInt();
            if(presenter.checkId(id)) {
                flag = false;
            }
            else {System.out.println("Вы ввели неверное значение");}
        }
        return id;
    }

    public void error() {
        System.out.println("Введено неверное значение");
    }

    public void finish() {
        System.out.println("Работа завершена");
        work = false;
    }

    public void amountOfAnimalsImTheShelter() {
        presenter.amountOfAnimalsImTheShelter();
    }

    public void sortByBirthday() {
        presenter.sortByBirthday();
    }

    public void learnNewCommand() {
        presenter.getAnimalList();
        System.out.println("Напишите название команды");
        String command = scanner.nextLine();
        System.out.println("Укажите ID животного");
        int id = checkId();
        presenter.learnNewCommand(command, id);
    }

    public void commandsList() {
        System.out.println("Укажите ID животного");
        int id = checkId();
        presenter.commandsList(id);
    }

    public void addAnimalToTheShelter() {
        System.out.println("Укажите имя животного");
        String name = scanner.nextLine();
        System.out.println("Укажите дату рождения животного в формате YYYY-MM-DD:");
        LocalDate birthDay = LocalDate.parse(scanner.nextLine());
        System.out.println("Укажите окрас животного");
        String color = scanner.nextLine();
        System.out.println("Укажите тип животного (dog / cat / hamster / horse / camel / donkey)");
        String type = scanner.nextLine();
        presenter.addAnimalToTheShelter(name, birthDay, color, type);
    }


    public void printMenu() {
        System.out.println(menu.print());
    }

    @Override
    public void answer(String answer) {
        System.out.println(answer);
        System.out.println("\n");
    }

    public void setWritable(Writable writable){
        presenter.setWritable(writable);
    }

    public void save(){
        presenter.save();
    }

    public void load() {
        try {
            presenter.load();
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
