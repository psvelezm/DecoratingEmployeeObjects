public class WeaponSpecialist extends ResponsibilityDecorator  {
    Employee employee;
    public WeaponSpecialist(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getDescription() {
        if(employee.getDescription().endsWith(":")) 
            return employee.getDescription() + " Weapons Specialist";
        else
            return employee.getDescription() + ", Weapons Specialist";
    }
    
}