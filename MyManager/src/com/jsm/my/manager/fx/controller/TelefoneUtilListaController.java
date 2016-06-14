/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.fx.controller;

import com.jsm.my.manager.controller.TelefoneUtilController;
import com.jsm.my.manager.fx.main.TelefoneUtilFXML;
import com.jsm.my.manager.model.TelefoneUtilVO;
import com.jsm.my.manager.property.TelefoneUtilProperty;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author moises
 */
public class TelefoneUtilListaController implements Initializable {
    
    public static boolean DESABLE_BUTTON_NEW = true;

    @FXML
    private TableColumn clKeyword;

    @FXML
    private TextField tfCampoPesquisa;

    @FXML
    private TableColumn clDescricao;

    @FXML
    private TableColumn clTelefone;

    @FXML
    private TableColumn<?, ?> clObjectId;

    @FXML
    private TableView<TelefoneUtilProperty> table;

    @FXML
    private TableColumn clDDD;

    @FXML
    private Button btNovo;
    
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        /*
           private StringProperty objectId;
    private StringProperty ddd;
    private StringProperty telefone;
    private StringProperty keyword;
    private StringProperty descricao;
         */

        ObservableList<TelefoneUtilProperty> dados = FXCollections.observableArrayList();
        List<TelefoneUtilVO> telefones = new TelefoneUtilController().getAll();
        for (TelefoneUtilVO t : telefones) {
            dados.add(new TelefoneUtilProperty(t));
            System.out.println("xx" + t.toString());
        }

        //clDDD.setCellValueFactory(new PropertyValueFactory<>("objectId"));
        clDDD.setCellValueFactory(new PropertyValueFactory("ddd"));
        clTelefone.setCellValueFactory(new PropertyValueFactory("telefone"));
        clKeyword.setCellValueFactory(new PropertyValueFactory("keyword"));
        clDescricao.setCellValueFactory(new PropertyValueFactory("descricao"));
        clObjectId.setCellValueFactory(new PropertyValueFactory("objectId"));

        table.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
                    System.out.println(table.getSelectionModel().getSelectedItem());
                    
                    //lblInfo.setText(((TelefoneUtilProperty)table.getSelectionModel().getSelectedItem()).descricaoProperty().getValue());
                }
            }
        });      
        
        table.setItems(dados);
        
        btNovo.setDisable(DESABLE_BUTTON_NEW);
    }
    
    
    @FXML
    public void cadastrarNovo(){
        new TelefoneUtilFXML().start(new Stage());
    }

}
