/*
Nicholas Rahbany
CS101
*/

/*
Initialize String officeHours
*/

public class Faculty extends Employee {
    private String officeHours;

    /*
    super(name, address, phoneNumber, emailAddress, office, salary, title, hiringDate)
    setOfficeHours(officeHours)
    
    Data Table - Faculty	
    -------------------------------	
    Variable	 | Type	  | Description
    -------------------------------
    name	     | String | Name of Faculty Member
    address	     | String | Address of Faculty Member
    phoneNumber  | String | Phone Number of Faculty Member
    emailAddress | String | Email Address of Faculty Member
    office	     | String | Office of Faculty Member
    salary	     | Double | Salary of Faculty Member
    hiringDate 	 | Date	  | Hiring Date for Faculty Member
    title	     | String | Title of Faculty Member
    officeHours	 | String | Office Hours of Faculty Member
    */

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
            Date hiringDate, String title, String officeHours) {
        super(name, address, phoneNumber, emailAddress, office, salary, title, hiringDate);
        setOfficeHours(officeHours);
    }

    /*
    Set this.officeHours to officeHours
    
    Data Table - setOfficeHours		
    -------------------------------
    Variable    | Type	 | Description
    -------------------------------
    officeHours	| String | Office Hours for Faculty Member
    */

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    /*
    Return officeHours
    
    Data Table - getOfficeHours		
    -------------------------------
    Variable    | Type	 | Description
    -------------------------------
    */

    public String getOfficeHours() {
        return officeHours;
    }

    /*
    Return "\nFaculty\n" + super.toString() + "\n\toffice hours: " + getOfficeHours()
    
    Data Table - toString	
    -------------------------------
    Variable    | Type	 | Description
    -------------------------------
    */

    public String toString() {
        return "\nFaculty\n" + super.toString() + "\n\toffice hours: " + getOfficeHours();
    }
}