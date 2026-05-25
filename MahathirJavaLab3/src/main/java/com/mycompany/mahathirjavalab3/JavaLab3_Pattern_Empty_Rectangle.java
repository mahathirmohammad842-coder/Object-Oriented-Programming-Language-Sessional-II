/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mahathirjavalab3;

/**
 *
 * @author mahat
 */
public class JavaLab3_Pattern_Empty_Rectangle {

    public static void main(String[] args) {
        int n=5, m=4, i,j;
        for( i=1; i<=n; i++){
            
            for( j=1; j<=m; j++){
            if(i==1 || j==1 || i==n || j==m ){
                 System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
        System.out.print("\n");
        } 
             
    }
}
