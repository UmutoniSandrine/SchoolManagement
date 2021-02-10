/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.schoolManagement.util;

import DataBaseDao.StudentDao;
import com.schoolManagement.domain.Gender;
import com.schoolManagement.domain.Student;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author bitwayiki
 */
public class TestClass {
    public static void main(String[] args) {
        
        HibernateDbUtil.getSessionFactory();
//        Student s = new Student();
//        s.setStudentId("21153");
//        s.setName("sandrine2");
//        s.setGender(Gender.MALE);
//        s.setDateOfBirth(LocalDate.of(1998, Month.MARCH, 9));
//        s.setEmail("sandri@gmail.com");
//        s.setTelephone("9238928392");
//        StudentDao stt = new StudentDao();
//        stt.CreateStudent(s);
     
        
       
        
    }
    
}
