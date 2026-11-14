package com.tp.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    void helloReturnsMessage() {
        assertEquals("Greetings, DevOps!", new HelloController().hello());
    }

    @Test
    void versionReturns100() {
        assertEquals("1.0.0", new HelloController().version());
    }
}
