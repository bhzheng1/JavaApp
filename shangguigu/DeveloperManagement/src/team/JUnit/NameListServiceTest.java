package team.JUnit;

import org.junit.jupiter.api.Test;
import team.domain.Employee;
import team.service.NameListService;
import team.service.TeamException;

public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService nameListService = new NameListService();
        Employee[] employees =  nameListService.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    @Test
    public void testGetEmployee(){
        try{
            NameListService nameListService = new NameListService();
            int id = 13;
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee);
        }
        catch (TeamException e){
            System.out.println(e.getMessage());
        }
    }
}
