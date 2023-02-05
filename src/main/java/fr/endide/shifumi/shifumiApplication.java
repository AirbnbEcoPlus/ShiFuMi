package fr.endide.shifumi;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class shifumiApplication extends Application {
    public static int wine;
    public static int loose;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(shifumiApplication.class.getResource("base.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Shifumi");
        stage.setScene(scene);
        stage.show();
    }

    public static void play(ListView<String> view, int selected){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);
        switch (selected){
            case 0:
                if(randomNum == 1){
                    drawResults(view, false);
                }else{
                    drawResults(view, true);
                }
            case 1:
                if(randomNum == 2){
                    drawResults(view, false);
                }else{
                    drawResults(view, true);
                }
            case 2:
                if(randomNum == 0){
                    drawResults(view, false);
                }else{
                    drawResults(view, true);
                }
        }
    }

    public static void drawResults(ListView<String> view, boolean win){
        if(win == true){
            wine++;
            view.getItems().add("Vous avez Gagné, Score = " + wine + File.separator + loose);
        }else{
            loose++;
            view.getItems().add("Vous avez Perdu, Score = " + wine + File.separator + loose);
        }

    }

    public static void main(String[] args) {
        launch();
    }
}