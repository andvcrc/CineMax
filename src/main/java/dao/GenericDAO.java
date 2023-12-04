/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import jakarta.validation.Valid;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.PersistenceUnit;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Andre
 * @param <T>
 * @param <I>
 */
public abstract class GenericDAO<T, I extends Serializable> {
   @Inject
   @PersistenceUnit(name = "CineMaxPU")
   protected EntityManager entityManager;

   private Class<T> persistedClass;

   protected GenericDAO() {
   }

   protected GenericDAO(Class<T> persistedClass) {
       this();
       this.persistedClass = persistedClass;
   }

   public T salvar(@Valid T entity) {
       EntityTransaction t = entityManager.getTransaction();
       t.begin();
       entityManager.persist(entity);
       entityManager.flush();
       t.commit();
       return entity;
   }

   public T atualizar(@Valid T entity) {
       EntityTransaction t = entityManager.getTransaction();
       t.begin();
       entityManager.merge(entity);
       entityManager.flush();
       t.commit();
       return entity;
   }

   public void remover(I id) {
       T entity = encontrar(id);
       EntityTransaction tx = entityManager.getTransaction();
       tx.begin();
       T mergedEntity = entityManager.merge(entity);
       entityManager.remove(mergedEntity);
       entityManager.flush();
       tx.commit();
   }

   public List<T> getList() {
       CriteriaBuilder builder = entityManager.getCriteriaBuilder();
       CriteriaQuery<T> query = builder.createQuery(persistedClass);
       query.from(persistedClass);
       return entityManager.createQuery(query).getResultList();
   }

   public T encontrar(I id) {
       return entityManager.find(persistedClass, id);
   }
}
