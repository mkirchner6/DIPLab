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
    private MessageInput input;
    private MessageOutput output;

    public MessageService(MessageInput input, MessageOutput output) {
        this.setInput(input);
        this.setOutput(output);
    }

    public final MessageInput getInput() {
        return input;
    }

    public final void setInput(MessageInput input) {
        if(input == null){
            throw new IllegalArgumentException("Must have an object");
        }
        this.input = input;
    }

    public final MessageOutput getOutput() {
        return output;
    }

    public final void setOutput(MessageOutput output) {
        if(output == null){
            throw new IllegalArgumentException("Must have an object");
        }
        this.output = output;
    }
    
    public final void getAndDisplayMessage(){
        output.outputMessage(input.getMessage());
    }
}
