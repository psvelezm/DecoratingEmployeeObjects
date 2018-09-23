/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class PlatoonSergeant extends ResponsibilityDecorator  {
    Employee employee;
    
    public PlatoonSergeant(Employee employee) {
        this.employee = employee;
    }
    
    @Override
    public String getDescription() {
        if(employee.getDescription().endsWith(":")) 
            return employee.getDescription() + " Platoon Sergeant";
        else
            return employee.getDescription() + ", Platoon Sergeant";
    }
    
}