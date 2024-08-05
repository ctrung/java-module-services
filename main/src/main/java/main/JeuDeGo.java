package main;

import org.example.api.JoueurDeGo;

public class JeuDeGo {
    public static void main(String[] args) {
        System.out.println("hello");
        for (var j : JoueurDeGo.getJoueursDeGo()) {
            System.out.println(j.playAMove());
        }
    }
}
