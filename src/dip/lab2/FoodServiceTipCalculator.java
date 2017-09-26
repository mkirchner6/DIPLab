package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator {
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;

    private double bill;

    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final double getGoodRate() {
        return goodRate;
    }

    public final void setGoodRate(double goodRate) {
        if(goodRate < 0 || goodRate > 1){
            throw new IllegalArgumentException("Must be a valid percent");
        }
        this.goodRate = goodRate;
    }

    public final double getFairRate() {
        return fairRate;
    }

    public final void setFairRate(double fairRate) {
        if(fairRate < 0 || fairRate > 1){
            throw new IllegalArgumentException("Must be a valid percent");
        }
        this.fairRate = fairRate;
    }

    public final double getPoorRate() {
        return poorRate;
    }

    public final void setPoorRate(double poorRate) {
        if(poorRate < 0 || poorRate > 1){
            throw new IllegalArgumentException("Must be a valid percent");
        }
        this.poorRate = poorRate;
    }

}
