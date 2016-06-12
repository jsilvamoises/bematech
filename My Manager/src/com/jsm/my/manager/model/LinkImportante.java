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
public class LinkImportante extends BasicEntity implements Serializable{
    //ARRAY DE CAMPOS DA TABELA
    public static final String CAMPOS[]={COLUMN_DATA_CADASTRO,COLUMN_DATA_ATUALIZACAO};
    private UUID objectId;
    private String link;
    private String descricao;
    private String keyword;

    public LinkImportante() {
        this.objectId = UUID.randomUUID();
    }

    public UUID getObjectId() {
        return objectId;
    }

    public void setObjectId(UUID objectId) {
        this.objectId = objectId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    
    
}
