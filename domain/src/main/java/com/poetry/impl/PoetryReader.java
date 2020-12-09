package com.poetry.impl;

import com.poetry.port.RequestVerse;

public class PoetryReader implements RequestVerse {
    public String getVerse() {
        return "Hello Nirmala";
    }
}