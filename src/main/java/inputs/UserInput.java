/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputs;

import java.util.Scanner;

/**
 *
 * @author grand
 */
public class UserInput {
    
    
    public String getName(){
        Scanner input = new Scanner(System.in);
        String name = input.next();
        return "Hello" + name + "!";
    }
    
    
}
