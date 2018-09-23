
public class FirstSergeant extends ResponsibilityDecorator{
    
    Employee employee;
    
    public FirstSergeant(Employee employee){
        this.employee = employee;
        
    }
    
    @Override
    
    public String getDescription(){
        if(employee.getDescription().endsWith(":"))
            return employee.getDescription() + " First Sergeant";
        else
            return employee.getDescription() + ", First Sergeant";
        
    }
}
