
public class Medic extends ResponsibilityDecorator {
    Employee employee;
    public Medic(Employee employee){
        this.employee = employee;
    }
    
    @Override
    public String getDescription(){
        if(employee.getDescription().endsWith(":")) 
            return employee.getDescription() + " Medic";
        else
            return employee.getDescription() + ", Medic";
    }
}
