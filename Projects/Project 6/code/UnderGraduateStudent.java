/*
Nicholas Rahbany
CS101
*/

public class UnderGraduateStudent extends Student {

    /*
    super(name, address, phoneNumber, emailAddress, birthDate, status)
    
    Data Table - UnderGraduateStudent	
    -------------------------------	
    Variable	 | Type	  | Description
    -------------------------------
    name	     | String | Name of Undergraduate Student
    address	     | String | Address of Undergraduate Student
    phoneNumber	 | String | Phone Number of Undergraduate Student
    emailAddress | String | Email Address of Undergraduate Student
    birthDate	 | Date	  | Birthday of Undergraduate Student
    status	     | char	  | Status of Undergraduate Student
    */

    public UnderGraduateStudent(String name, String address, String phoneNumber, String emailAddress, Date birthDate,
            char status) {
        super(name, address, phoneNumber, emailAddress, birthDate, status);
    }

    /*
    Return  "\nUndergraduate Student\n" + super.toString()
    
    Data Table - toString
    -------------------------------		
    Variable | Type | Description
    -------------------------------
    */

    public String toString() {
        return "\nUndergraduate Student\n" + super.toString();
    }
}