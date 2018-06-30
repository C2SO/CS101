
/*
Nicholas Rahbany
CS101
Kettering University
*/

import java.util.*;
import java.io.*;

/*
inputFile equals 1st argument
outputFile equals 2nd argument
scan equals new Scanner from inputFile
write equals new writeStream from outputFile
object equals new Set object
operation is a char
index equals the int 0
secondIndex is an int
value is an int
while (there is another input)
    operation equals the next character at position 0
    if (operation soed not equal # and there is another input)
        index equals next input
        if (object equals null)
            write "There is no set number " plus number
        switch (operation)
        case C
            object[index] equals a new Set object
            write "Set number " plus index plus " has been constructed as an empty set."
            break
        case I
            if (object[index] is null)
                write "There is no set numebr" plus number
            else if (object[index] is empty)
                write "Set number " plus index plus " is empty."
            else
                write "Set number " plus index plus " is not empty."
            break
        case S
            if (object[index] is null)
                write "There is no set numebr" plus number
            else
                write "Set number " plus index plus " contains " plus object[index]'s size plus " elements."
            break
        case X
            if (object[index] is null)
                write "There is no set numebr" plus number
            else
                make object[index] empty
                write "Set number " plus index plus " has been made empty."
            break
        case A
            if (object[index] is null)
                write "There is no set numebr" plus number
            else
                value equals next input
                add the value to object[index]
                write value plus " has been added to set number " plus index
            break
        case R
            if (object[index] is null)
                write "There is no set numebr" plus number
            else
                value equals next input
                remove the input from object[index]
                write value plus " has been removed to set number " plus index
            break
        case F
            if (object[index] is null)
                write "There is no set numebr" plus number
            else
                value equals next input
                if (object[index] contains the input)
                    write "Set number " plus index plus " contains " plus value plus "."
                else
                    write "Set number " plus index plus " does not contain " plus value plus "."
            break
        case U
            secondIndex equals next input
            if (object[secondIndex] is null or object[index] is null)
                write "Unable to take the union of a nonexisting set."
                continue
            object[next input equals object[index] union of object[secondIndex]
            break
        case N
            secondIndex equals next input
            if (object[secondIndex] is null object[index] is null)
                write "Unable to take the intersection of a nonexisting set."
                continue
            object[input] equals intersection between object[index] and object[secondIndex]
            break
        case D
            secondIndex equals next input
            if (object[secondIndex] is null object[index] is null)
                write "Unable to take the difference of a nonexisting set."
                continue
            object[next input] equals the difference of object[index] and object[secondIndex]
            break
        case P
            if (object[index] is null)
                write "There is no set numebr" plus number
            else
                write the string of object[index]
            break
        case M
            Write "Elements "
            object[index] equals a new Set object
            while (there is another input)
                value equals next input
                add value to object[index]
                write value plus ", "
                Print " have been added to set number " plus index
            break
        case #
            Print"# " plus scan.nextLine()
            break
        default
            Print "Invalid command."
            break
Close scan
Close write
*/

/*
Data Table - main
-----------------------------------
Variable    | Type        | Purpose
-----------------------------------
inputFile   | File        | Sets the input file, where the program will obtain its instructions	
outputFile  | File        | The file where the program will send its results		
scan        | Scanner     | Scans the input file
write       | PrintStream | The method that is called to save the information into the output file		
object      | Set[]       | The object that will be manipulated
operation   | char        | Determines the action the program will do
index       | int         | Used as an index in for and while loops
secondIndex | int         | Used as an index in for and while loops
value       | int         | The stored value from the input text
*/

public class Driver {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("p5.txt");
        File outputFile = new File("out.txt");
        Scanner scan = new Scanner(inputFile);
        PrintStream write = new PrintStream(outputFile);
        Set[] object = new Set[100];
        char operation;
        int index = 0;
        int secondIndex;
        int value;

        while (scan.hasNext()) {
            operation = scan.next().charAt(0);
            if (operation != '#' && scan.hasNextInt()) {
                index = scan.nextInt();
                if (object[index] == null)
                    write.println("There is no set number " + index);
            }

            switch (operation) {
            case 'C':
                object[index] = new Set();
                write.println("Set number " + index + " has been constructed as an empty set.");
                break;
            case 'I':
                if (object[index] == null)
                    write.println("There is no set number " + index);
                else if (object[index].isEmpty())
                    write.println("Set number " + index + " is empty.");
                else
                    write.println("Set number " + index + " is not empty.");
                break;
            case 'S':
                if (object[index] == null)
                    write.println("There is no set number " + index);
                else
                    write.println("Set number " + index + " contains " + object[index].size() + " elements.");
                break;
            case 'X':
                if (object[index] == null)
                    write.println("There is no set number " + index);
                else {
                    object[index].makeEmpty();
                    write.println("Set number " + index + " has been made empty.");
                }
                break;
            case 'A':
                if (object[index] == null)
                    write.println("There is no set number " + index);
                else {
                    value = scan.nextInt();
                    object[index].add(value);
                    write.println(value + " has been added to set number " + index);
                }
                break;
            case 'R':
                if (object[index] == null)
                    write.println("There is no set number " + index);
                else {
                    value = scan.nextInt();
                    object[index].remove(value);
                    write.println(value + " has been removed to set number " + index);
                }
                break;
            case 'F':
                if (object[index] == null)
                    write.println("There is no set number " + index);
                else {
                    value = scan.nextInt();
                    if (object[index].elementOf(value))
                        write.println("Set number " + index + " contains " + value + ".");
                    else
                        write.println("Set number " + index + " does not contain " + value + ".");
                }
                break;
            case 'U':
                secondIndex = scan.nextInt();
                if (object[secondIndex] == null || object[index] == null) {
                    write.println("Unable to take the union of a nonexisting set.");
                    scan.nextInt();
                    continue;
                }
                object[scan.nextInt()] = object[index].union(object[secondIndex]);
                break;
            case 'N':
                secondIndex = scan.nextInt();
                if (object[secondIndex] == null || object[index] == null) {
                    write.println("Unable to take the intersection of a nonexisting set.");
                    scan.nextInt();
                    continue;
                }
                object[scan.nextInt()] = object[index].intersection(object[secondIndex]);
                break;
            case 'D':
                secondIndex = scan.nextInt();
                if (object[secondIndex] == null || object[index] == null) {
                    write.println("Unable to take the difference of a nonexisting set.");
                    scan.nextInt();
                    continue;
                }
                object[scan.nextInt()] = object[index].setDifference(object[secondIndex]);
                break;
            case 'P':
                if (object[index] == null)
                    write.println("There is no set number " + index);
                else
                    write.println(object[index].toString());
                break;
            case 'M':
                write.print("Elements ");
                object[index] = new Set();
                while (scan.hasNextInt()) {
                    value = scan.nextInt();
                    object[index].add(value);
                    write.print(value + ", ");
                    write.println(" have been added to set number " + index);
                }
                break;
            case '#':
                write.println("# " + scan.nextLine());
                break;
            default:
                write.println("Invalid command.");
                break;
            }
        }
        scan.close();
        write.close();
    }
}