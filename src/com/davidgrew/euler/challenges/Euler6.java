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
public class Euler6 {
    
    private int difference;
    
    public Euler6() {
        
        int sumOfSquares = 0, squareOfSums = 0;
        
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += (i * i);
            squareOfSums += i;
        }
        
        squareOfSums *= squareOfSums;
        
        this.difference = squareOfSums - sumOfSquares;
    }
    
    public int getDifference() {
        return this.difference;
    }
    
}
