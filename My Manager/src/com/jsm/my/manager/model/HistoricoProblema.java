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
public class HistoricoProblema extends BasicEntity implements Serializable{
    //ARRAY DE CAMPOS DA TABELA
    public static final String CAMPOS[]={COLUMN_DATA_CADASTRO,COLUMN_DATA_ATUALIZACAO};
    private UUID objectId;
    private String titulo;
    private String descricaoProblema;
    private String descricaoSolucao;
    private String keyword;
}
