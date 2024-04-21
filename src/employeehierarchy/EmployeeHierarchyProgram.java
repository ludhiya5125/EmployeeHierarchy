package employeehierarchy;
import employeehierarchy.model.Employee;
import employeehierarchy.model.Developer;
import employeehierarchy.model.Manager;

public class EmployeeHierarchyProgram
{
    public static void main(String[] args)
    {
        Employee employee;
        employee = new Manager(101,"Yash","yash@gmail.com",85000,3);
        employee.display();
        employee=new Developer(523,"Ludhiya","ludhiya@gmail.com",65000,"Java");
        employee.display();
    }
}
