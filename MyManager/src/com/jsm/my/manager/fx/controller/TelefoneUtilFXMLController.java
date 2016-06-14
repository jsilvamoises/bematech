/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.fx.controller;

import com.jsm.my.manager.controller.TelefoneUtilController;
import com.jsm.my.manager.fx.main.TelefoneUtilLista;
import com.jsm.my.manager.model.TelefoneUtilVO;
import com.jsm.my.manager.util.ClearFields;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;
import java.util.UUID;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author moises
 */
public class TelefoneUtilFXMLController implements Initializable {

    public static final String BUNDLE_TELEFONE_UTIL_VO = "TVO";
    @FXML
    private TextField tfDDD;

    @FXML
    private TextField tfKeyword;

    @FXML
    private TextField tfTelefone;

    @FXML
    private Button btExcluir;

    @FXML
    private Button btLista;

    @FXML
    private Button btSalvar;

    @FXML
    private Button btEditar;

    @FXML
    private TextArea tfDescricao;
    public static TelefoneUtilVO tuvo = null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tfDDD.setOnKeyReleased((KeyEvent) -> {
            if (tfDDD.getText().length() == 2) {
                tfTelefone.requestFocus();
            }
            if (tfDDD.getText().length() > 2) {
                tfDDD.setText(tfDDD.getText().substring(0, 2));
            }
        });
        btSalvar.setOnMouseClicked((MouseEvent event) -> {
            if (tuvo == null) {
                salvar();
            } else {
                editar();
            }
        });

        btEditar.setOnMouseClicked((MouseEvent event) -> {
            System.out.println("Me clicou !!!!" + btEditar.getText());
        });

        btExcluir.setOnMouseClicked((MouseEvent event) -> {
            System.out.println("Me clicou !!!!" + btExcluir.getText());
        });

        btLista.setOnMouseClicked((MouseEvent event) -> {           
            TelefoneUtilListaController.DESABLE_BUTTON_NEW=true;//Desabilita o botão evitando que uma nova janela de cadastro seja aberta.
            new TelefoneUtilLista().start(new Stage());//
        });
        
        tfDDD.requestFocus();
        ativarBotoes();//Ativa e desativa os botões

    }

    private void salvar() {
        tuvo = new TelefoneUtilVO();//Cria um novo Objeto
        try {
            if (validaTelefone()) {
                tuvo.setDataAtualizacao(Calendar.getInstance().getTimeInMillis());
                tuvo.setDataRegistro(Calendar.getInstance().getTimeInMillis());
                tuvo.setDdd(tfDDD.getText());
                tuvo.setDescricao(tfDescricao.getText());
                tuvo.setKeyword(tfKeyword.getText());
                tuvo.setObjectId(UUID.randomUUID());
                tuvo.setTelefone(tfTelefone.getText());

                int res = new TelefoneUtilController().save(tuvo);//Salva no banco de dados
                
                if (res > 0) {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Informação");
                    alert.setHeaderText("Inclusão");
                    alert.setContentText("Salvo com sucesso!!!!");
                    alert.showAndWait();
                    tuvo =null;
                    limparCampos();
                    tfDDD.requestFocus();
                }else{
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Informação");
                    alert.setHeaderText("Inclusão");
                    alert.setContentText("Erro ao salvar registro!!!!");
                    alert.showAndWait();
                }
            } else {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Informação");
                alert.setHeaderText("Erro");
                alert.setContentText("Verifique os campos necessários para salvar esse registro!\n"
                        + "" + (tfDDD.getText().length() == 0 ? "DDD é um campo necessário" : "")
                        + "" + (tfTelefone.getText().length() < 8 ? "\nTelefone é um campo necessário" : "")
                        + "" + (tfDescricao.getText().length() < 8 ? "\nDescrição é um campo necessário" : ""));

                alert.showAndWait();
            }
           
            ativarBotoes();
        } catch (Exception e) {
            e.printStackTrace();
        }

        tuvo = null;//Cria um novo Objeto
    }

    private void limparCampos() {
        ClearFields.getInstance().clear(tfDDD, tfDescricao, tfKeyword, tfTelefone);
    }

    private void editar() {

    }

    private void excluir() {

    }

    private void mostrarLista() {

    }

    private boolean validaTelefone() {
        return !tfDDD.getText().isEmpty() && !tfTelefone.getText().isEmpty() && !tfDescricao.getText().isEmpty();

    }
    
    
     private void ativarBotoes(){
         setButtonEnable(tuvo!=null, btSalvar);//Ativa botões quando tuvo e null
         setButtonEnable(tuvo==null, btEditar,btExcluir);//Ativa botões quando tuvo e null
        
    }
    
    public void setButtonEnable(boolean value,Button... bs){
        for(Button b:bs){
            b.setDisable(value);
        }
    }

}
