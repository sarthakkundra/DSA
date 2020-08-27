/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void stockSpan(int[] arr){
        
        Stack<Integer> st = new Stack<>();
        
        st.push(0);
        
        for(int i = 0; i < arr.length; i++){
            
            while(!st.empty() && arr[i] > arr[st.peek()]){
                st.pop();
            }
            if(st.empty()){
                System.out.println("Span for " + arr[i] + " is " + i);    
            } else {
                System.out.println("Span for " + arr[i] + " is " + (i - st.peek()));    
            }
            
            st.push(i);
        }
        

    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
		    arr[i] = scn.nextInt();    
		}
		
		stockSpan(arr);
	}
}
