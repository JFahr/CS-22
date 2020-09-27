;
import java.util.*;
public class employeeTest
{
    public static void main (String[] args)
    {
        Employee emp1 = new Employee("Joseph","Fajardo",0.00);
        System.out.println(emp1.getFirstName() + emp1.getLastName() + emp1.getMonthlySalary());
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter your first name");
        String First=input.next();
        System.out.println("Enter your last name");
        String Last =input.next();
        System.out.println("Enter your Monthly Salary");
        Double Monthly=input.nextDouble();
        
        Employee NewEmp= new Employee(First, Last, Monthly);
        System.out.println("New Employee: ");
        System.out.println("First Name - " + NewEmp.getFirstName());
        System.out.println("Last Name - " + NewEmp.getLastName());
        System.out.println("Monthly Salary - " + NewEmp.getMonthlySalary());
        
    }
    
}
