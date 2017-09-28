/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author mattkirchner
 */
public class OutputService {
    private OutputMessage output;

    public OutputService(OutputMessage output) {
        this.output = output;
    }

    public final OutputMessage getOutput() {
        return output;
    }

    public final void setOutput(OutputMessage output) {
        if(output == null){
            throw new IllegalArgumentException("Must have an object");
        }
        this.output = output;
    }
    
    public final void outputMessage(String message){
        output.outputMessage(message);
    }
}
