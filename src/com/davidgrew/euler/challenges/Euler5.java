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
public class Euler5 {
    
    private int smallestNumber;
    
    public Euler5() {
    
        int count = 1;

        do {
            for (int i = 1; i < 21; i++) {
                if (count % i != 0) {
                    count++;
                    break;
                }
                else if (i == 20 && count % i == 0)
                    this.smallestNumber = count;
            }
        } while (this.smallestNumber == 0);
    }
    
    public int getSmallestNumber() {
        return this.smallestNumber;
    }
}
