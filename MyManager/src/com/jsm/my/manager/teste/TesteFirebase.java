/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.teste;

import java.util.Calendar;

/**
 *
 * @author moises
 */
public class TesteFirebase {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();
       
        c.setTimeInMillis(Long.parseLong("1465788037262"));
        
        System.out.println(c.getTime());
     
    }
    
}
