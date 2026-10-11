public class Coffee extends Beverage {

    private boolean hasCreamer;

  public Coffee() {
        super(false, 7.0, 8);
        this.hasCreamer = false;
    }

    public Coffee(boolean isCold, double price) {
        super(isCold, price, 8);
       this.hasCreamer = false;
    }

    public Coffee(boolean isCold) {
        super(isCold, 7.0, 8);
      this.hasCreamer = false;
    }

  public Coffee(double price) {
        super(false, price, 8);
        this.hasCreamer = false;
    }

 public Coffee(boolean isCold, double price, int sizeInOz, boolean hasCreamer) {
        super(isCold, price, sizeInOz);
        this.hasCreamer = hasCreamer;
    }

   public boolean getHasCreamer() {
        return hasCreamer;
    }

    public void setHasCreamer(boolean hasCreamer) {
        this.hasCreamer = hasCreamer;
    }
}
