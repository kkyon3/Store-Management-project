public class Coffee extends Beverage {

 // whether the coffee has creamer
    private boolean hasCreamer;

    /*
     * No argument constructor
     */
public Coffee() {
        super(false, 7.0, 8);
        this.hasCreamer = false;
    }

    /*
     * Parameterize constructor (isCold, price)
     */  
public Coffee(boolean isCold, double price) {
        super(isCold, price, 8);
       this.hasCreamer = false;
    }

    /*
     * Parameterize constructor (isCold)
     */
public Coffee(boolean isCold) {
        super(isCold, 7.0, 8);
      this.hasCreamer = false;
    }

    /*
     * Parameterize constructor (price)
     */
public Coffee(double price) {
        super(false, price, 8);
        this.hasCreamer = false;
    }

    /*
     * Parameterize constructor (full params)
     */  
 public Coffee(boolean isCold, double price, int sizeInOz, boolean hasCreamer) {
        super(isCold, price, sizeInOz);
        this.hasCreamer = hasCreamer;
    }

    /*
     * Get method for hasCreamer
     */
public boolean getHasCreamer() {
        return hasCreamer;
    }

    /*
     * set method for hasCreamer
     */
  public void setHasCreamer(boolean hasCreamer) {
        this.hasCreamer = hasCreamer;
    }

    /*
     * toString method
     */
public String toString() {
    return super.toString() + "Has creamer: " + hasCreamer;
    }

  
}
