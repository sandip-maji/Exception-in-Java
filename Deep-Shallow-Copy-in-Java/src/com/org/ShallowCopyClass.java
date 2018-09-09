package com.org;

import java.util.Arrays;

public class ShallowCopyClass {
	private int[] data;

	// makes a shallow copy of values
	public ShallowCopyClass(int[] values) { 
	        data = values; 
	    }

	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}
