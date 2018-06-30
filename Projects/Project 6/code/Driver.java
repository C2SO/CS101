
/*
Nicholas Rahbany
CS101
*/

import java.util.*;
import java.io.*;

/*
Initialize File inputFile
Initialize File outputFile
Initialize Scanner read
Initialize PrintStream write
Initialize Person[] people as new Person[100]
Initialize int peopleIndex as 0

Data Table - Driver	
--------------------------------	
Variable	| Type	Description
--------------------------------
inputFile	| Static File |	Input File
outputFile	| Static File | Output File
read	    | Scanner     | Scanner for Project
write       | PrintStream | The print statement
people      | Person[]    | Array of people
peopleIndex | int         | Index of people

*/
public class Driver {
    private static File inputFile;
    private static File outputFile;
    private static Scanner read;
    private static PrintStream write;
    private static Person[] people = new Person[100];
    private static int peopleIndex = 0;

    /*
    Set inputFile to new File(args[0])
    Set read to new Scanner(inputFile)
    Set write to new PrintStream(outputFile)
    Initialize String line
    Initialize String[] data
    While read.hasNext()...
        Set line to read.nextLine()
        Set data to line.split(“#”)
        Switch(data[0].charAt(0))
            Case ‘u’:
                Set people[peopleIndex] to new UnderGraduateStudent(data[1], data[2], data[3], data[4], getDateObject(data[5]), data[6].charAt(0))
            Case ‘g’:
                Set people[peopleIndex] to new GraduateStudent(data[1], data[2], getDateObject(data[3]), data[4], data[5], data[6].charAt(0), data[7].charAt(0))
    	    Case ‘f’:
                Set people[peopleIndex] to new Faculty(data[1], data[2], data[3], data[4], data[5], Double.parseDouble(data[6]), getDateObject(data[7]), data[8], data[9])
    	    Case ‘s’:
                Set people[peopleIndex] to new Staff(data[1], data[2], data[3], data[4], data[5], data[6], Double.parseDouble(data[7]), getDateObject(data[8]), data[9])
        peopleIndex++
    Write to outputFile ("Project 6: Person Database\nJordyn Marlow\nCS-101-02")
    Write to outputFile ("\nThe following is an echo print of the input file:")
    Set read to new Scanner(inputFile)
    While read.hasNext()...
        Write to outputFile read.nextLine()
    Write to outputFile("\nEntire database sorted by name:\n")
    sortByName(people)
    For (int index = 0; index < peopleIndex; index++)...
        If (people[index] instanceof Staff)...
            Write to outputFile (((Staff)people[index]).toString())
        Else if (people[index] instanceof Faculty)...
            Write to outputFile (((Faculty)people[index]).toString())
        Else if (people[index] instanceof GraduateStudent)...
            Write to outputFile (((GraduateStudent)people[index]).toString())
        Else…
            Write to outputFile (((UnderGraduateStudent)people[index]).toString())
    Write to outputFile ("\nAll staff sorted by date:\n")
    sortByDate(people)
    For (int index = 0; index < people.length; index++)...
        If (people[index] instanceof Staff)...
            Write to outputFile (((Staff)people[index]).toString())
    Write to outputFile("\nAll employees sorted by salary:\n")
    sortBySalary(people)
    For (int index = 0; index < people.length; index++)...
        If (people[index] instanceof Employee)...
            Write to outputFile (((Employee)people[index]).toString())
    Write to outputFile ("\nAll graduate students sorted by address:\n")
    sortByAddress(people)
    For (int index = 0; index < people.length; index++)...
        If (people[index] instanceof GraduateStudent)...
            Write to outputFile(((GraduateStudent)people[index]).toString())
    
    Data Table - main	
    --------------------------------	
    Variable   | Type	     | Description
    --------------------------------
    inputFile  | File        | Input File
    outputFile | File        | Output File
    read       | Scanner     | Scanner Object for class
    write      | PrintStream | Print object for class   
    */
    public static void main(String[] args) throws IOException {
        inputFile = new File(args[0]);
        outputFile = new File(args[1]);
        read = new Scanner(inputFile);
        write = new PrintStream(outputFile);
        String line;
        String[] data;

        while (read.hasNext()) {
            line = read.nextLine();
            data = line.split("#");

            switch (data[0].charAt(0)) {
            case 'u':
                people[peopleIndex] = new UnderGraduateStudent(data[1], data[2], data[3], data[4],
                        getDateObject(data[5]), data[6].charAt(0));
                break;
            case 'g':
                people[peopleIndex] = new GraduateStudent(data[1], data[2], getDateObject(data[3]), data[4], data[5],
                        data[6].charAt(0), data[7].charAt(0));
                break;
            case 'f':
                people[peopleIndex] = new Faculty(data[1], data[2], data[3], data[4], data[5],
                        Double.parseDouble(data[6]), getDateObject(data[7]), data[8], data[9]);
                break;
            case 's':
                people[peopleIndex] = new Staff(data[1], data[2], data[3], data[4], data[5], data[6],
                        Double.parseDouble(data[7]), getDateObject(data[8]), data[9]);
                break;
            }
            peopleIndex++;
        }

        write.println("Project 6: Person Database\nNicholas Rahbany\nCS-101-02");
        write.println("\nThe following is an echo print of the input file:");
        read = new Scanner(inputFile);
        while (read.hasNext()) {
            write.println(read.nextLine());
        }

        write.println("\nEntire database sorted by name:\n");
        sortByName(people);
        for (int index = 0; index < peopleIndex; index++) {
            if (people[index] instanceof Staff)
                write.println(((Staff) people[index]).toString());
            else if (people[index] instanceof Faculty)
                write.println(((Faculty) people[index]).toString());
            else if (people[index] instanceof GraduateStudent)
                write.println(((GraduateStudent) people[index]).toString());
            else
                write.println(((UnderGraduateStudent) people[index]).toString());
        }
        write.println();

        write.println("\nAll staff sorted by date:\n");
        sortByDate(people);
        for (int index = 0; index < people.length; index++) {
            if (people[index] instanceof Staff)
                write.println(((Staff) people[index]).toString());
        }
        write.println();

        write.println("\nAll employees sorted by salary:\n");
        sortBySalary(people);
        for (int index = 0; index < people.length; index++) {
            if (people[index] instanceof Employee)
                write.println(((Employee) people[index]).toString());
        }
        write.println();

        write.println("\nAll graduate students sorted by address:\n");
        sortByAddress(people);
        for (int index = 0; index < people.length; index++) {
            if (people[index] instanceof GraduateStudent)
                write.println(((GraduateStudent) people[index]).toString());
        }
        write.println();
    }

