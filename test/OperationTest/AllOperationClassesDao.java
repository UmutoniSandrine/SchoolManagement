/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationTest;

import com.ninja_squad.dbsetup.operation.Operation;
import static com.ninja_squad.dbsetup.Operations.*;

/**
 *
 * @author bitwayiki
 */
public class AllOperationClassesDao {

    public static Operation DELETE_ROWS = sequenceOf(
            deleteAllFrom("course_student"),
            deleteAllFrom("COURSE"),
            deleteAllFrom("STUDENT"),
            deleteAllFrom("DEPARTMENT"),
            deleteAllFrom("FACULTY")
            
            
            
    );

    public static Operation INSERT_INTO_TABLES = sequenceOf(
            
            // id | name | version 
            insertInto("FACULTY")
                    .withDefaultValue("version", 1)
                    .columns("id", "name")
                    .values(100, "Faculty 100")
                    .values(101, "Faculty 101")
                    .values(103, "Faculty 102")
                    .values(104).build(),
            // id | name | version | faculty_id 
            insertInto("DEPARTMENT")
                    .withDefaultValue("version", 1)
                    .columns("id", "name", "faculty_id")
                    .values(100, "dep 1", 100)
                    .values(101, "dep 2", 101)
                    .values(103, "dep 3", 103)
                    .values(104, "dep 4", 104)
                    .build(),
            // id | telephone | dateofbirth | email | gender | name | studentid | version | department_id 
            insertInto("STUDENT")
                    .withDefaultValue("version", 1)
                    .columns("id", "studentid", "name", "gender", "email", "telephone", "department_id")
                    .values(100, "21148", "Sandrine", "FEMALE", "sandrine@250@gmail", "0781466686", 100)
                    .values(101, "21145", "Sandrine", "FEMALE", "sandrine@250@gmail", "0781466686", 101)
                    .values(103, "21146", "Sandrine", "FEMALE", "sandrine@250@gmail", "0781466686", 103)
                    .values(104, "21141", "Sandrine", "FEMALE", "sandrine@250@gmail", "0781466686", 104)
                    .build(),
            //id | code | credits | name | version | department_id 
            insertInto("COURSE")
                    .withDefaultValue("version", 1)
                    .columns("id","code", "name", "credits", "department_id")
                    .values(100,"code1", "Maths", 3, 100)
                    .values(101,"code2", "Java", 4, 102)
                    .values(103,"code3", "JSF",3, 101)
                    .values(104,"code4", "STE", 5,104)
                    .build(),
            //courses_id | students_id 
            insertInto("course_student")
                    .columns("courses_id", "students_id")
                    .values( 100, 100)
                    .values( 101, 101)
                    .values( 103, 103)
                    .values( 104, 104)
                    .build()
    );

}
