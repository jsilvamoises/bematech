/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.model;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author moises
 */
public abstract class BasicEntity implements Serializable{
    public static final String COLUMN_DATA_CADASTRO="data_cadastro";
    public static final String COLUMN_DATA_ATUALIZACAO="data_atualizacao";
     private Calendar dataRegistro;
     private Calendar dataAtualizacao;

    public Calendar getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Calendar dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
     
     
     
    
}
