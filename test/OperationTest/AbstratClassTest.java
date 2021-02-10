/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationTest;
import com.ninja_squad.dbsetup.DbSetup;
import  com.ninja_squad.dbsetup.destination.DriverManagerDestination;
import  com.ninja_squad.dbsetup.operation.Operation;

/**
 *
 * @author bitwayiki
 */
public class AbstratClassTest {
    public static void execute(Operation op){
        DbSetup dbsetup = new DbSetup(new DriverManagerDestination("jdbc:postgresql://localhost:5432/schoolmangement","postgres", "postgres"), op);
        dbsetup.launch();
    
    }
    
}
