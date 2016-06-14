/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.fx.main;

import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author moises
 */
public class TelefoneUtilLista extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/com/jsm/my/manager/fx/view/TelefoneUtilLista.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(TelefoneUtilFXML.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scene scene = new Scene(root);
        primaryStage.setMaximized(true);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
