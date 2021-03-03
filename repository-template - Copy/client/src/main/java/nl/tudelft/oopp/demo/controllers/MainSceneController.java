package nl.tudelft.oopp.demo.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import nl.tudelft.oopp.demo.communication.ServerCommunication;

import java.util.List;

public class MainSceneController {

    @FXML
    private TextField user;
    @FXML
    private TextArea question;

    /**
     * Handles clicking the button.
     */
    public void buttonClicked() {
        ServerCommunication.submitQuestion(user.getText(), question.getText());
    }
}
