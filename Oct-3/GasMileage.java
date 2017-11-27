public class GasMileage {

    /*pseudocode:
    
    main(args)
        numberOfMiles
        numberOfGallons
        mileage = numberOfMiles/numberOfGallons    
        print numberOfMiles, numberOfGallons, mileage
    
    DataTable:
    -------------------------------------------
    Name:           | Type:   | Purpose:
    -------------------------------------------
    numberOfMiles   | double  | defines number of miles
    numberOfGallons | double  | defines number of gallons
    mileage         | double  | calculates mileage
    
    */

    public static void main(String[] args) {

        //define number of miles
        double numberOfMiles;
        numberOfMiles = 120.5;

        //define number of gallons
        double numberOfGallons;
        numberOfGallons = 6.3;

        //calculate mileage
        double mileage;
        mileage = numberOfMiles / numberOfGallons;

        //print out information
        System.out.println("Total Mileage: " + mileage + ", Number Of Miles: " + numberOfMiles + ", Number Of Gallons: "
                + numberOfGallons);
    }
}