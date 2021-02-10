/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseDao;

import com.schoolManagement.domain.Faculty;
import com.schoolManagement.domain.Student;
import com.schoolManagement.util.HibernateDbUtil;
import org.hibernate.Session;

/**
 *
 * @author bitwayiki
 */
public class FacultyDao {
     public Faculty CreateStudent(Faculty fc){
        Session s =HibernateDbUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(fc);
        s.getTransaction().commit();
        s.close();
        return fc;
    }
    
}
