/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidgrew.euler.challenges;

/**
 *
 * @author davidgrew
 */
public class Euler2 {
    
    private int sum;
    
    public Euler2() {
        
    int firstNum = 1, secondNum = 2, temp = 0;
        
        while (secondNum < 4000000) {
            if(secondNum % 2 == 0)
                this.sum += secondNum;
            
            temp = secondNum;
            secondNum = (firstNum + secondNum);
            firstNum = temp;
        }
    }
    
    public int getSum() {
        return this.sum;
    }
    
}
