public class Tea extends Juice {

    private boolean isHot;

    public Tea() {
        super(false, 4.0, 8, false, "none");
        this.isHot = true;
    }

    public Tea(boolean isCold, double price) {
        super(isCold, price, 8, false, "none");
        this.isHot = true;
    }

    public Tea(boolean isCold) {
        super(isCold, 4.0, 8, false, "none");
        this.isHot = true;
    }

    public Tea(double price) {
        super(false, price, 8, false, "none");
        this.isHot = true;
    }
  
   public Tea(String flavor) {
        super(false, 4.0, 8, false, flavor);
        this.isHot = true;
    }

    public Tea(boolean isCold, double price, int sizeInOz,
               boolean isHot, boolean hasCreamer, String flavor) {
        super(isCold, price, sizeInOz, hasCreamer, flavor);
        this.isHot = isHot;
    }

    public boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(boolean isHot) {
        this.isHot = isHot;
    }
}