    /*
    Initialize Date returnDate to new Date(Integer.parseInt(date.substring(0, 2)), Integer.parseInt(date.substring(3, 5)),	Integer.parseInt(date.substring(6)))
    Return returnDate
    
    Data Table - getDateObject		
    --------------------------------
    Variable | Type   | Description
    --------------------------------
    date     | String | Obtains the Date for Person
    
    */

    private static Date getDateObject(String date) {
        Date returnDate = new Date(Integer.parseInt(date.substring(0, 2)), Integer.parseInt(date.substring(3, 5)),
                Integer.parseInt(date.substring(6)));
        return returnDate;
    }

    /*
    Initialize int subArray to 0
    Initialize int minimum to 0
    Initialize Person temp
    While (subArray < peopleIndex - 1)...
        minimum = subArray
        For (int index = subArray; index < peopleIndex; index++)...
            If ((array[index].getName()).compareTo(array[minimum].getName()) < 0)...
                Set minimum to index
        Set temp to array[minimum]
        Set array[minimum] to array[subArray]
        Set array[subArray] to temp
        subArray++

    Data Table - sortByName		
    --------------------------------
    Variable | Type	    | Description
    --------------------------------
    subArray | int	    | Used as an index
    minimum  | int      | Minimum for method
    temp     | Person   | Temporary person object
    array    | Person[]	| Array of person objects
    index    | int	    | Used as an index

    */

    private static void sortByName(Person[] array) {
        int subArray = 0;
        int minimum;
        Person temp;
        while (subArray < peopleIndex - 1) {
            minimum = subArray;
            for (int index = subArray; index < peopleIndex; index++) {
                if ((array[index].getName()).compareTo(array[minimum].getName()) < 0)
                    minimum = index;
            }
            temp = array[minimum];
            array[minimum] = array[subArray];
            array[subArray] = temp;
            subArray++;
        }
    }

    /*
    Initialize String staff to ""
    Initialize int minimum
    Initialize Person temp
    For (int index = 0; index < peopleIndex; index++)...
        If (array[index] instanceof Staff)...
            Set staff to staff + index + ", "
    Initialize String[] staffArray to staff.split(", ")
    Initialize int[] indices to new int[staffArray.length]
    For (int index = 0; index < staffArray.length; index++)...
        Set indices[index] to Integer.parseInt(staffArray[index])
    For(int i = 0; i < indices.length - 1; i++)...
        Set minimum to i
    For (int index = i; index < indices.length; index++)...
        If ((((Staff)array[indices[index]]).getHiringDate()).compareTo(((Staff)array[indices[minimum]]).getHiringDate()) < 0)...
            Set minimum to index
        Set temp to array[indices[minimum]]
        Set array[indices[minimum]] to array[indices[i]]
        Set array[indices[i]] to temp

    Data Table - sortByDate		
    ---------------------------
    Variable	  | Type	 | Description
    ---------------------------
    array	      | Person[] | Array of person objects
    staff	      | String	 | Person object that keeps being redefined
    subArray      | int	     | Used as an index
    index	      | int	     | Used as an index
    minimum	      | int	     | Used as a minimum
    temp	      | Person	 | The temporary person object for the method
    staffArray    | String[] | Array of staff members
    indices	int[] | Array    | Used for recursion
    
    */

