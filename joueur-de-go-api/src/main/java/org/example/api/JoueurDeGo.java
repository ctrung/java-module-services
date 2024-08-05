package org.example.api;

import java.util.ServiceLoader;

public interface JoueurDeGo {
    String playAMove();

    static Iterable<JoueurDeGo> getJoueursDeGo() {
        return ServiceLoader.load(JoueurDeGo.class);
    }
}
