public class Juice extends Coffee {

    private String flavor;

    public Juice() {
     super(false, 7.0, 8, false);
        this.flavor = "Orange";
    }

    public Juice(boolean isCold, double price) {
        super(isCold, price, 8, false);
        this.flavor = "Orange";
    }

    public Juice(boolean isCold) {
        super(isCold, 7.0, 8, false);
        this.flavor = "Orange";
    }

   public Juice(double price) {
        super(false, price, 8, false);
        this.flavor = "Orange";
    }

  public Juice(boolean isCold, double price, int sizeInOz,
                 boolean hasCreamer, String flavor) {
        super(isCold, price, sizeInOz, hasCreamer);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
