package com.array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Reading_And_Printing {

	// this method print Array value using for loop
	public static void usingForLoop(int arr[]) {
		System.out.println("============Using For Loop==========");

		if (arr == null) {
			System.err.println("Error...Array object is Null");
		}
		else
			for (int i = 0; i < arr.length; i++) {

				System.out.print(arr[i] + " ");
			}
		System.out.println();

	}

	// this method print Array value using for eachloop
	public static void usingForEachLoop(int arr[]) {

		System.out.println("============Using For Each Loop============");
		for (int store : arr) {
			System.out.print(store + " ");
		}
		System.out.println();
	}

	// this method print Array value using array ToString
	public static void usingArraysToString(int arr[]) {
		System.out.println("============Using For Arrays.toString() ============");

		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Size of Array :");

			int size = sc.nextInt();

			if (size < 0) {
				System.err.println("Error...Negative size");
			} else {
//				 Array Construction
				int arr[] = new int[size];

				if (size == 0) {
					System.err.println("Error...Array size is 0");
				} else {
					System.out.println("Enter " + size + " elements :");
					for (int i = 0; i < arr.length; i++) {
						System.out.println("Enter element at index " + i + " :");
						arr[i] = sc.nextInt();
					}
					usingForLoop(null);
					usingForEachLoop(arr);
					usingArraysToString(arr);
				}

			}
			sc.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
		

	}
}
