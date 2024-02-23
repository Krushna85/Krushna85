package com.Test;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		int[] arr = { 58, 35, 85, 68, 28 };
		int a = 10;
		System.out.println(a / 5);

		try {
			System.out.println(arr[5]);
			System.out.println(arr[6]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds!");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ArithmeticException ex) {
			System.out.println("Arithmatic exception");
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		System.out.println(arr[3]);
		System.out.println(arr[1]);
		System.out.println(arr[4]);
		System.out.println(a / 2);

	}

}
