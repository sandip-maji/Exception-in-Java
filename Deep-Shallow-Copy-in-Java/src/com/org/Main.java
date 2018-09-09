package com.org;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("**********Shallow Copy **********");
		int[] vals1 = { 3, 7, 9 };
		ShallowCopyClass shallowCopyClass = new ShallowCopyClass(vals1);
		shallowCopyClass.showData(); // prints out [3, 7, 9]
		vals1[0] = 13;
		shallowCopyClass.showData(); // prints out [13, 7, 9]
		
		 // Very confusing, because we didn't 
        // intentionally change anything about  
        // the object e refers to.
		
		System.out.println("**********Deep Copy **********");
		int[] vals2 = {3, 7, 9}; 
		DeepCopyClass deepCopyClass = new DeepCopyClass(vals2); 
		deepCopyClass.showData(); // prints out [3, 7, 9] 
		vals2[0] = 13; 
        deepCopyClass.showData(); // prints out [3, 7, 9] 
  
       // changes in array values will not be  
       // shown in data values.  
		
		

	}

}
