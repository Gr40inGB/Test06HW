package org.gr40in.app.commands;


import org.gr40in.app.ConsoleApp;

public class CommandExit extends Commands {
    public CommandExit(ConsoleApp app) {
        super("Exit: ", app);
    }

    @Override
    public void run() {
        getApp().exit();
    }
}
