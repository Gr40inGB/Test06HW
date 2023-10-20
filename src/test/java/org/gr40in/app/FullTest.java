package org.gr40in.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import java.io.*;

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
    @Test
    public void givenSystemInRedirection_whenInvokePrintln_thenOutputIsCaptor() {
        ConsoleApp app = new ConsoleApp();
        app.run();
        byte[] firstCom = "1".getBytes();
        InputStream in = new ByteArrayInputStream(firstCom);
        System.setIn(in);

    }
}
