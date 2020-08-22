/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void subarrays(int[] arr){
        
        // Loop to start subarray from each digit seperately
        for(int i =0; i < arr.length; i++){
            
            // Loop to start from the digit whose subarray is to be printed
            for(int j = i; j < arr.length; j++){
                
                // Loop to print all the subarrays
                for(int k = i; k <=j  ; k++){
                    System.out.print(arr[k]);
                    System.out.print("\t");
                }
                
            // Line break for new subarray
            System.out.println();
            }
            
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
        // Input array
		 int size = scn.nextInt();
		 int[] arr = new int[size];
		 
		 for(int i = 0; i < size; i++){
		     arr[i] = scn.nextInt();
		 }
		 
        // Solution function		 
		 subarrays(arr);
	}
}
