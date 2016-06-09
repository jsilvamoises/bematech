/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.teste;

import com.firebase.client.Firebase;
import java.util.HashMap;

/**
 *
 * @author moises
 */
public class TesteFirebase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Firebase root = new Firebase("https://my-manager.firebaseio.com/user");
        
        root.child("nome").setValue("mJ");
        root.push();
    }
    
}
