package com.org;

public class Main {

	public static void main(String[] args) {
		SingletonClass.getInstance().checkMe();
		
		SingletonClass obja = SingletonClass.getInstance();
		SingletonClass objb = SingletonClass.getInstance();
		
		if(obja.equals(objb)) {
			System.out.println("obja and objb both are same");
		}else {
			System.out.println("obja and objb both are Not same");
		}

	}

}
