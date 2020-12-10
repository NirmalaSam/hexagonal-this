package com.poetry;

import com.poetry.impl.PoetryReader;
import com.poetry.port.ObtainPoem;
import com.poetry.port.RequestVerse;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class PoetryTest {

    @Test
    @DisplayName("Should get hardcoded verse when asked for poetry")
    public void testTheLeftSidePort() {
        RequestVerse requestVerse = new PoetryReader();
        String verse = requestVerse.getVerse();
        Assertions.assertEquals("Stopping by Woods on a Snowy Evening", verse);
    }

    @Test
    @DisplayName("Should get verse when asked for poetry from stub")
    public void testTheRightSidePort(@Mock ObtainPoem obtainPoem) {
        Mockito.when(obtainPoem.getVerseFromPoem()).thenReturn("Stopping by Woods on a Snowy Evening");
        RequestVerse requestVerse = new PoetryReader(obtainPoem);
        String verse = requestVerse.getVerse();
        Assertions.assertEquals("Stopping by Woods on a Snowy Evening", verse);
    }
}
