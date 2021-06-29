/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraybegnnier;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Array {
    public static void main(String args[]){
    Scanner My_scanner=new Scanner(System.in);
    
    int[][] User_input=new int[2][3];
    System.out.print("Please Input a value:");
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
           User_input[i][j]=My_scanner.nextInt();
        }
        
    }
     
     for(int i=0;i<2;i++){
         for(int j=0;j<3;j++){
             System.out.print(" "+User_input[i][j]);
         }
         System.out.println(" ");
     }
        System.out.println(" ");
    
    }
}
