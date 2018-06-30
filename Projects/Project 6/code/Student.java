/*
Nicholas Rahbany
CS101
*/

/*
Initialize Date birthDate
Initialize char status

Data Table - Student	
-------------------------------	
Variable  | Type | Description
-------------------------------
birthDate | Date | Birthday for Student
status    | char | Status for Student
*/

public class Student extends Person {
    private Date birthDate;
    private char status;

    /*
    super(name, address, phoneNumber, emailAddress)
    setBirthDate(birthDate)
    setStatus(status)    
    
    Data Table - Student	
    -------------------------------	
    Variable	 | Type	  | Description
    -------------------------------
    name	     | String | Name of Student
    address	     | String | Address of Student
    phoneNumber	 | String | Phone Number of Student
    emailAddress | String | Email Address of Student
    birthDate	 | Date	  | Birthday of Student
    status	     | char	  | Status of Student
    */

    public Student(String name, String address, String phoneNumber, String emailAddress, Date birthDate, char status) {
        super(name, address, phoneNumber, emailAddress);
        setBirthDate(birthDate);
        setStatus(status);
    }

    /*
    Set this.birthDate to birthDate
    
    Data Table - setBirthDate	
    -------------------------------	
    Variable  | Type | Description
    -------------------------------
    birthDate | Date | Birthday of Student
    */

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /*
    Set this.status to status
    
    Data Table - setStatus	
    -------------------------------	
    Variable | Type | Description
    -------------------------------
    status	 | char | Status of Student
    */

    public void setStatus(char status) {
        this.status = status;
    }

    /*
    Return birthDate
    
    Data Table - getBirthDate
    -------------------------------		
    Variable | Type | Description
    -------------------------------
    */

    public Date getBirthDate() {
        return birthDate;
    }

    /*
    Return status
    
    Data Table - getStatus
    -------------------------------		
    Variable | Type | Description
    -------------------------------
    */

    public char getStatus() {
        return status;
    }

    /*
    Return super.months[date.getMonth() - 1] + " " + date.getDay() + ", " + date.getYear()
    
    Data Table - fullDate
    -------------------------------		
    Variable | Type | Description
    -------------------------------
    date     | Date | Date of Student
    */

    public String getFullDate(Date date) {
        return super.months[date.getMonth() - 1] + " " + date.getDay() + ", " + date.getYear();
    }

    /*
    Return super.toString() + "\n\tbirth date: " + getFullDate(getBirthDate()) + "\n\tstatus: " + getStatus()
    
    Data Table - toString
    -------------------------------		
    Variable | Type | Description
    -------------------------------
    */

    public String toString() {
        return super.toString() + "\n\tbirth date: " + getFullDate(getBirthDate()) + "\n\tstatus: " + getStatus();
    }
}