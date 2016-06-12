/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.model;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author moises
 */
public class Informacoes extends BasicEntity implements Serializable{
    //ARRAY DE CAMPOS DA TABELA
    public static final String CAMPOS[]={COLUMN_DATA_CADASTRO,COLUMN_DATA_ATUALIZACAO};
    private UUID objectId;
    private String title;
    private String informacao;
    private String keyword;

    public Informacoes() {
        this.objectId =UUID.randomUUID();
    }

    public UUID getObjectId() {
        return objectId;
    }

    public void setObjectId(UUID objectId) {
        this.objectId = objectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    
    
    
    
}
