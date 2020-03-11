package com.test;

public class Sample2 extends Sample{



	@Override
	public void face1() {
		
	System.out.println("kash");	
	}

	@Override
	public void face() {
		System.out.println("boss");
		
	}
	public static void main(String[] args) {
		Sample2 s=new Sample2();
		s.face();
		s.face1();
	}
}