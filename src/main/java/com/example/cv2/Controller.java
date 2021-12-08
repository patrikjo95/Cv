package com.example.cv2;


import Hangman.Game;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    public void aboutButtonClicked() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(GUI.class.getResource("aboutPatrik.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setScene(scene);
        stage.setTitle("CV, Patrik J");
        stage.show();

    }

    public void careerButtonClicked(){
        System.out.println("Arbetslivserfarenhet");

    }

    public void educationButtonClicked(){
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