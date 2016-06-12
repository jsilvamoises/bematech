/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.teste;

import com.jsm.my.manager.dao.DAOHelper;
import com.jsm.my.manager.util.SystemLoad;
import com.jsm.my.manager.util.SystemProperties;

/**
 *
 * @author moises
 */
public class TesteFirebase {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DAOHelper dao = new DAOHelper();
        dao.closeDb();
     
    }
    
}
