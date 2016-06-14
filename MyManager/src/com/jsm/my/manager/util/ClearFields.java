/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.util;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author moises
 */
public class ClearFields {

    private static ClearFields instance;

    public static ClearFields getInstance() {
        return instance == null ? instance = new ClearFields() : instance;
    }
    
    public void clear(Object... os){
        for(Object o:os){
            if(o instanceof TextField){
                ((TextField)o).setText("");
            }else if(o instanceof TextArea){
                ((TextArea)o).setText("");
            }
        }
    }

}
