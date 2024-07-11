package com.greatlearning.coreJava;

public class PayMoneyTransactions {

	public static void findTransactions(int[] transaction, int target) {
		int cumulativeSum = 0;
		int transactionNumber = -1;
		for (int i = 0; i < transaction.length; i++) {
			cumulativeSum += transaction[i];
			if (cumulativeSum >= target) {
				transactionNumber = i + 1;
				break;
			}
		}
		if (transactionNumber == -1) {
			System.out.println("Traget is not achievable.");
		} else {
			System.out.println("Traget achieved after " + transactionNumber + " transaction");
			if (transactionNumber > 1) {
				System.out.println();
			}
			System.out.println("to reach the target amount of " + target + ".");
		}
	}
}
