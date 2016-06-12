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
public class ScriptSQL extends BasicEntity implements Serializable {
    //ARRAY DE CAMPOS DA TABELA
    public static final String CAMPOS[]={COLUMN_DATA_CADASTRO,COLUMN_DATA_ATUALIZACAO};

    private UUID objectId;
    private String descricao;
    private String comando;
    private String keyword;

    public ScriptSQL() {
        this.objectId = UUID.randomUUID();
    }

    public UUID getObjectId() {
        return objectId;
    }

    public void setObjectId(UUID objectId) {
        this.objectId = objectId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    
    
    
}
