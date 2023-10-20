package org.gr40in.app.commands;


import org.gr40in.app.ConsoleApp;

public class CommandShowAll extends Commands {
    public CommandShowAll(ConsoleApp app) {
        super("Show all: ", app);
    }

    @Override
    public void run() {
        getApp().showAll();
    }
}
