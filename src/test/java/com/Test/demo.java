package com.Test;

import org.testng.Assert;

public class demo {

	public static void assertEqual(boolean actual) {
		System.out.println("Expected [true] : found [" + actual + "]");
		Assert.assertTrue(actual);

	}

	public static void main(String[] args) {

		String a = "Processor: 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]\r\n" + "RAM: 4GB [+$20.00]\r\n"
				+ "HDD: 400 GB [+$100.00]\r\n" + "OS: Vista Home [+$50.00]\r\n"
				+ "Software: Microsoft Office [+$50.00]";

		String b = "Processor: 2.5 GHz Intel";

		boolean contains = a.contains(b);

//		Assert.assertTrue(contains);
////
		assertEqual(contains);
	}

}
