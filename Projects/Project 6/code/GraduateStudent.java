/*
Nicholas Rahbany
CS101
*/

/*
Initialize char assistantshipType

Data Table -  GraduateStudent class		
-------------------------------
Variable	      | Type | Description
-------------------------------
assistantshipType | char | Assistant Type for Graduate Student
*/

public class GraduateStudent extends Student {
    private char assistantshipType;

    /*
    super(name, address, phoneNumber, emailAddress, birthDate, status)
    setAssistantshipType(assistantshipType)
    
    Data Table - GraduateStudent	
    -------------------------------	
    Variable	      | Type   | Description
    -------------------------------
    name	          | String | Name of Graduate Student
    address	          | String | Address of Graduate Student
    phoneNumber	      | String | Phone Number of Graduate Student
    emailAddress	  | String | Email Address of Graduate Student
    birthDate	      | Date   | Birthday of Graduate Student
    status	          | char   | Status of Graduate Student
    assistantshipType | char   | Assistantship Type for Graduate Student
    */

    public GraduateStudent(String name, String address, Date birthDate, String phoneNumber, String emailAddress,
            char status, char assistantshipType) {
        super(name, address, phoneNumber, emailAddress, birthDate, status);
        setAssistantshipType(assistantshipType);
    }

    /*
    Set this.assistantshipType to assistantshipType
    
    Data Table -  setAssistantshipType	
    -------------------------------
    Variable	      | Type | Description
    -------------------------------
    assistantshipType | char | Assistant Type for Graduate Student
    */

    public void setAssistantshipType(char assistantshipType) {
        this.assistantshipType = assistantshipType;
    }

    /*
    Return assistantshipType
    
    Data Table -  getAssistantshipType	
    -------------------------------
    Variable | Type | Description
    -------------------------------
    */

    public char getAssistantshipType() {
        return assistantshipType;
    }
    
    /*
    Return "\nGraduate Student\n" + super.toString() + "\n\tassistantship type: " + getAssistantshipType()
    
    Data Table -  toString	
    -------------------------------
    Variable | Type | Description
    -------------------------------
    */

    public String toString() {
        return "\nGraduate Student\n" + super.toString() + "\n\tassistantship type: " + getAssistantshipType();
    }
}