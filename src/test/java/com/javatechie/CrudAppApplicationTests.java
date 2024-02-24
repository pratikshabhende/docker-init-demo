package com.javatechie;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class CrudAppApplicationTests {

    @Test
    void contextLoads() {
        //sample test
        int i = 10;
        int j = 10;
        log.info("Test method executed with value i {} and j {}", i, j);
        assertEquals(i, j);
    }

}
