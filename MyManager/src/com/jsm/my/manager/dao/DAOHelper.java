/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.dao;

import com.jsm.my.manager.model.TelefoneUtilVO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.jsm.my.manager.util.SystemLoad;
import com.jsm.my.manager.util.SystemProperties;
import java.io.File;

/**
 *
 * @author Moises
 */
public class DAOHelper {

    private Connection conection;
    private Statement stm;
    private static final String PATH = "C:\\database\\";
    private static final String DB_NAME = "manager.sqlite3";
    private static int jaExecutou = 0;

    public DAOHelper() {

        try {
            File f = new File(PATH);

            if (!f.exists()) {
                f.mkdir();
            }

        } catch (Exception e) {
        }
        try {

            Class.forName("org.sqlite.JDBC");

            this.conection = DriverManager.getConnection("jdbc:sqlite:" + PATH + DB_NAME);//C:\\MY-MANAGER\\MANAGER.SQLITE3
            this.stm = this.conection.createStatement();
            if (jaExecutou == 0) {
                System.out.println(TelefoneUtilVO.CREATE_TABLE);
                //CRIAÇÃO DE TABELAS
                stm.execute(TelefoneUtilVO.CREATE_TABLE);//Cria a tabela telefone_util
                
                jaExecutou=1;
            }

            this.conection.setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int execSql(String query) {
        int res = 0;
        try {

            res = this.stm.executeUpdate(query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;

    }

    public void commitTransaction() {
        try {
            this.conection.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                this.conection.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(DAOHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void closeDb() {
        try {
            commitTransaction();
            this.conection.close();
            this.stm.close();
        } catch (Exception e) {
        }
    }

    public Statement getStm() {
        return stm;
    }

}
