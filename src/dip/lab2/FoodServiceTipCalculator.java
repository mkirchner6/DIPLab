package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator{
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;

    private double tipPercent;
    private double bill;

    public FoodServiceTipCalculator(double tipPercent, double billAmt) {
        this.setTipPercent(tipPercent);
        this.setBill(billAmt);
    }

    public final double getTip() {
        return bill * tipPercent;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final double getTipPercent() {
        return tipPercent;
    }

    public final void setTipPercent(double tipPercent) {
        if(tipPercent < 0 || tipPercent > 1){
            throw new IllegalArgumentException("Must be a valid percent");
        }
        this.tipPercent = tipPercent;
    }

}
