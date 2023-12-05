/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author IFTM
 */
public class JPAConectionFactory {
     private static EntityManagerFactory factory;

    static {
        factory = Persistence.createEntityManagerFactory("CineMaxPU");
    }
    
   
    public static EntityManager createEntityManager() {
        EntityManager em = factory.createEntityManager();
        return em;
    }

    public static void closeEntityManager(EntityManager manager) {
        manager.close();
    }
}
