/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.property;

import com.jsm.my.manager.model.TelefoneUtilVO;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author moises
 * 
 *  private UUID objectId;
    private String ddd;
    private String telefone;
    private String keyword;
    private String descricao;
 */
public class TelefoneUtilProperty {
    private StringProperty objectId;
    private StringProperty ddd;
    private StringProperty telefone;
    private StringProperty keyword;
    private StringProperty descricao;

    public TelefoneUtilProperty() {
    }
    
    public TelefoneUtilProperty(TelefoneUtilVO telefone) {
        this.objectId = new SimpleStringProperty(telefone.getObjectId().toString());
        this.ddd = new SimpleStringProperty(telefone.getDdd());
        this.telefone = new SimpleStringProperty(telefone.getTelefone());
        this.keyword = new SimpleStringProperty(telefone.getKeyword());
        this.descricao = new SimpleStringProperty(telefone.getDescricao());
    }

    public StringProperty objectIdProperty() {
        return objectId;
    }

    public StringProperty dddProperty() {
        return ddd;
    }

    public StringProperty telefoneProperty() {
        return telefone;
    }

    public StringProperty keywordProperty() {
        return keyword;
    }

    public StringProperty descricaoProperty() {
        return descricao;
    }

    public void setObjectId(StringProperty objectId) {
        this.objectId = objectId;
    }

    public void setDdd(StringProperty ddd) {
        this.ddd = ddd;
    }

    public void setTelefone(StringProperty telefone) {
        this.telefone = telefone;
    }

    public void setKeyword(StringProperty keyword) {
        this.keyword = keyword;
    }

    public void setDescricao(StringProperty descricao) {
        this.descricao = descricao;
    }
    
    
    
    
    
}
