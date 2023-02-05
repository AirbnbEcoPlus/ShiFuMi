package fr.endide.shifumi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class shifumiController {
    @FXML
    private Button cisorBtn;

    @FXML
    private Button paperBtn;

    @FXML
    private ListView<String> resultList;

    @FXML
    private Button rockBtn;

    @FXML
    void onClickCisor(ActionEvent event) {
        shifumiApplication.play(resultList, 2);
    }

    @FXML
    void onClickPaper(ActionEvent event) {
        shifumiApplication.play(resultList, 1);

    }

    @FXML
    void onClickRock(ActionEvent event) {
        shifumiApplication.play(resultList, 0);

    }
}