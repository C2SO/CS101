/*
Nicholas Rahbany
CS101
*/

/*
Initialize String supervisorName

Data Table - Staff
-------------------------------		
Variable	   | Type	| Description
-------------------------------
supervisorName | String | Name of Supervisor for Employee
*/

public class Staff extends Employee {
    private String supervisorName;

    /*
    super(name, address, phoneNumber, emailAddress, office, salary, title, hiringDate)
    setSupervisorName(supervisorName)    
    
    Data Table - Staff
    -------------------------------		
    Variable	   | Type	| Description
    -------------------------------
    name	       | String | Name of Staff Member
    address	       | String | Address of Staff Member
    phoneNumber	   | String | Phone Number of Staff Member
    emailAddress   | String | Email Address of Staff Member
    office	       | String | Office of Staff Member
    salary	       | Double | Salary of Staff Member
    hiringDate     | Date	| Hiring Date for Staff Member
    title	       | String	| Title of Staff Member
    supervisorName | String	| Supervisor Name of Staff Member    
    */

    public Staff(String name, String address, String title, String phoneNumber, String emailAddress, String office,
            double salary, Date hiringDate, String supervisorName) {
        super(name, address, phoneNumber, emailAddress, office, salary, title, hiringDate);
        setSupervisorName(supervisorName);
    }

    /*
    Set this.supervisorName to supervisorName
    
    Data Table - setSupervisorName
    -------------------------------		
    Variable       | Type	| Description
    -------------------------------
    supervisorName | String | Supervisor Name of Staff Member
    */

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    /*
    Return supervisorName
    
    Data Table - getSupervisorName		
    -------------------------------
    Variable | Type | Description
    -------------------------------
    */

    public String getSupervisorName() {
        return supervisorName;
    }

    /*
    Return "\nStaff\n" + super.toString() + "\n\tsupervisor name: " + getSupervisorName()
    
    Data Table - toString		
    -------------------------------
    Variable | Type | Description
    -------------------------------
    */

    public String toString() {
        return "\nStaff\n" + super.toString() + "\n\tsupervisor name: " + getSupervisorName();
    }
}