public class Tea extends Juice{
  
    // whether the Tea is hot
    private boolean isHot;       

    /*
     * No argument constructor
     */
  public Tea() {
        super(false, 4.0, 8, false, "none");
        this.isHot = true;
    }
    /*
     * Parameterize constructor (isCold, price)
     */
   public Tea(boolean isCold, double price) {
        super(isCold, price, 8, false, "none");
        this.isHot = true;
    }
    /*
     * Parameterize constructor (isCold)
     */
  public Tea(boolean isCold) {
        super(isCold, 4.0, 8, false, "none");
        this.isHot = true;
    }
    /*
     * Parameterize constructor (price)
     */
    public Tea(double price) {
        super(false, price, 8, false, "none");
      this.isHot = true;
    }
      /*
     * Parameterize constructor (flavor)
     */
 public Tea(String flavor) {
        super(false, 4.0, 8, false, flavor);
       this.isHot = true;
    }
    /*
     * Parameterize constructor (full params)
     */
    public Tea(boolean isCold, double price, int sizeInOz,
               boolean isHot, boolean hasCreamer, String flavor) {
      super(isCold, price, sizeInOz, hasCreamer, flavor);
        this.isHot = isHot;
    }
    /*
     * Get method for isHot
     */
    public boolean getIsHot() {
        return isHot;
    }
    /*
     * Set method for isHot
     */
    public void setIsHot(boolean isHot) {
        this.isHot = isHot;
    }

    /*
     * toString method
     */
    public String toString() {
      return super.toString() + "Is hot: " + isHot;
    }
}
