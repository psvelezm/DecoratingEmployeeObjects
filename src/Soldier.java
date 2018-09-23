public class Soldier extends ResponsibilityDecorator  {
    Employee employee;
    public Soldier(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getDescription() {
        if(employee.getDescription().endsWith(":")) 
            return employee.getDescription() + " Soldier";
        else
            return employee.getDescription() + ", Soldier";
    }
    
}