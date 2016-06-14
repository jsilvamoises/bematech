/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.util;

/**
 *
 * @author moises
 */
public class RuntimeExec {
    public static final String CALC="calc";
    public static final String NOTEPAD_PLUS_PLUS="cmd.exe /C start notepad++.exe";
    public static final String NOTEPAD_WINDOWS="Notepad";
    public static final String WORD="cmd.exe /C start WINWORD.exe";
    public static final String EXCEL="cmd.exe /C start EXCEL.exe";
    boolean tentouPrimeiraVez=false;
    
    public static int exec(String programa){
       int res= 0;
        try {
            Runtime.getRuntime().exec(programa);
            return 1;
        } catch (Exception e) {            
            e.printStackTrace();
        }
        
        return res;
    }
    
    
    
    
}
