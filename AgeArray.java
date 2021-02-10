package testquestions;

import java.util.Scanner;

public class AgeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of people : "); //// to get size of array
		int size = sc.nextInt();
		int age[] = new int[size];

		System.out.println("Enter ages of people : ");

		for (int j = 0; j < age.length; j++) // to get age of people one by one
		{
			age[j] = sc.nextInt();
		}

		int children = 0;
		int adult = 0;
		int seniorcitizen = 0;
		for (int i = 0; i < age.length; i++) { /* here, according to age comparison the count is increased */
			if (age[i] < 18) {
				children++;
			} else if (age[i] >= 18 && age[i] < 54) {
				adult++;
			} else if (age[i] >= 55) {
				seniorcitizen++;
			}
		}
		System.out.println("Children : " + children); // Count according to age displayed
		System.out.println("Adult : " + adult);
		System.out.println("Senior Citizens : " + seniorcitizen);

		sc.close();
	}

}
