package com.poetry.impl;

import com.poetry.port.ObtainPoem;
import com.poetry.port.RequestVerse;

public class PoetryReader implements RequestVerse {
    ObtainPoem obtainPoem;

    public PoetryReader() {
        this.obtainPoem = new ObtainPoem() {
        };
    }

    public PoetryReader(ObtainPoem obtainPoem) {
        this.obtainPoem = obtainPoem;
    }

    @Override
    public String getVerse() {
        return "Hello Nirmala";
    }

    @Override
    public String getVerseFromPoem() {
        return obtainPoem.getVerseFromPoem();
    }
}