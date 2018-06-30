/*
Nicholas Rahbany
CS101
Kettering University
*/

/*
array is a public new int array
*/

/*
Data Table - Set Class
-----------------------------------
Variable | Type  | Purpose
-----------------------------------
array    | int[] | A public array that is manipulated in the code
*/

public class Set {
    public int[] array;

    /*
    array is a new int array with size 0
    */

    /*
    Data Table - Set
    -----------------------------------
    Variable | Type  | Purpose
    -----------------------------------
    array    | int[] | Generates a new array
    */

    public Set() {
        array = new int[0];
    }

    /*
    array equals a new int array size 0
    return
    */

    /*
    Data Table - makeEmpty
    -----------------------------------
    Variable | Type| Purpose
    -----------------------------------
    index    | int | Used as an index for loops
    */

    public void makeEmpty() {
        array = new int[0];
        return;
    }

    /*
    if (the array length is zero)
       return false
    return true
    */

    /*
    Data Table - isEmpty
    -----------------------------------
    Variable | Type| Purpose
    -----------------------------------
    */

    public boolean isEmpty() {
        if (array.length > 0)
            return false;
        return true;
    }

    /*
    if(there is a value in the array the same as the input)
       return
    newArray is a new int [array length + 1]
    for (index equals 0, index < array length, add one to index)
       newArray[index] equals array[index]
    array equals newArray
    array[array length - 1] equals value
    */

    /*
    Data Table - add
    -----------------------------------
    Variable | Type  | Purpose
    -----------------------------------
    newArray | int[] | A second array that the modifications will be saved to
    index	 | int   | Used as an index for loops
    */

    public void add(int value) {
        if (elementOf(value))
            return;
        int newArray[] = new int[array.length + 1];
        for (int index = 0; index < array.length; index++) {
            newArray[index] = array[index];
        }
        array = newArray;
        array[array.length - 1] = value;
    }

    /*
    if(there is not a value in the array the same as the input)
       return
    newArray is a new int [array length - 1]
    index equals 0
    counter equals 0
    for (index equals 0, index < array length, add one to index)
       if(array[index] does not equal value)
           newArray[counter] equals array[index]
           add one to counter
    this array equals newArray
    return
    */

    /*
    Data Table - remove
    -----------------------------------
    Variable | Type  | Purpose
    -----------------------------------
    newArray | int[] | A second array that the modifications will be saved to
    index	 | int   | Used as an index for loops
    counter	 | int	 | Used as a secondary index
    */

    public void remove(int value) {
        if (!(elementOf(value)))
            return;
        int newArray[] = new int[array.length - 1];
        int index = 0;
        int counter = 0;
        for (index = 0; index < array.length; index++) {
            if (array[index] != value) {
                newArray[counter] = array[index];
                counter++;
            }
        }
        this.array = newArray;
        return;
    }

    /*
    index equals 0
    result equals false
    while (index is less than the array length and result is false)
       if(array[index] equals value)
           result equals true
       add one to index
    return result
    */

    /*
    Data Table - elementOf
    -----------------------------------
    Variable | Type    | Purpose
    -----------------------------------
    newArray | int[]   | A second array that the modifications will be saved to
    index	 | int     | Used as an index for loops
    result	 | boolean | Used as the return value
    */

    public boolean elementOf(int value) {
        int index = 0;
        boolean result = false;
        while (index < array.length && result == false) {
            if (array[index] == value)
                result = true;
            index++;
        }
        return result;
    }

    /*
    return the array length
    */

    /*
    Data Table - size
    -----------------------------------
    Variable | Type    | Purpose
    -----------------------------------
    */

    public int size() {
        return array.length;
    }

    /*
    newSet equals a new Set
    for(index equals 0, index is less than the size of the array, add one to index)
       add the value at the index to newSet
    for(index equals 0, index is less than the size of the argument, add one to index)
       add the value at the index of the argument to newSet
    return newSet
    */

    /*
    Data Table - union
    -----------------------------------
    Variable | Type | Purpose
    -----------------------------------
    newSet	 | Set  | Used as a new Set object for changes made
    index	 | int  | Used as an index for loops
    */

    public Set union(Set set2) {
        Set newSet = new Set();
        for (int index = 0; index < size(); index++) {
            newSet.add(valueAt(index));
        }
        for (int index = 0; index < set2.size(); index++) {
            newSet.add(set2.valueAt(index));
        }
        return newSet;
    }

    /*
    newSet equals a new Set
    for (index equals 0, index is less than argument's size, add one to index)
       if (there is an element at the index of the argument that is similar to the array)
           add the value from object to newSet
    return newSet
    */

    /*
    Data Table - intersection
    -----------------------------------
    Variable | Type | Purpose
    -----------------------------------
    newSet   | Set  | Used as a new Set object for changes
    index    | int  | Used as an index for loops
    */

    public Set intersection(Set object) {
        Set newSet = new Set();
        for (int index = 0; index < object.size(); index++) {
            if (elementOf(object.valueAt(index)))
                newSet.add(object.valueAt(index));
        }
        return newSet;
    }

    /*
    differenceSet is a new Set
    for(index equals 0, index is less than the size, add one to index)
        add value at index to differenceSet
    for(index equals 0, index is less than the size of argument, add one to index)
        remove value at index of the argument to differenceSet
    return differenceSet
    */

    /*
    Data Table - setDifference
    -----------------------------------
    Variable        | Type | Purpose
    -----------------------------------
    unionSet        | Set  | Creates a set object that will be used for the union function
    intersectionSet | Set  | Set object that Is used for the intersection function
    differenceSet   | Set  | A Set object that Is used for the setDifference function
    */

    public Set setDifference(Set object) {
        Set differenceSet = new Set();
        for (int index = 0; index < size(); index++) {
            differenceSet.add(valueAt(index));
        }
        for (int index = 0; index < object.size(); index++) {
            differenceSet.remove(object.valueAt(index));
        }
        return differenceSet;
    }

    /*
    result equals "{ "
    for (index equals 0, index is less than the length of the array, add one to index)
       if(index is less than the array's length minus one)
           result equals itself plus array[index] plus ", "
       else if (index < length of the array)
           retult equals itself plus array[index] plus " }"
    return result
    */

    /*
    Data Table - toString
    -----------------------------------
    Variable | Type   | Purpose
    -----------------------------------
    result	 | String |	The value that will be returned
    index	 | int	  | Used as an index for loops
    */

    public String toString() {
        String result = "{ ";
        for (int index = 0; index < array.length; index++) {
            if (index < array.length - 1)
                result = result + array[index] + ", ";
            else if (index < array.length)
                result = result + array[index] + " }";
        }
        return result;
    }

    /*
    return array at the position of the number, argument
    */

    /*
    Data Table - valueAt
    -----------------------------------
    Variable | Type   | Purpose
    -----------------------------------
    */

    public int valueAt(int index) {
        return array[index];
    }
}