/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.util;

import java.io.FileInputStream;
import java.io.Serializable;
import java.util.Properties;

/**
 *
 * @author moises
 */
public class SystemProperties implements Serializable {
    public static final String FILE_DB="prop.database.file";

    public static Properties getProp() {
        Properties props = null;
        try {
            props = new Properties();
            FileInputStream file = new FileInputStream(
                    "./properties/dados.properties");
            props.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return props;

    }

}
