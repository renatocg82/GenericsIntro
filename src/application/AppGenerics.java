package application;

import java.util.Scanner;

import services.PrintService;

public class AppGenerics {

	public static void main(String[] args) {

		Scanner scString = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		ps.addValue("Maria");

		for (int i = 0; i < n; i = i + 1) {
			String value = scString.nextLine();
			ps.addValue(value);
		}

		ps.print();
		String x = ps.first();
		System.out.print("First: " + x);

		sc.close();
		scString.close();
	}

}
