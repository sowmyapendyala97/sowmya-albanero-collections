package com.learning.multithreading;

public class Table {

	synchronized void printTable(int n) {

		for (int i = 0; i < n; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
