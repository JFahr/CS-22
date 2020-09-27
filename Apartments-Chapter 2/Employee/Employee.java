public class Employee
{
    private String firstname;
    private String lastname;
    private double monthlySalary;
    public Employee(String firstname, String lastname, double monthlySalary)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        if(monthlySalary>0.0)
        {
            this.monthlySalary = monthlySalary;
        }
    }
    //non static methods
    public void setFirstName(String firstname)
    {
        this.firstname= firstname;
    }
    
    public String getFirstName()
    {
        return firstname;
    }
    
    public void setLastName(String lastname)
    {
        this.lastname=lastname;
    }
    
    public String getLastName()
    {
        return lastname;
    }
    
    public void setMonthlySalary(double monthlySalary)
    {
        if(monthlySalary>0.0)
        {
            this.monthlySalary=monthlySalary;
        }
    }
    
    public double getMonthlySalary()
    {
        return monthlySalary;
    }
    
}