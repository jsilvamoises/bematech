/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

/**
 *
 * @author moises
 */
public class TelefoneUtilVO extends BasicEntity implements Serializable {

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
    public static final String CAMPOS[] = {COLUMN_OBJECT_ID, COLUMN_DDD, COLUMN_TELEFONE, COLUMN_KEYWORD, COLUMN_DESCRICAO, COLUMN_DATA_CADASTRO, COLUMN_DATA_ATUALIZACAO};
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
        String campos="";
        for(String s:CAMPOS){
            campos+=s+",";
        }
        campos = campos.substring(0, campos.length()-1);
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
                + ")";

        return insert;
    }
    public String deleteByObjectId(){
        return "DELETE FROM "+TABLE_NAME+" WHERE "+COLUMN_OBJECT_ID+" LIKE "+this.getObjectId();
    }
    
    public static String SELECT_ALL(){
        return "SELECT * FROM "+TABLE_NAME;
    }
    //PROPRIEDADES DO OBJETO
    private UUID objectId;
    private String ddd;
    private String telefone;
    private String keyword;
    private String descricao;

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
   
}
