/*
Nicholas Rahbany
CS101
*/

/*
Initialize String office
Initialize double salary
Initialize String title
Initialize Date hiringDate

Data Table - Employee	
-------------------------------	
Variable   | Type   | Description
-------------------------------
office	   | String	| Office for Employee
salary	   | Double	| Salary for Employee
title	   | String | Title for Employee
hiringDate | Date   | Hiring Date for Employee
*/

public class Employee extends Person {
    private String office;
    private double salary;
    private String title;
    private Date hiringDate;

    /*
    super(name, address, phoneNumber, emailAddress);
    setOffice(officeHours)
    setSalary(salary)
    setTitle(title)
    setHiringDate(hiringDate)
    
    Data Table - Employee	
    -------------------------------
    Variable	 | Type	  | Description
    -------------------------------
    name	     | String | Name of Employee
    address	     | String | Address of Employee
    phoneNumber	 | String | Phone Number of Employee
    emailAddress | String | Email Address of Employee
    officeHours	 | String | Office of Employee
    salary	     | Double | Salary of Employee
    hiringDate   | Date	  | Hiring Date for Employee
    title	     | String | Title of Employee
    */

    public Employee(String name, String address, String phoneNumber, String emailAddress, String officeHours,
            double salary, String title, Date hiringDate) {
        super(name, address, phoneNumber, emailAddress);
        setOffice(officeHours);
        setSalary(salary);
        setTitle(title);
        setHiringDate(hiringDate);
    }

    /*
    Set this.office to office
    
    Data Table - setOffice		
    -------------------------------
    Variable | Type	  | Description
    -------------------------------
    office	 | String | Office for Employee
    */

    public void setOffice(String office) {
        this.office = office;
    }

    /*
    Set this.salary to salary
    
    Data Table - setSalary		
    -------------------------------
    Variable | Type	  | Description
    -------------------------------
    salary	 | Double | Salary for Employee
    */

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /*
    Set this.title to title
    
    Data Table - setTitle	
    -------------------------------	
    Variable | Type	  | Description
    -------------------------------
    title	 | String | Title for Employee    
    */

    public void setTitle(String title) {
        this.title = title;
    }

    /*
    Set this.hiringDate to hiringDate
    
    Data Table - setHiringDate	
    -------------------------------	
    Variable   | Type | Description
    -------------------------------
    hiringDate | Date | Hiring Date for Employee
    */

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    /*
    Return office
    
    Data Table - getOffice
    -------------------------------	
    Variable   | Type | Description
    -------------------------------
    */

    public String getOffice() {
        return office;
    }

    /*
    Return salary
    
    Data Table - getSalary
    -------------------------------	
    Variable   | Type | Description
    -------------------------------
    */

    public double getSalary() {
        return salary;
    }

    /*
    Return title
    
    Data Table - getTitle
    -------------------------------	
    Variable   | Type | Description
    -------------------------------
    */

    public String getTitle() {
        return title;
    }

    /*
    Return hiringDate
    
    Data Table - getHiringDate
    -------------------------------	
    Variable   | Type | Description
    -------------------------------
    */

    public Date getHiringDate() {
        return hiringDate;
    }

    /*
    Return super.toString() + "\n\toffice: " + getOffice() + "\n\tsalary: " + getSalary() + "\n\ttitle: " + getTitle() + "\n\thiring date: " + getHiringDate()
    
    Data Table - toString
    -------------------------------	
    Variable   | Type | Description
    -------------------------------
    */

    public String toString() {
        return super.toString() + "\n\toffice: " + getOffice() + "\n\tsalary: " + getSalary() + "\n\ttitle: "
                + getTitle() + "\n\thiring date: " + getHiringDate();
    }
}