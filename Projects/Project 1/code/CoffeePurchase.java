
/*
  Rahbany, Nicholas
  This program obtains user input and calculates cost and quantity based on how much a user has ordered
  CS101
  10/12/2017       date(s) of work here
*/

import java.text.*;
import javax.swing.*;
import java.awt.*;

public class CoffeePurchase {

  /* 
  
  main(args)
    initialize BAG_PRICE
    initialize LARGE_BOX_PRICE
    initialize MED_BOX_PRICE
    initialize SMALL_BOX_PRICE
    initialize BAGS_IN_LARGE
    initialize BAGS_IN_MED
    initialize BAGS_IN_SMALL
    read customerName using JOptionPane showInputDialog
    read dayEntry
    read monthEntry
    read yearEntry
    day -  convert dayEntry to int (using Integer.parseInt)
    month - convert monthEntry to int
    year - convert yearEntry to int
    purchaseDate - SimpleDate object from month, day,  year
    deliveryDate - SimpleDate object from month, day,  year
    deliveryDate.nextDay()
    deliveryDate.nextDay()
    deliveryDate.nextDay()
    deliveryDate.nextDay()
    deliveryDate.nextDay()
    deliveryDate.nextDay()
    deliveryDate.nextDay()
    read poundsCoffeeEntry
    poundsCoffeeDouble - convert poundsCoffeeEntry to double
    poundsCoffeeDouble - ceiling of poundsCoffeeDouble
    poundsCoffee - convert poundsCoffeeDouble to int
    bagsCoffee - (poundsCoffee + 1)/2
    coffeeCost - bagsCoffee * BAG_PRICE
    currentBags - bagsCoffee
    numberLargeBoxes - currentBags / BAGS_IN_LARGE
    currentBags - currentBags % BAGS_IN_LARGE
    numberMedBoxes - currentBags / BAGS_IN_MED
    currentBags - currentBags % BAGS_IN_MED
    numberSmallBoxes - (currentBags + 2) / BAGS_IN_SMALL
    largeBoxCost - numberLargeBoxes * LARGE_BOX_PRICE
    medBoxCost - numberMedBoxes * MED_BOX_PRICE
    smallBoxCost - numberSmallBoxes * SMALL_BOX_PRICE
    initialize MONEY_FORMAT
    priceFormat - construct DecimalFormat object from MONEY_FORMAT
    totalBoxCost - largeBoxCost + medBoxCost + smallBoxCost
    totalCostOfOrder - coffeeCost + totalBoxCost
    coffeeCostDisplay - format coffeeCost  using priceFormat
    lgBoxDisplay - format largeBoxCost  using priceFormat 
    medBoxDisplay - format medBoxCost  using priceFormat 
    smBoxDisplay - format smallBoxCost  using priceFormat 
    totalCostDisplay - format totalCostOfOrder  using priceFormat 
    purchaseOrder - concatenate with labels all of customerName,
        purchaseDate, deliveryDate, bagsCoffee, coffeeCostDisplay,
        numberLargeBoxes, lgBoxDisplay, numberMedBoxes,
        medBoxDisplay, numberSmallBoxes, smBoxDisplay, totalCostDisplay
    print purchaseOrder using JOptionPane showMessageDialog
  */

  /* 
  Variable           Type          Purpose
  args               String []     parameter, unused
  BAG_PRICE          double        current charge for 2 lb. Bag
  LARGE_BOX_PRICE    double        current charge for large box
  MED_BOX_PRICE      double        current charge for large box
  SMALL_BOX_PRICE    double        current charge for large box
  BAGS_IN_LARGE      int           number of bags in large box
  BAGS_IN_MED        int           number of bags in medium box
  BAGS_IN_SMALL      int           number of bags in small box
  customerName       String        name of customer
  dayEntry           String        input of day
  day                int           numeric day
  monthEntry         String        input of month
  month              int           numeric month
  yearEntry          String        input of year
  year               int           numeric year
  purchaseDate       SimpleDate    record today’s date
  deliveryDate       SimpleDate    date order delivered to customer
  poundsCoffeeEntry  String        input of amount purchased
  poundsCoffeeDouble double        numeric amount purchased
  poundsCoffee       int           integer amount requested
  bagsCoffee         int           number of bags purchased
  coffeeCost         double        cost of coffee
  currentBags        int           remaining bags, needed for box calculation
  numberLargeBoxes   int           number of large boxes needed
  numberMedBoxes     int           number of medium boxes needed
  numberSmallBoxes   int           number of small boxes needed
  largeBoxCost       double        cost of large boxes
  medBoxCost         double        cost of medium boxes
  smallBoxCost       double        cost of small boxes
  MONEY_FORMAT       String        "$#,##0.00" for standard money format
  priceFormat        DecimalFormat object to format double to money String
  totalBoxCost       double        total cost of boxes
  totalCostOfOrder   double        total cost of order (coffee and boxes)
  coffeeCostDisplay  String        cost of coffee as money String
  lgBoxDisplay       String        cost of large boxes as money String
  medBoxDisplay      String        cost of medium boxes as money String
  smBoxDisplay       String        cost of small boxes as money String
  totalCostDisplay   String        totalCostOfOrder as money String
  purchaseOrder      String        String containing entire purchase ord
  */

