/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.fx.main;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author moises
 */
public class TelefoneUtilFXML extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = null ;
        try {
            root = FXMLLoader.load(getClass().getResource("/com/jsm/my/manager/fx/view/TelefoneUtilFXML.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(TelefoneUtilFXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Scene scene = new Scene(root);
        primaryStage.setOnCloseRequest((WindowEvent event) -> {
            System.exit(0);
        });
        
        primaryStage.setResizable(false);
        primaryStage.setTitle("My Manager 1.0");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
