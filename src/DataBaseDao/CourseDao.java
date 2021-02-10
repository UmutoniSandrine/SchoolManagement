/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseDao;

import com.schoolManagement.domain.Course;
import com.schoolManagement.util.HibernateDbUtil;
import org.hibernate.Session;

/**
 *
 * @author bitwayiki
 */
public class CourseDao {
     public Course CreateCourseTable(Course c){
        Session s =HibernateDbUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(c);
        s.getTransaction().commit();
        s.close();
        return c;
    }
    
}
