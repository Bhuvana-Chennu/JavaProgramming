package Daay10;

public class Viswanadh {

	
		public static void main(String[] args) {
			int ages[] = { 10, 20, 30, 40 };

			// Initialize the minimum and maximum age with the first element of the array
			int maxAge = ages[0];
			int minAge = ages[0];

			// Iterate through the array to find the minimum and maximum age
			for (int age : ages) {
				if (age > maxAge) {
					maxAge = age;

				}

				if (age < minAge) {
					minAge = age;
				}

			}

			// Print the minimum and maximum age

			System.out.println("The highest age is: " + maxAge);
			System.out.println("The lowest age is: " + minAge);
		}

	}

	