    private static void sortByDate(Person[] array) {
        String staff = "";
        int minimum;
        Person temp;
        for (int index = 0; index < peopleIndex; index++) {
            if (array[index] instanceof Staff)
                staff += index + ", ";
        }
        String[] staffArray = staff.split(", ");
        int[] indices = new int[staffArray.length];
        for (int index = 0; index < staffArray.length; index++) {
            indices[index] = Integer.parseInt(staffArray[index]);
        }
        for (int i = 0; i < indices.length - 1; i++) {
            minimum = i;
            for (int index = i; index < indices.length; index++) {
                if ((((Staff) array[indices[index]]).getHiringDate())
                        .compareTo(((Staff) array[indices[minimum]]).getHiringDate()) < 0)
                    minimum = index;
            }
            temp = array[indices[minimum]];
            array[indices[minimum]] = array[indices[i]];
            array[indices[i]] = temp;
        }
    }

    /*
    Initialize String employees to ""
    For (int index = 0; index < peopleIndex; index++)...
        If (array[index] instanceof Employee)...
            Set employees to employees + index + ", "
    Initialize String[] employeesArray to employees.split(", ")
    Initialize int[] indices to new int[employeesArray.length]
    For (int index = 0; index < employeesArray.length; index++)...
        Set indices[index] to Integer.parseInt(employeesArray[index])
    Initialize int minimum
    Initialize Person temp
    For(int i = 0; i < indices.length - 1; i++)...
        Set minimum to i
        For (int index = i; index < indices.length; index++)...
            If (((Employee)array[indices[index]]).getSalary() < ((Employee)array[indices[minimum]]).getSalary())...
                Set minimum to index
        Set temp to array[indices[minimum]]
        Set array[indices[minimum]] to array[indices[i]]
        Set array[indices[i]] to temp

    Data Table - sortBySalary		
    --------------------------------
    Variable	   | Type	  | Description
    --------------------------------
    array	       | Person[] | Array of person objects
    employees	   | String	  | A string of employees that continuously gets added upon
    index	       | int	  | Used as an index
    employeesArray | String[] | An array of Employees
    indices	       | int[]    | Array made for recursion
    subArray	   | int	  | Used as an index
    minimum	       | int	  | Used as the minimum
    temp	       | Person	  | The temporary person object

    */

    private static void sortBySalary(Person[] array) {
        String employees = "";
        for (int index = 0; index < peopleIndex; index++) {
            if (array[index] instanceof Employee)
                employees += index + ", ";
        }
        String[] employeesArray = employees.split(", ");
        int[] indices = new int[employeesArray.length];
        for (int index = 0; index < employeesArray.length; index++) {
            indices[index] = Integer.parseInt(employeesArray[index]);
        }
        int minimum;
        Person temp;
        for (int i = 0; i < indices.length - 1; i++) {
            minimum = i;
            for (int index = i; index < indices.length; index++) {
                if (((Employee) array[indices[index]]).getSalary() < ((Employee) array[indices[minimum]]).getSalary())
                    minimum = index;
            }
            temp = array[indices[minimum]];
            array[indices[minimum]] = array[indices[i]];
            array[indices[i]] = temp;
        }
    }

    /*
    Initialize int subArray to 0
    Initialize int minimum
    Initialize Person temp
    While (subArray < peopleIndex - 1)...
        Set minimum to subArray
        For (int index = subArray; index < peopleIndex; index++)...
            If ((array[index].getAddress()).compareTo(array[minimum].getAddress()) < 0)...
                Set minimum to index
        Set temp to array[minimum]
        Set array[minimum] to array[subArray]
        Set array[subArray] to temp
        subArray++

    Data Table - sortByAddress		
    --------------------------------
    Variable	   | Type	  | Description
    --------------------------------
    array	       | Person[] |	Array of person objects
    graduates	   | String	  | A string of graduates that continuously gets added upon
    index	       | int	  | Used as an index
    graduatesArray | String[] | An array of Graduate Students
    indices	       | int[]	  | Array made for recursion
    subArray	   | int	  | Used as an index
    minimum	       | int	  | Used as the minimum
    temp	       | Person	  | The temporary person object

    */

    private static void sortByAddress(Person[] array) {
        int subArray = 0;
        int minimum;
        Person temp;
        while (subArray < peopleIndex - 1) {
            minimum = subArray;
            for (int index = subArray; index < peopleIndex; index++) {
                if ((array[index].getAddress()).compareTo(array[minimum].getAddress()) < 0)
                    minimum = index;
            }
            temp = array[minimum];
            array[minimum] = array[subArray];
            array[subArray] = temp;
            subArray++;
        }
    }
}