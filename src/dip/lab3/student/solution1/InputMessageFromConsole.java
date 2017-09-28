/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.*;
/**
 *
 * @author mattkirchner
 */
public class InputMessageFromConsole implements InputMessage{
    public final String getMessage(){
        System.out.println("Enter your message");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
