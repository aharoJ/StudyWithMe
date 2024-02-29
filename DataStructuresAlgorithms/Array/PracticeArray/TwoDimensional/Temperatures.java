package Array.PracticeArray.TwoDimensional;

/*
 * Find the Avg. temperature for each day.
 * Determine the day with the Highest average temperature.
 * Find the Maximum temperature recorded in the entire Dataset.
 * Determine the time slot (hour) with the highest average temperature across all days.
 */
public class Temperatures 
{
    public static void analyzeTemperatures(int[][] temperatures) 
    {
        double max_avg_temp = Integer.MIN_VALUE; // To store the highest average temperature
        int max_temp = Integer.MIN_VALUE; // To store the highest temperature
        int dayWithHighestAvgTemp = -1; // To store the day with the highest average temp
        double[] hourlyAverages = new double[24]; // To store average temperatures for each hour across all days
        
        // Calculate average temperature for each day, find max temperature and max average temperature
        for (int i = 0; i < temperatures.length; i++) 
        {
            int sum = 0; // Sum of temperatures for the current day
            for (int j = 0; j < temperatures[i].length; j++) 
            {
                sum += temperatures[i][j];
                max_temp = Math.max(max_temp, temperatures[i][j]); // Update max temperature if current temp is higher
                hourlyAverages[j] += temperatures[i][j]; // Add current temperature to the respective hour's total
            }

            double average = sum / 24.0; // Calculate average temperature for the day
            System.out.println("Day " + (i+1) + " Average Temperature: " + average);
            if (average > max_avg_temp) { // Update max average temperature and day index if current average is higher
                max_avg_temp = average;
                dayWithHighestAvgTemp = i;
            }
        }
        
        // Calculate hourly average temperatures across all days
        int highestAvgTempHour = 0;
        double maxHourlyAvg = Integer.MIN_VALUE;
        for (int i = 0; i < hourlyAverages.length; i++) {
            hourlyAverages[i] /= 7.0; // Calculate average for each hour
            if (hourlyAverages[i] > maxHourlyAvg) { // Find the hour with the highest average temperature
                maxHourlyAvg = hourlyAverages[i];
                highestAvgTempHour = i;
            }
        }
        
        // Print results
        System.out.println("Highest Temperature Recorded: " + max_temp);
        System.out.println("Day with the Highest Average Temperature: Day " + (dayWithHighestAvgTemp+1));
        System.out.println("Time Slot with the Highest Average Temperature: Hour " + highestAvgTempHour);
    }

    public static void main(String[] args) 
    {   
        int[][] temperatures = {
            {30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53},
            {28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51},
            {27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
            {26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49},
            {25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48},
            {24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47},
            {23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46}
        }; 
    }
}
