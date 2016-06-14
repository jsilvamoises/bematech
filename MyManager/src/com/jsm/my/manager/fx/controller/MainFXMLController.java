/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.fx.controller;

import com.jsm.my.manager.fx.main.TelefoneUtilFXML;
import com.jsm.my.manager.fx.main.TelefoneUtilLista;
import com.jsm.my.manager.util.RuntimeExec;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author moises
 */
public class MainFXMLController implements Initializable {
    
    @FXML
    private MenuItem miExecEditorTXT;

    @FXML
    private MenuItem miCadScriptSQL;

    @FXML
    private MenuItem miRelTelefone;

    @FXML
    private MenuItem miCadTelefone;

    @FXML
    private MenuItem miRelHistorico;

    @FXML
    private MenuItem miRelScriptSQL;

    @FXML
    private Menu menuCadastro;

    @FXML
    private MenuItem miCadLinks;

    @FXML
    private MenuItem miCadHistorico;

    @FXML
    private MenuItem miCadInformacao;

    @FXML
    private MenuItem miExecExcel;

    @FXML
    private MenuItem miExecCalculadora;

    @FXML
    private Menu menuHistorico;

    @FXML
    private MenuItem miRelScriptCMD;

    @FXML
    private Menu menuSair;

    @FXML
    private Menu menuFerramentas;

    @FXML
    private MenuItem miRelLink;

    @FXML
    private MenuItem miRelInformacao;

    @FXML
    private MenuItem miExecWord;

    @FXML
    private MenuItem miCadScriptCMD;

   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    
    @FXML
    public void callCalc(){
        RuntimeExec.exec(RuntimeExec.CALC);
    }
    
    @FXML
    public void callNotepad(){
        if(RuntimeExec.exec(RuntimeExec.NOTEPAD_PLUS_PLUS)==0){
            RuntimeExec.exec(RuntimeExec.NOTEPAD_WINDOWS);
        }
    }
    
    
    @FXML
    public void callWord(){
         RuntimeExec.exec(RuntimeExec.WORD);
    }
    
    @FXML
    public void callExcel(){
        RuntimeExec.exec(RuntimeExec.EXCEL);
    }
    
    @FXML
    public void abrirCadastroTelefone(){        
        new TelefoneUtilFXML().start(new Stage());
    }
    
    @FXML
    public void listarTelefones(){
        TelefoneUtilListaController.DESABLE_BUTTON_NEW=false;//Indica que é pra mostrar o botão de cadastro de novo
        new TelefoneUtilLista().start(new Stage());
    }
    
    
}
