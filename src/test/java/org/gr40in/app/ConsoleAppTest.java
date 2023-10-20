package org.gr40in.app;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.*;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ConsoleAppTest {


    @Test
    void isRun() {
        ConsoleApp consoleApp = new ConsoleApp();
        assertTrue(consoleApp.isRun());
    }

    @Test
    void exit() {
        ConsoleApp consoleApp = new ConsoleApp();
        consoleApp.exit();
        assertFalse(consoleApp.isRun());
    }

    @Test
    void getMenu() {

    }

    @Test
    void runComparer() {


    }

    @Test
    void run() {
    }

    @Test
    void showInfo() {



    }

    @Test
    void showMenu() {
    }

    @Test
    void getInfo() {

    }

    @Test
    void fullTest() {
        ConsoleApp app = new ConsoleApp();
        app.run();

        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("1".getBytes()));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);


        System.setIn(stdin);
        System.setOut(stdout);
    }
}