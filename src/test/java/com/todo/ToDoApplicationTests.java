package com.todo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ToDoApplicationTests {

    public static final Logger LOGGER = LoggerFactory.getLogger(ToDoApplicationTests.class);
    @Test
    void contextLoads() {
        LOGGER.info("Tests executed...");
        assertEquals(true, true);
    }

}
