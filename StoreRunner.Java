/* 
*Create the scanner class
* the Scanner clas takes the user's input
*/

import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

 Scanner input = new Scanner(System.in);


/* 
* Asks for the user's specific beverage type
* options include the following things in the parentheses
*/
 System.out.println("Enter beverage type (Beverage, Coffee, Juice, Tea):");
 String type = input.nextLine();

 System.out.println("Is it cold?");
 boolean isCold = input.nextBoolean();

 System.out.println("Enter price:");
 double price = input.nextDouble();

 System.out.println("Enter size in ounces:");
 int sizeInOz = input.nextInt();


/*
* user input
*related to the beverage class
*print output
*/
 if (type.equalsIgnoreCase("Beverage")) {

   Beverage beverage = new Beverage(isCold, price, sizeInOz);

   System.out.println();
   System.out.println("Here's your Beverage!");
   System.out.println(beverage);
   System.out.println("Cold: " + beverage.getIsCold());
   System.out.println("Price: " + beverage.getprice());
   System.out.println("Size: " + beverage.getSizeInOz() + " oz");
 }

/*
* user input
*related to the coffee class
*print output
*/
 if (type.equalsIgnoreCase("Coffee")) {

   System.out.println("Has creamer?");
   boolean coffeeCreamer = input.nextBoolean();

   Coffee coffee = new Coffee(isCold, price, sizeInOz, coffeeCreamer);

   System.out.println();
   System.out.println("Here's your Coffee!");
   System.out.println("Cold: " + coffee.getIsCold());
   System.out.println("Price: " + coffee.getprice());
   System.out.println("Size: " + coffee.getSizeInOz() + " oz");
   System.out.println("Has creamer: " + coffee.getHasCreamer());

 }

/*
* user input
*related to the juice class]
*prints out based on input
*/
 if (type.equalsIgnoreCase("Juice")) {

   System.out.println("Has creamer?");
   boolean juiceCreamer = input.nextBoolean();

   input.nextLine();

   System.out.println("Enter flavor:");
   String juiceFlavor = input.nextLine();

   Juice juice = new Juice(isCold, price, sizeInOz,
         juiceCreamer, juiceFlavor);

   System.out.println();
   System.out.println("Here's your Juice!");
   System.out.println("Cold: " + juice.getIsCold());
   System.out.println("Price: " + juice.getprice());
   System.out.println("Size: " + juice.getSizeInOz() + " oz");
   System.out.println("Has creamer: " + juice.getHasCreamer());
   System.out.println("Flavor: " + juice.getFlavor());

 }

    /*
* user input
*related to the tea class
*print output
*/
 if (type.equalsIgnoreCase("Tea")) {

   System.out.println("Is it hot?");
   boolean isHot = input.nextBoolean();

   System.out.println("Has creamer?");
   boolean teaCreamer = input.nextBoolean();

   input.nextLine();

   System.out.println("Enter flavor:");
   String teaFlavor = input.nextLine();

   Tea tea = new Tea(isCold, price, sizeInOz,
      isHot, teaCreamer, teaFlavor);

   System.out.println();
   System.out.println("Here's your Tea!");
   System.out.println("Cold: " + tea.getIsCold());
   System.out.println("Price: " + tea.getprice());
   System.out.println("Size: " + tea.getSizeInOz() + " oz");
   System.out.println("Is hot: " + tea.getIsHot());
   System.out.println("Has creamer: " + tea.getHasCreamer());
   System.out.println("Flavor: " + tea.getFlavor());

 }

/*
*close the scanner class
*print nice message to console
*/
  System.out.println();
    System.out.println("Thanks for visiting! :D");

    input.close();
  }
}
