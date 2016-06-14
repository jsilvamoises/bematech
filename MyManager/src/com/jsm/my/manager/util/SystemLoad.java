/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.util;

import java.util.HashMap;
import java.util.Properties;

/**
 *
 * @author moises
 */
public class SystemLoad {
    public static HashMap<String, String> mapa = new HashMap<>();
    private static Properties props;
    
    private static SystemLoad instance;
    
    public static SystemLoad getInstance(){
        if(instance==null){
            instance = new SystemLoad();
            LoadConfiguration();
        }
        return instance;
    }
    
    private static void LoadConfiguration(){
           props = SystemProperties.getProp();
    }
    
    public String getValuePropertie(String prop){
        try {
            return props.getProperty(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    
    
    public String getValuePropertie(String prop,String defaultValue){
        try {
            return props.getProperty(prop,defaultValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    
}
