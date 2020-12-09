package com.poetry;

import com.poetry.impl.PoetryReader;
import com.poetry.port.RequestVerse;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class PoetryTest {

    @Test
    @DisplayName("Should get verse when asked for poetry")
    public void testTheLeftSidePort() {
        RequestVerse requestVerse = new PoetryReader();
        String verse = requestVerse.getVerse();
        Assertions.assertEquals("Hello Nirmala", verse);
    }
}
