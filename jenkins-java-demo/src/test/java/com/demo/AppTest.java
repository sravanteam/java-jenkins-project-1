package com.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGreet() {
        String result = App.greet("World");
        assertEquals("Hello, World! Jenkins + Maven + Java CI/CD is working!", result);
    }
}
