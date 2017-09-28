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
public class InputService {
    private InputMessage input;

    public InputService(InputMessage input) {
        this.setInput(input);
    }

    public final InputMessage getInput() {
        return input;
    }

    public final void setInput(InputMessage input) {
        if(input == null){
            throw new IllegalArgumentException("Must have an object");
        }
        this.input = input;
    }
    
    public final String getMessage(){
        return input.getMessage();
    }
}
