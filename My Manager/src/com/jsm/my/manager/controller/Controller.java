/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.controller;

import java.util.List;

/**
 *
 * @author moises
 */
public interface Controller {
    public int save(Object object);
    public int update(Object object);
    public int delete(Object object);
    public Object getByObjectId(String objectId);
    public List getAll();
}
