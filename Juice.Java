public class Juice extends Coffee {

  // flavor of juice
    private String flavor;

    /*
     * No argument constructor
     */   
 public Juice() {
     super(false, 7.0, 8, false);
        this.flavor = "Orange";
    }

    /*
     * Parameterize constructor (isCold, price)
     */
   public Juice(boolean isCold, double price) {
        super(isCold, price, 8, false);
       this.flavor = "Orange";
    }


    /*
     * Parameterize constructor (isCold)
     */
    public Juice(boolean isCold) {
      super(isCold, 7.0, 8, false);
        this.flavor = "Orange";
    }

    /*
     * Parameterize constructor (price)
     */
   public Juice(double price) {
        super(false, price, 8, false);
        this.flavor = "Orange";
    }

    /*
     * Parameterize constructor (full params)
     */
public Juice(boolean isCold, double price, int sizeInOz,
                 boolean hasCreamer, String flavor) {
    super(isCold, price, sizeInOz, hasCreamer);
    this.flavor = flavor;
    }

    /*
     * Get method for flavor
     */
public String getFlavor() {
     return flavor;
    }

    /*
     * set method for flavor
     */
  public void setFlavor(String flavor) {
      this.flavor = flavor;
    }

    /*
     * toString method
     */
  public String toString() {
      return super.toString() + "Flavor: " + flavor;
    }
}
