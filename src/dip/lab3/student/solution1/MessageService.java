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
public class MessageService {
    private InputService input;
    private OutputService output;

    public MessageService(InputService input, OutputService output) {
        this.setInput(input);
        this.setOutput(output);
    }

    public final InputService getInput() {
        return input;
    }

    public final void setInput(InputService input) {
        if(input == null){
            throw new IllegalArgumentException("Must have an object");
        }
        this.input = input;
    }

    public final OutputService getOutput() {
        return output;
    }

    public final void setOutput(OutputService output) {
        if(output == null){
            throw new IllegalArgumentException("Must have an object");
        }
        this.output = output;
    }
    
    public final void getAndDisplayMessage(){
        output.outputMessage(input.getMessage());
    }
}
