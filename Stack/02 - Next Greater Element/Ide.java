/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void nextGreaterRight(int[] arr){
        Stack<Integer> st = new Stack<>();
        
        st.push(arr[arr.length - 1]);
        
        for(int j = arr.length - 1; j >= 0; j--){
            
            while(!st.empty() && arr[j] >= st.peek()){
                st.pop();
            }
            
            if(!st.empty()){
                System.out.println("Next greater element is " + st.peek());
            } else{
                System.out.println("Next greater element is -1");
            }
            
            st.push(arr[j]);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
		int size = scn.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++){
		    arr[i] = scn.nextInt();
		}
		
		nextGreaterRight(arr);
	}
}
