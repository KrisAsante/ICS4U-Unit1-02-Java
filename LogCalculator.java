/****************************************************************************
 *
 * Created by: Chris Asante
 * Date : March 2020
 * Created for : ICS4U
 * Calculates the number of logs the truck can carry
 *
 ****************************************************************************/

import java.util.Scanner

public class LogCalculator {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in)
		
		int truckTotalCapacity
		int logWeight
                double singleLogWeight   
		double numberOfLogs
		double logLength
		
		truckTotalCapacity = 1100
                logWeight = 20
		
		System.out.print("Enter log size in metres (options: 0.25, 0.5, 1): ")
 
		logLength = userInput.nextDouble()
		
		singleLogWeight = logLength * logWeight
		
		numberOfLogs = truckTotalCapacity/singleLogWeight
		
		System.out.print("The truck can carry " + numberOfLogs + " logs of " + logLength + "m.\n")
		
	}

}