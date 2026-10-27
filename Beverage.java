ublic class Beverage{
/*
*Set instance variables for the super class
*/
  private boolean isCold;
  private double price; 
  private int sizeInOz;

  
  public Beverage(){
  this(true, 5.0, 8);
  }

/*
*create parmeters
*used to collect the users input
*/
  public Beverage(boolean isCold, double price, int sizeInOz) {
this.isCold = isCold;
this.price = price;
this.sizeInOz = sizeInOz;
} 

public boolean getIsCold(){
  return isCold;
}
  public void setIsCold(boolean isCold) {
    this.isCold = isCold;
  }

  
public double getprice(){
  return price;
}
public void setPrice(double price) {
    this.price = price;
  }

  
public int getSizeInOz(){
   return sizeInOz;
}
public void setSizeInOz(int sizeInOz) {
    this.sizeInOz = sizeInOz;
  }
 public String toString() {
    return isCold + "." + price;
 }
}
