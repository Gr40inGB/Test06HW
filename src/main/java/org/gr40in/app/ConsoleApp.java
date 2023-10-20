package org.gr40in.app;


import org.gr40in.app.commands.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleApp implements AppInterface<String> {
    private List<Commands> menu;
    private boolean run;
    private Scanner scanner;
    public ConsoleApp() {
        this.scanner = new Scanner(System.in);
        this.run = true;
        this.menu = new ArrayList<>();
        menu.add(new CommandListComparerRun(this));
        menu.add(new CommandShowAll(this));
        menu.add(new CommandExit(this));
    }

    public boolean isRun() {
        return run;
    }

    public void exit() {
        System.out.println("buy buy ;)");
        this.run = false;
    }

    public List<Commands> getMenu() {
        return this.menu;
    }


    public void runComparer() {

        System.out.print("Please enter new Contact\n>>>>> ");
        String userInput = scanner.nextLine();

    }


    public void showAll() {

    }

    public void run() {
        while (this.isRun()) {
            showMenu();
            Commands selected = this.getMenu().
                    get(inputNumber("\nEnter selected command number: ", this.getMenu().size()) - 1);
            selected.run();
        }
    }

    private int inputNumber(String welcome, int biggest) {
        boolean inputError = true;
        int rezult = 0;
        while (inputError) {
            System.out.print(welcome);
            try {
                rezult = Integer.parseInt(scanner.nextLine());
                if (rezult <= biggest && rezult > 0) {
                    inputError = false;
                } else System.out.print("Choose between 1-" + biggest + "\n>>>> ");
            } catch (NumberFormatException nfe) {
                System.out.println("error - try again:");
            }
        }
        return rezult;
    }

    @Override
    public void showInfo(String message) {

    }

    @Override
    public void showMenu() {
        System.out.println("Main menu: ");
        for (int i = 0; i < this.menu.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + menu.get(i).getName());
        }
    }

    @Override
    public String getInfo() {
        return null;
    }
}