  public static void main(String[] args) {

    //Set Constants
    final double BAG_PRICE = 2.33;
    final double LARGE_BOX_PRICE = 1.51;
    final double MED_BOX_PRICE = 0.96;
    final double SMALL_BOX_PRICE = 0.57;
    final int BAGS_IN_LARGE = 12;
    final int BAGS_IN_MED = 6;
    final int BAGS_IN_SMALL = 3;

    //Read customerName using JOptionPane showInputDialog
    String customerName = JOptionPane.showInputDialog(null, "What is your name?");

    //Read date
    String dayEntry = JOptionPane.showInputDialog(null, "What is today's day?");
    String monthEntry = JOptionPane.showInputDialog(null, "What is the current month?");
    String yearEntry = JOptionPane.showInputDialog(null, "What is the current year?");
    
    //Convert entries into int
    int day = Integer.parseInt(dayEntry);
    int month = Integer.parseInt(monthEntry);
    int year = Integer.parseInt(yearEntry);

    //Create your purchase and delivery date variables
    SimpleDate purchaseDate = new SimpleDate(month, day, year);
    SimpleDate deliveryDate = new SimpleDate(month, day, year);
    deliveryDate.nextDay();
    deliveryDate.nextDay();
    deliveryDate.nextDay();
    deliveryDate.nextDay();
    deliveryDate.nextDay();
    deliveryDate.nextDay();
    deliveryDate.nextDay();

    //Read the pounds of coffee ordered
    String poundsCoffeeEntry = JOptionPane.showInputDialog(null, "How many pounds of coffee would you like to order?");

    //Setting type of poundsCoffyEntry
    double poundsCoffeeDouble = Double.parseDouble(poundsCoffeeEntry);
    poundsCoffeeDouble = Math.ceil(poundsCoffeeDouble);
    int poundsCoffee = Integer.parseInt(poundsCoffeeEntry);

    //Convert pounds of coffee into bags
    int bagsCoffee = (poundsCoffee + 1)/2;

    //Calculate math per number of pounds ordered
    double coffeeCost = bagsCoffee * BAG_PRICE;
    int currentBags = bagsCoffee;
    int numberLargeBoxes = currentBags / BAGS_IN_LARGE;
    currentBags = currentBags % BAGS_IN_LARGE;
    int numberMedBoxes = currentBags / BAGS_IN_MED;
    currentBags = currentBags % BAGS_IN_MED;
    int numberSmallBoxes = (currentBags + 2) / BAGS_IN_SMALL;
    double largeBoxCost = numberLargeBoxes * LARGE_BOX_PRICE;
    double medBoxCost = numberMedBoxes * MED_BOX_PRICE;
    double smallBoxCost = numberSmallBoxes * SMALL_BOX_PRICE;

    //Initialize MONEY_FORMAT, which sets the printing instructions of the total cost
    final String MONEY_FORMAT = "$#,##0.00";

    //Format all prices
    DecimalFormat priceFormat = new DecimalFormat(MONEY_FORMAT);
    double totalBoxCost = largeBoxCost + medBoxCost + smallBoxCost;
    double totalCostOfOrder = coffeeCost + totalBoxCost;
    String coffeeCostDisplay = priceFormat.format(coffeeCost);
    String lgBoxDisplay = priceFormat.format(largeBoxCost); 
    String medBoxDisplay = priceFormat.format(medBoxCost); 
    String smBoxDisplay = priceFormat.format(smallBoxCost);
    String totalCostDisplay = priceFormat.format(totalCostOfOrder);
    
    //Finalize and print
    String purchaseOrder = ("Name: " + customerName + "\n" + purchaseDate + "\n" + "Delivery Date: " + deliveryDate + "\n\n" + 
    bagsCoffee + " Bags of Coffee" + " . . . " + coffeeCostDisplay + "\n" + numberLargeBoxes + " Large Boxes" + " . . . . . . . . . " + 
    lgBoxDisplay + "\n" + numberMedBoxes + " Medium Boxes" + " . . . . . " + medBoxDisplay + "\n" + numberSmallBoxes + " Small Boxes" + 
    " . . . . . . . " + smBoxDisplay + "\n\n" + "Total Cost" + " . . . . . . . . " + totalCostDisplay + 
    "\n\nThank you for your JavaLumen Corporation coffee purchase!");
    JOptionPane.showMessageDialog(null, purchaseOrder);

  }
}