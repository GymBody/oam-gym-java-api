package com.gym.tracker.service;

public class BMICalculator {
	
	
	/**
	 * @author ahmed82
	 * @param weight
	 * @param height
	 */
	//TODO Create object to be propagated to the UI
	public static void BMIcalculate(double weight, double height) {

		System.out.print("Your weight in kilograms: " + weight);

		System.out.print("Your height in meters: " + height);

		double bmi = calculateBMI(weight, height);
		System.out.printf("Your BMI is: %.2f\n", bmi);

		System.out.println("BMI Category: " + getBMICategory(bmi));

	}

	/**
	 * 
	 * @author ahmed82
	 * @param weight
	 * @param height
	 * @return BMI
	 */
	private static double calculateBMI(double weight, double height) {
		return weight / (height * height);
	}

	/**
	 * 
	 * @author ahmed82
	 * @param bmi
	 * @return BMICategory
	 */
	private static String getBMICategory(double bmi) {
		if (bmi < 18.5) {
			return "Underweight";
		} else if (bmi < 25) {
			return "Normal weight";
		} else if (bmi < 30) {
			return "Overweight";
		} else {
			return "Obese";
		}
	}
}