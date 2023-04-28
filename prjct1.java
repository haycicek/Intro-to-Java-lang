/* 
Chapter 1 Exercise 12

AVERAGE SPEED.
(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a program that displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)

INPUT and PROMPTS. None.
OUTPUT. The output should be a single number as seen below.
CLASS NAMES. Your program class should be called AvgSpeed
*/
public class AvgSpeed {
	public static void main(String[] strings) {

        // Making variables to hold current time and distance
        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double distanceInMiles = 24;

        // Converting from miles to kilometers
        // Note: the book said 1.6, however 1.60934 is more accurate
        double distanceInKilometers = distanceInMiles * 1.6;

        // Converting current time (hour, minutes, seconds) into total amount of minutes
        double timeInMinutes = hours * 60.0 + minutes + seconds / 60.0;

        // Calculating kilometers per hour
        // kph = 60 * distance traveled / minutes taken
        double kilometersPerHour = 60.0 * distanceInKilometers / timeInMinutes;

        System.out.println(kilometersPerHour);

    }
}