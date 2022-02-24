package com.example.cv2;


import Hangman.Game;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {


    public void aboutButtonClicked() throws IOException{
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(GUI.class.getResource("about.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setScene(scene);
        stage.setTitle("About Patrik J");
        stage.show();
        stage.setResizable(false);

    }

    public void careerButtonClicked() throws IOException{
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(GUI.class.getResource("career.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setScene(scene);
        stage.setTitle("Career Patrik J");
        stage.show();
        stage.setResizable(false);

    }

    public void educationButtonClicked() throws IOException{
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(GUI.class.getResource("education.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setScene(scene);
        stage.setTitle("Educations Patrik J");
        stage.show();
        stage.setResizable(false);

    }

    public void hangManClicked(){
        Game game = new Game();
        game.startGame();

    }

    public void closeClicked(){
        System.exit(0);
    }

}