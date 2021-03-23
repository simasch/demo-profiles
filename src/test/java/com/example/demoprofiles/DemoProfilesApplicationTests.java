package com.example.demoprofiles;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class DemoProfilesApplicationTests {

    @Value("${key}")
    private String key;

    @Test
    void contextLoads() {
        System.out.println("Key: " + key);
    }

}
