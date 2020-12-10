package com.poetry.port;

public interface ObtainPoem {
    default String getVerseFromPoem() {
        return "Stopping by Woods on a Snowy Evening";
    }
}
