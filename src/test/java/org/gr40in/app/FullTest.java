package org.gr40in.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FullTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @Test
    public void givenSystemOutRedirection_whenInvokePrintln_thenOutputIsCaptor() {
        ConsoleApp app = new ConsoleApp();
        app.showInfo("bla bla");
        assertEquals("bla bla", outputStreamCaptor.toString().trim());
    }
}
