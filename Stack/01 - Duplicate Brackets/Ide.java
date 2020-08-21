/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		
		Stack <Character> st = new Stack<>();
		
		for(int i = 0; i < str.length(); i++){
		    
		    if(str.charAt(i) == ')'){
		        while(!st.empty()){
		            char c = st.pop();
		            
		            if(c == '(') break;
		        }
		    }else{
		        st.push(str.charAt(i));    
		    }
		    
		}
		
		if(st.empty()){
		    System.out.println("false");    
		}
		
		else{
		    System.out.println("true");
		}
	}
}
