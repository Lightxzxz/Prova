package com.example.prova;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Gerenciar Tarefas");
    }
    public void adicionarTarefa(){
    }
}