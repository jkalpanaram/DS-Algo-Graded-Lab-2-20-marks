
package Driver;

import java.util.Scanner;

import CurrencyDenominations.CurrencyPayment.CurrencyPayment;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of currency denominations: ");
		int numDenominations = scanner.nextInt();
		int[] denominations = new int[numDenominations];

		System.out.println("Enter the currency denominations value:");
		for (int i = 0; i < numDenominations; i++) {
			denominations[i] = scanner.nextInt();
		}

		System.out.print("Enter the amount you want to pay: ");
		int amount = scanner.nextInt();

		@SuppressWarnings("unused")
		CurrencyPayment currencyPayment = new CurrencyPayment();
		CurrencyPayment.mergeSort(denominations, 0, denominations.length - 1);

		System.out.println("\nYour payment approach in order to give the minimum number of notes will be:");
		int remainingAmount = amount;
		for (int i = denominations.length - 1; i >= 0; i--) {
			int denomination = denominations[i];
			int count = remainingAmount / denomination;
			if (count > 0) {
				System.out.println(denomination + ":" + count);
				remainingAmount %= denomination;
			}
		}

		scanner.close();
	}
} 
