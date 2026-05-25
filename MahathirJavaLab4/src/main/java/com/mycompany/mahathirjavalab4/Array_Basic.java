/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mahathirjavalab4;
import java.util.Scanner;

/**
 *
 * @author mahat
 */
public class Array_Basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Array Size :");
//          int S = sc.nextInt();
//          int[] A =  new int[S];
//for(int i=0; i<3; i++){   
//    int M = sc.nextInt();  
//    A[i]=M;
//}
//for(int i=0; i<3; i++){   
//    System.out.println(A[i]);
//}

//      A[0]=10;
//      A[1]=20;
//      A[2]=30;
//     System.out.println(A[1]);
//
//    int sum=0;
//
//    for(int i=0; i<S; i++){   
//        int M = sc.nextInt();  
//        A[i]=M;
//    }
//    for(int i=0; i<S; i++){  
//        sum =sum + A[i];
//    } 
//System.out.println("Sum is : " + sum);
//int avg = sum/S;
//System.out.println("Avg is : " + avg);
//int min=100; int max=-100;
//
//for(int i =0; i<S; i++){
//    if(max<A[i]){
//        max = A[i];}
//    else if(min>A[i]){
//      min = A[i];
//                }
//    }
//
//        System.out.println("Max :"+max);
//        System.out.println("Min :"+min);
//


int [][] A = new int [5][5];
for(int i=0; i<2; i++){
    for(int j=0; j<2; j++){
        
        A[i][j]= sc.nextInt();
    }
}
for(int i=0; i<2; i++){
    for(int j=0; j<2; j++){
        System.out.print(A[i][j]+" ");
    }
    System.out.println();
}


 }

}



