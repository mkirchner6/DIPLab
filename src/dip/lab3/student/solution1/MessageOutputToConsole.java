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
public class MessageOutputToConsole implements MessageOutput{
    @Override
    public final void outputMessage(String message){
        System.out.println(message);
    }
}
