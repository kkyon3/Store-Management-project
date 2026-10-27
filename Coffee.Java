public class Coffee extends Beverage {

  /*
*create instance variable
*the instance variable is if the coffee has creamer
*I had to used it in the other classes because I didn't know how to get rid of the creamer condition
*even though I know juice nor tea used creamer :/
*PS, I think it's cause juice and tea are both subclasses of coffee but I'm just gonna leave it since it doesn't make much of difference
  */
  
    private boolean hasCreamer;

  /*
*create parmeters
*used to collect the users input
*/
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
