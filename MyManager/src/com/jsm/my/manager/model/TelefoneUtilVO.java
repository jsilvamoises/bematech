/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import org.hibernate.annotations.Type;

/**
 *
 * @author moises
 */
@Entity
@Table(name = "telefone_util")
public class TelefoneUtilVO implements Serializable {

    @Transient
    private SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

    //NOME DA TABELA DO BANCO DE DADOS
    public static final String TABLE_NAME = "TELEFONE_UTIL";
    //CAMPOS DA TABELA DO BANCO DE DADOS
    public static final String COLUMN_OBJECT_ID = "object_id";
    public static final String COLUMN_DDD = "ddd";
    public static final String COLUMN_TELEFONE = "telefone";
    public static final String COLUMN_KEYWORD = "keyword";
    public static final String COLUMN_DESCRICAO = "descricao";
    //ARRAY DE CAMPOS DA TABELA
  //  public static final String CAMPOS[] = {COLUMN_OBJECT_ID, COLUMN_DDD, COLUMN_TELEFONE, COLUMN_KEYWORD, COLUMN_DESCRICAO, COLUMN_DATA_CADASTRO, COLUMN_DATA_ATUALIZACAO};
    //CRIACÃO DA TABELA NO BANCO
    public static final String CREATE_TABLE = ""
            + "CREATE TABLE IF NOT EXISTS "
            + "TELEFONE_UTIL("
            + "object_id TEXT NOT NULL, "
            + "ddd INTEGER NOT NULL, "
            + "telefone TEXT NOT NULL, "
            + "keyword TEXT, "
            + "descricao TEXT NOT NULL, "
            + "data_cadastro DATE, "
            + "data_atualizacao DATE"
            + ");";

    public String insertInto() {
      String campos = "";
       /* 
        for (String s : CAMPOS) {
            campos += s + ",";
        }
        campos = campos.substring(0, campos.length() - 1);
        String insert = "INSERT INTO " + TABLE_NAME + "("
                + "" + campos + ""
                + ") VALUES("
                + "'" + this.objectId + "',"
                + "" + this.ddd + ","
                + "'" + this.telefone + "',"
                + "'" + this.keyword + "',"
                + "'" + this.descricao + "',"
                + "'" + formatoData.format(Calendar.getInstance().getTime()) + "',"
                + "'" + formatoData.format(Calendar.getInstance().getTime()) + "'"
                + ")";*/

        return "";
    }

    public String deleteByObjectId() {
        return "DELETE FROM " + TABLE_NAME + " WHERE " + COLUMN_OBJECT_ID + " LIKE " + this.getObjectId();
    }

    public static String SELECT_ALL() {
        return "SELECT * FROM " + TABLE_NAME;
    }
    //PROPRIEDADES DO OBJETO
    @Id
    @Type(type = "uuid-char")
    @Column(name = "object_id")
    private UUID objectId;
    @Column(name = "ddd")
    private String ddd;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "keyword")
    private String keyword;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "data_registro")
    //@Temporal(javax.persistence.TemporalType.DATE)
    private Long dataRegistro;
    @Column(name = "data_atualizacao")
    //@Temporal(javax.persistence.TemporalType.DATE)
    private Long dataAtualizacao;

    //CONSTRUTOR QUE CRIA O ID DO OBJETO
    public TelefoneUtilVO() {

    }

    public UUID getObjectId() {
        return objectId;
    }

    public void setObjectId(UUID objectId) {
        this.objectId = objectId;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
     
    
    @Override
    public String toString() {
        return "TelefoneUtilVO{" + "formatoData=" + formatoData + ", objectId=" + objectId + ", ddd=" + ddd + ", telefone=" + telefone + ", keyword=" + keyword + ", descricao=" + descricao + '}';
    }

    public Long getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Long dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Long getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Long dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
    
    
    

}
