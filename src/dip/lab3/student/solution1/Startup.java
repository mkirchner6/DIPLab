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
public class Startup {
    MessageInput input = new MessageInputFromConsole();
    MessageOutput output = new MessageOutputToConsole();
    
    MessageService messageService = new MessageService(input, output);
    
    messageService.getAndDisplayMessage();
}
