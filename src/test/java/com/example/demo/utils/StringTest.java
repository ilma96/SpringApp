package com.example.demo.utils;

import com.example.demo.services.StringService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    public void testAdd3() {
        StringService rs = new StringService();
        Assertions.assertEquals("gnirps", rs.reverseAString("spring"));
    }
}
