/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.my.manager.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author moises
 */
public class JpaUtil {
    private static final String PERSISTENCE_UNIT="MyManagerPU";
    
    private static ThreadLocal<EntityManager> theadEntityManager = new ThreadLocal<>();
    
    private static EntityManagerFactory entityManagerFactory;

    public JpaUtil() {
    }
    
    public static EntityManager getEntityManager(){
        if(entityManagerFactory == null){
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        
        EntityManager entityManager = theadEntityManager.get();
        
        if(entityManager == null || !entityManager.isOpen()){
            entityManager = entityManagerFactory.createEntityManager();
        }
        
        return entityManager;
        
    }
    
    
    public static void closeEntityManager(){
        EntityManager em = theadEntityManager.get();
        if(em != null){
            EntityTransaction transaction = em.getTransaction();
            
            if(transaction.isActive()){
                transaction.commit();
                em.close();
                theadEntityManager.set(null);
            }
        }
        
    }
    
    
    public static void closeEntityManagerFactory(){
        closeEntityManager();
        entityManagerFactory.close();
    }
    
}
