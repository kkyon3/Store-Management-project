public class Beverage{

  // instance variables for beverage superclass
  private boolean isCold;
  private double price; 
  private int sizeInOz;


    /*
     * No argument constructor
     */
  public Beverage(){
  this(true, 5.0, 8);
  }

   /*
     * Parameterize constructor (isCold, price, sizeInOz)
     */
    public Beverage(boolean isCold, double price, int sizeInOz) {
      this.isCold = isCold;
      this.price = price;
      this.sizeInOz = sizeInOz;
} 

   /*
     * get method for isCold
     */
public boolean getIsCold(){
    return isCold;
}

   /*
     * set method for isCold
     */
  public void setIsCold(boolean isCold) {
      this.isCold = isCold;
  }

   /*
     * get method for price
     */
public double getprice(){
    return price;
}

  /*
     * set method for price
     */
public void setPrice(double price) {
    this.price = price;
  }

    /*
     * get method for sizeInOz
     */
public int getSizeInOz(){
   return sizeInOz;
}

    /*
     * set method for sizeInOz
     */
public void setSizeInOz(int sizeInOz) {
    this.sizeInOz = sizeInOz;
  }
  

    /*
     * toString method
     */
 public String toString() {
    return "Cold: " + isCold + "\n" + 
           "Price: " + price + "\n" +
           "Size: " + sizeInOz + "\n";
 }
  
}
