/*
Nicholas Rahbany
CS101
*/

/*
Initialize String name
Initialize String address
Initialize String phoneNumber
Initialize String emailAddress
Initialize String[] months to {"January", "Febrauary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}

Data Table - Person Class
-----------------------------		
Variable     | Type	  | Description
-----------------------------
name         | String         | Name of Person
address	     | String         | Address of Person
phoneNumber  | String         | Phone Number of Person
emailAddress | String         | Email Address of Person
months       | final String[] | An array of months
*/
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    public final String[] months = { "January", "Febrauary", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December" };

    /*
    setName(name)
    setAddress(address)
    setPhoneNumber(phoneNumber)
    setEmailAddress(emailAddress)

    Data Table - Person		
    --------------------------------
    Variable	 | Type	  | Description
    --------------------------------
    name         | String | Name of Person
    address	     | String | Address of Person
    phoneNumber	 | String | Phone Number of Person
    emailAddress | String | Email Address of Person
    */
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmailAddress(emailAddress);
    }

    /*
    Set this.name to name

    Data Table - setName	
    --------------------------------
    Variable | Type	  | Description
    --------------------------------
    name     | String | Name of Person
    */
    public void setName(String name) {
        this.name = name;
    }

    /*
    Set this.address to address

    Data Table - setAddress
    -------------------------------		
    Variable | Type	  | Description
    -------------------------------
    address	 | String | Address of Person
    */

    public void setAddress(String address) {
        this.address = address;
    }

    /*
    Set this.phoneNumber to phoneNumber

    Data Table - setPhoneNumber	
    -------------------------------	
    Variable    | Type   | Description
    -------------------------------
    phoneNumber | String | Phone Number of Person
    */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /*
    Set this.emailAddress to emailAddress

    Data Table - setEmailAddress	
    -------------------------------	
    Variable     | Type	  | Description
    -------------------------------
    emailAddress | String | Email Address of Person
    */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /*
    Return name

    Data Table - getName		
    Variable | Type |	Description
    */

    public String getName() {
        return name;
    }

    /*
    Return address

    Data Table - getAddress		
    Variable | Type |	Description
    */

    public String getAddress() {
        return address;
    }

    /*
    Return phoneNumber

    Data Table - getPhoneNumber	
    Variable | Type |	Description
    */


    public String getPhoneNumber() {
        return phoneNumber;
    }

    /*
    Return emailAddress

    Data Table - getEmailAddress	
    Variable | Type |	Description
    */


    public String getEmailAddress() {
        return emailAddress;
    }

    /*
    Return "\n\tname: " + getName() + "\n\taddress: " + getAddress() + "\n\tphone number: " + getPhoneNumber() + "\n\te-mail address: " + getEmailAddress()

    Data Table - toString	
    Variable | Type |	Description
    */


    public String toString() {
        return "\n\tname: " + getName() + "\n\taddress: " + getAddress() + "\n\tphone number: " + getPhoneNumber()
                + "\n\te-mail address: " + getEmailAddress();
    }
}