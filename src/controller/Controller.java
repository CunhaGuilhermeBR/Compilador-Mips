package controller;

import data.FileSystem;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Compiler;

import java.io.IOException;

public class Controller {
    @FXML
    private TextArea textCode;

    @FXML
    private TextField textResp;

     public void handleButEdit(){
     textCode.setEditable(true);
     }

     public void handleExter(){
         textCode.setEditable(false);
         textCode.setText(String.valueOf(FileSystem.read("codigo.txt")));
     }

     public void handleRun() throws IOException {
         if (textCode.getText() != null){
             Compiler.esvaziar();
             textResp.setText(Compiler.findOperation() + " \n Resultados " + Compiler.getResultados().toString());

         }
     }
}
