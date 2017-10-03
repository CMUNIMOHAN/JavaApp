package com.pg.java;

public class Sample {
	int a = 9;
	static int b = 10;

	public Sample() {
		System.out.println("This is Default constructor........!");
	}

	public Sample(int a) {
		System.out.println("This is Para Constructor........!");
	}

	public Sample(int a, int b) {
		System.out.println("This is Two  Para Constructor........!");
	}

	public static void display() {
		System.out.println("This is static display Method...........!!!!!");
	}

	public void show() {
		System.out.println("This is nos-static method..........!");
	}

	{
		System.out.println("instace block.....@@@@@@");
	}

	static {
		System.out.println("static block.....@@@@@@");
	}

	public static void main(String[] args) {
		System.out.println("This is main method..........!");
		Sample.display();
		Sample sample = new Sample();
		sample.show();
		
		{
			System.out.println("This instance block2......!");
		}

	}

}