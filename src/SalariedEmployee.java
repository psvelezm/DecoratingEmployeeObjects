
public class SalariedEmployee extends Employee {
    Employee employee;
    String lname;
    
    public SalariedEmployee(String lname){
        this.lname = lname;
        description = "["+ lname + "]:";
    }
    
    public double salary(){
        return 10000.00;
    }
    
}
