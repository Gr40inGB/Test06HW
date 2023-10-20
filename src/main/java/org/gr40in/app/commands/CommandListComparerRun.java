package org.gr40in.app.commands;


import org.gr40in.app.ConsoleApp;
import org.gr40in.model.StringToDoubleParseException;

public class CommandListComparerRun extends Commands {
    public CommandListComparerRun(ConsoleApp app) {
        super("Run comparison numbers lists ", app);
    }

    @Override
    public void run() {
        getApp().runComparer();
    }
}
