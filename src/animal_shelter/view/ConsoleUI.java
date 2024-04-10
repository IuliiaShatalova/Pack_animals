package animal_shelter.view;

import animal_shelter.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private Menu menu;

    @Override
    public void start() {
        System.out.println("Начинаем работу.");
        while (work){
            printMenu();
            scanMenu();
        }
    }

    private void printMenu() {
        System.out.println("1. ");
    }

    @Override
    public void answer(String answer) {
        System.out.println(answer);
    }
}
