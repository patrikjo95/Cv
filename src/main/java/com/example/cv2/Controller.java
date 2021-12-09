package com.example.cv2;


import Hangman.Game;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {

    public void aboutButtonClicked()throws Exception{
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(GUI.class.getResource("about.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setScene(scene);
        stage.setTitle("About, Patrik J");
        stage.show();
    }

    public void careerButtonClicked()throws Exception{
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(GUI.class.getResource("career.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setScene(scene);
        stage.setTitle("Career, Patrik J");
        stage.show();

    }

    public void educationButtonClicked()throws Exception{
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(GUI.class.getResource("education.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setScene(scene);
        stage.setTitle("Education, Patrik J");
        stage.show();

    }

    public void hangManClicked(){
        Game game = new Game();
        game.startGame();

    }

    public void closeClicked(){
        System.exit(0);
    }

}