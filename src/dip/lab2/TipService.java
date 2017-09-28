/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author mattkirchner
 */
public class TipService {
    private TipCalculator calc;

    public TipService(TipCalculator calc) {
        this.setCalc(calc);
    }

    public final TipCalculator getCalc() {
        return calc;
    }

    public final void setCalc(TipCalculator calc) {
        if(calc == null){
            throw new IllegalArgumentException("Must have an object");
        }
        this.calc = calc;
    }
    
    public final double getTip(){
        return calc.getTip();
    }
}
