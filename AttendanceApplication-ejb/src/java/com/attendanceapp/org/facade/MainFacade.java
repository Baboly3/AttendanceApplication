/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.attendanceapp.org.facade;

import javax.ejb.EJB;
import javax.ejb.Local;
/**
 *
 * @author Babak Tamjidi  baboly@gmail.com
 */
@Local
public class MainFacade {
   
    @EJB
    AttendanceFacade attendanceService;
    @EJB
    CourseFacade courseService;
    @EJB
    UserFacade userService;

    public AttendanceFacade getAttendanceService() {
        return attendanceService;
    }

    public CourseFacade getCourseService() {
        return courseService;
    }

    public UserFacade getUserService() {
        return userService;
    }   
}
