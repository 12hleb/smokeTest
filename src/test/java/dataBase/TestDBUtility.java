package dataBase;

import utilities.DBUtility;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class TestDBUtility {
    public static void main(String[] args) throws SQLException {
        DBUtility.createConnection();
        List<Map<Object,Object>> mydata = DBUtility.executeQuery("select * from employees");
        DBUtility.close();

//        for(Map<Object,Object> map: data){
//            System.out.println(data);
//        }

        for(Map<Object,Object> map: mydata){
            if(map.get("EMPLOYEE_ID").toString().equals("175")){
                if(map.get("SALARY").toString().equals("8800")){
                    System.out.println("ID: " + map.get("EMPLOYEE_ID") + " Salary: " + map.get("SALARY") + " is verified!");
                    // how do you override equals method?
                    //if you override
                }
            }
//            System.out.println(map);
        }
    }
}
