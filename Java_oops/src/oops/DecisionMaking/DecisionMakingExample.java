package oops.DecisionMaking;

import java.util.Scanner;

public class DecisionMakingExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input marks
		System.out.print("Enter your marks (0-100): ");
		int marks = sc.nextInt();

		// 1. Simple if
		if (marks == 100) {
			System.out.println("Perfect score!");
		}

		// 2. if-else
		if (marks >= 40) {
			System.out.println("You passed!");
		} else {
			System.out.println("You failed.");
		}

		// 3. if-else-if ladder
		if (marks >= 90) {
			System.out.println("Grade: A+");
		} else if (marks >= 75) {
			System.out.println("Grade: A");
		} else if (marks >= 60) {
			System.out.println("Grade: B");
		} else if (marks >= 40) {
			System.out.println("Grade: C");
		} else {
			System.out.println("Grade: F");
		}

		// 4. Nested if
		if (marks >= 40) {
			if (marks >= 90) {
				System.out.println("Excellent!");
			} else {
				System.out.println("Good effort!");
			}
		}

		// 5. switch case example
		System.out.print("Enter day number (1-7): ");
		int day = sc.nextInt();

		System.out.println("Switch Statement Output:");
		switch (day) {
		case 1:
			System.out.println("It's Monday");
			break;
		case 2:
			System.out.println("It's Tuesday");
			break;
		case 3:
			System.out.println("It's Wednesday");
			break;
		case 4:
			System.out.println("It's Thursday");
			break;
		case 5:
			System.out.println("It's Friday");
			break;
		case 6:
			System.out.println("It's Saturday");
			break;
		case 7:
			System.out.println("It's Sunday");
			break;
		default:
			System.out.println("Invalid day!");
		}

		sc.close();
	}
}
