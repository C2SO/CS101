/*
Nicholas Rahbany 
CS101
*/

/*
Initialize int month
Initialize int day
Initialize int year
Initialize String date

Data Table - Date Class		
-------------------------------
Variable | Type   | Description
-------------------------------
month    | int	  | Month number
day	     | int	  | Day number
year     | int	  | Year number
date	 | String | The combination of all three integers
*/

public class Date {
    private int month;
    private int day;
    private int year;
    private String date;

    /*
    setMonth(month)
    setDay(day)
    setYear(year)
    setDate()
    
    Data Table - Date	
    -------------------------------	
    Variable | Type | Description
    -------------------------------
    month    | int	| Month number
    day	     | int	| Day number
    year	 | int	| Year number
    */

    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
        setDate();
    }

    /*
    Set this.month to month
    setDate()
    
    Data Table - setMonth	
    -------------------------------	
    Variable | Type | Description
    -------------------------------
    month	 | int	| Month number    
    */

    public void setMonth(int month) {
        this.month = month;
        setDate();
    }

    /*
    Set this.day to day
    setDate()
    
    Data Table - setDay	
    -------------------------------	
    Variable | Type | Description
    -------------------------------
    day	     | int  | Day number    
    */

    public void setDay(int day) {
        this.day = day;
        setDate();
    }

    /*
    Set this.year to year
    setDate()
    
    Data Table - setYear	
    -------------------------------	
    Variable | Type | Description
    -------------------------------
    year     | int  | Year Number
    */

    public void setYear(int year) {
        this.year = year;
        setDate();
    }

    /*
    Set date to month + "/" + day + "/" + year
    
    Data Table - setDate		
    -------------------------------
    Variable | Type  | Description
    -------------------------------    
    */

    public void setDate() {
        date = month + "/" + day + "/" + year;
    }

    /*
    Return month
    
    Data Table - getMonth		
    -------------------------------
    Variable | Type  | Description
    -------------------------------    
    */

    public int getMonth() {
        return month;
    }

    /*
    Return day
    
    Data Table - getDay		
    -------------------------------
    Variable | Type  | Description
    -------------------------------    
    */

    public int getDay() {
        return day;
    }

    /*
    Return year
    
    Data Table - getYear		
    -------------------------------
    Variable | Type  | Description
    -------------------------------    
    */

    public int getYear() {
        return year;
    }

    /*
    Return date
    
    Data Table - getDate	
    -------------------------------
    Variable | Type  | Description
    -------------------------------    
    */

    public String getDate() {
        return date;
    }

    /*
    If (year == dateObject.getYear())...
        If (month == dateObject.getMonth())...
            Return day - dateObject.getDay()
        Else…
            Return month - dateObject.getMonth()
    Else…
        Return year - dateObject.getYear()
    
    Data Table - compareTo		
    -------------------------------
    Variable   | Type | Description
    -------------------------------
    dateObject | Date | Date object for sorting    
    */

    public int compareTo(Date dateObject) {
        if (year == dateObject.getYear()) {
            if (month == dateObject.getMonth())
                return day - dateObject.getDay();
            else
                return month - dateObject.getMonth();
        } else
            return year - dateObject.getYear();
    }
}