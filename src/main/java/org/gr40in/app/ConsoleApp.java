package org.gr40in.app;


import org.gr40in.app.commands.*;
import org.gr40in.model.NumbersListComparer;
import org.gr40in.model.NumbersListComparerService;
import org.gr40in.model.StringToDoubleParseException;

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

    private String getValidData(String message) {
        boolean error = true;
        String result = "";
        while (error) {
            result = getInfo("Please enter first numbers list: ");
            if (NumbersListComparerService.stringDataIsOk(result)) error = false;
        }
        return result;
    }

    public void runComparer() {
        String firstListString = getInfo("Please enter first numbers list: ");
        String secondListString = getInfo("Please enter second numbers list: ");
        NumbersListComparer numbersListComparer = new NumbersListComparer(
                NumbersListComparerService.parseStringDataToNumbersList(firstListString),
                NumbersListComparerService.parseStringDataToNumbersList(secondListString));
        showInfo(numbersListComparer.getComparerResult());
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
        System.out.print(message);
    }

    @Override
    public void showMenu() {
        System.out.println("\nMain menu: ");
        for (int i = 0; i < this.menu.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + menu.get(i).getName());
        }
    }

    @Override
    public String getInfo(String welcome) {
        showInfo(welcome);
        return this.scanner.nextLine();
    }
}
