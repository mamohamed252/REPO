/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

/**
 *
 * @author Mohamed
 */
public class TestReturn {
    public static void main(String[] args) {
        String FirstSen="Hello";
        System.out.println(FirstSen(FirstSen));
        
        int x = 8; 
        int y = 2;
        System.out.println(Addition(x, y));
    }
    
    public static String FirstSen(String myTest2){
        String addString =" World";
        String addStri =" Bye!";
        String newString = myTest2 + addString + addStri;
        return newString;
     
    }
    public static int Addition(int n, int p) {
        
        int sum = n / p;
        return sum;
    }
}
