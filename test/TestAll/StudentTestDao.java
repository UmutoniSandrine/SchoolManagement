/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAll;

import DataBaseDao.StudentDao;
import OperationTest.AbstratClassTest;
import OperationTest.AllOperationClassesDao;
import com.schoolManagement.domain.Gender;
import com.schoolManagement.domain.Student;
import com.schoolManagement.util.HibernateDbUtil;
import java.time.LocalDate;
import java.time.Month;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author bitwayiki
 */
public class StudentTestDao {

    public StudentTestDao() {
    }
    @BeforeTest
    public void init(){
        HibernateDbUtil.getSessionFactory();
    }
    @BeforeMethod
    public void initiateTest(){
        AbstratClassTest.execute(AllOperationClassesDao.INSERT_INTO_TABLES);
    }
    
    @AfterMethod
    public void cleanTest(){
        AbstratClassTest.execute(AllOperationClassesDao.DELETE_ROWS);
    }
    @Test
    public void studentTest(){
        Student s = new Student();
        s.setId(105);
        s.setStudentId("21151");
        s.setName("sandrine2");
        s.setGender(Gender.MALE);
        s.setDateOfBirth(LocalDate.of(1998, Month.MARCH, 9));
        s.setEmail("sandri@gmail.com");
        s.setTelephone("9238928392");
        StudentDao stt = new StudentDao();
        stt.CreateStudent(s);
        Assert.assertEquals(s.getVersion(), 1);
    }
}
