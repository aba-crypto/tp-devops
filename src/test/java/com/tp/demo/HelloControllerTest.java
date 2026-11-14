package com.tp.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    void helloReturnsMessage() {
        HelloController controller = new HelloController();
        assertEquals("Hello DevOps!", controller.hello());
    }
}