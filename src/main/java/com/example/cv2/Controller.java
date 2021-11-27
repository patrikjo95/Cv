package com.example.cv2;


import Hangman.Game;

public class Controller {

    public void aboutButtonClicked(){
        System.out.println("Om patrik");

    }

    public void arbetslivButtonClicked(){
        System.out.println("Arbetslivserfarenhet");

    }

    public void utbildningarButtonClicked(){
        System.out.println("Utbildningar");

    }

    public void hangManClicked(){
        Game game = new Game();
        game.startGame();

    }

    public void closeClicked(){
        System.exit(0);
    }

}