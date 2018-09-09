package com.org;

import java.util.Arrays;

public class DeepCopyClass {
	private int[] data;

	// altered to make a deep copy of values
	public DeepCopyClass(int[] values) {
		data = new int[values.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = values[i];
		}
	}

	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}
