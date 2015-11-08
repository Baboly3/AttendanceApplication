/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.attendanceapp.org.facade;

import com.attendanceapp.org.crud.GenericCRUD;
import com.attendenceapp.org.entities.Course;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Babak Tamjidi baboly@gmail.com
 */
@Stateless
public class CourseFacade extends GenericCRUD<Course> {

    @PersistenceContext(unitName = "MusicExplorerPU")
    private EntityManager em;

    public CourseFacade() {
        super(Course.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
