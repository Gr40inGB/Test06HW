package org.gr40in.app.commands;


import org.gr40in.app.ConsoleApp;

public class CommandListComparerRun extends Commands {
    public CommandListComparerRun(ConsoleApp app) {
        super("Run comparison numbers lists ", app);
    }

    @Override
    public void run() {
        getApp().runComparer();
    }
}
