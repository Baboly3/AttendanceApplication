/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.attendanceapp.org.facade;

import com.attendanceapp.org.crud.GenericCRUD;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Babak Tamjidi baboly@gmail.com
 */
@Stateless
public class DayFacade extends GenericCRUD<Day> {

    @PersistenceContext(unitName = "MusicExplorerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
