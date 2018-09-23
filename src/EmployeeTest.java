
public class EmployeeTest {

    Employee employee;
    public static int employeeNumber = 0001;
    public static void main(String[] args) {
        
        String[] employeeLN = {"Walker", "Johnson", "Clinton"};
        
        employeeNum();
        Employee newEmployee = new SalariedEmployee (employeeLN[0]);
        
        newEmployee = new Soldier(newEmployee);
        
        newEmployee = new Medic(newEmployee);
        
        System.out.println(newEmployee.getDescription());
        employeeNumber++;
        
        employeeNum();
        Employee newEmployee2 = new SalariedEmployee(employeeLN[1]);
        newEmployee2 = new PlatoonSergeant(newEmployee2);
        newEmployee2 = new Soldier(newEmployee2);
        newEmployee2 = new FirstSergeant(newEmployee2);
        System.out.println(newEmployee2.getDescription());
        employeeNumber++;
        
        employeeNum();
        Employee newEmployee3 = new SalariedEmployee(employeeLN[2]);
        newEmployee3 = new TeamLeader(newEmployee3);
        newEmployee3 = new PlatoonSergeant(newEmployee3);
        newEmployee3 = new WeaponSpecialist(newEmployee3);
        System.out.println(newEmployee3.getDescription());
        System.out.println();
        
        
    }
    
    public static void employeeNum(){
        System.out.println("\n======================================================");
        System.out.println("               Service Member#: " + (String.format("%04d", employeeNumber)) + "                 ");
        System.out.println("======================================================\n");
    }
    
}
