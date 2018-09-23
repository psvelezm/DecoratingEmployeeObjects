public class TeamLeader extends ResponsibilityDecorator  {
    Employee employee;
    public TeamLeader(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getDescription() {
        if(employee.getDescription().endsWith(":")) 
            return employee.getDescription() + " Team Leader";
        else
            return employee.getDescription() + ", Team Leader";
    }
    
}