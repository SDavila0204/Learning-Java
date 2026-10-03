package codingProjects;
import java.util.Scanner;

public class ProjectOne {
//initializes calories consumed and calories burned
   static int day1CalConsumed, day1CalBurned;
   static int day2CalConsumed, day2CalBurned;
   static int day3CalConsumed, day3CalBurned;
   static int day4CalConsumed, day4CalBurned;
   static int day5CalConsumed, day5CalBurned;
   static int day6CalConsumed, day6CalBurned;
   static int day7CalConsumed, day7CalBurned;

    //allows for access across methods
    private static double netWeeklyPounds;
    private static int totalCaloriesConsumed;
    private static int totalCaloriesBurned;
    private static double averageCaloriesConsumed;
    private static double averageCaloriesBurned;

    public static void main(String[] args) {
        getUserInput(); //calls netWeeklyPounds
        calculateCalories(); //calls totalCaloriesConsumed
        displayCalories(netWeeklyPounds, totalCaloriesConsumed, totalCaloriesBurned, averageCaloriesBurned, averageCaloriesConsumed); // calls totalCaloriesBurned

        }
        public static void getUserInput () { // asks user about their cals consumed and burned and lets user answer
            Scanner scnr = new Scanner(System.in); // lets user input info

            //prints out how many calories are consumed and burned each day
            System.out.print("How many calories did you consume on day 1? ");
            day1CalConsumed = scnr.nextInt();
            System.out.print("How many calories did you burn on day 1? ");
            day1CalBurned = scnr.nextInt();

            System.out.print("How many calories did you consume on day 2? ");
            day2CalConsumed = scnr.nextInt();
            System.out.print("How many calories did you burn on day 2? ");
            day2CalBurned = scnr.nextInt();

            System.out.print("How many calories did you consume on day 3? ");
            day3CalConsumed = scnr.nextInt();
            System.out.print("How many calories did you burn on day 3? ");
            day3CalBurned = scnr.nextInt();

            System.out.print("How many calories did you consume on day 4? ");
            day4CalConsumed = scnr.nextInt();
            System.out.print("How many calories did you burn on day 4? ");
            day4CalBurned = scnr.nextInt();

            System.out.print("How many calories did you consume on day 5? ");
            day5CalConsumed = scnr.nextInt();
            System.out.print("How many calories did you burn on day 5? ");
            day5CalBurned = scnr.nextInt();

            System.out.print("How many calories did you consume on day 6? ");
            day6CalConsumed = scnr.nextInt();
            System.out.print("How many calories did you burn n day 6? ");
            day6CalBurned = scnr.nextInt();

            System.out.print("How many calories did you consume on day 7? ");
            day7CalConsumed = scnr.nextInt();
            System.out.print("How many calories did you consume on day 7? ");
            day7CalBurned = scnr.nextInt();
        }

        public static void calculateCalories() { // does calculations with info from getUserInput
            //calculates the calories consumed
            totalCaloriesConsumed = day1CalConsumed + day2CalConsumed + day3CalConsumed + day4CalConsumed + day5CalConsumed + day6CalConsumed + day7CalConsumed;

            //calculates calories burned
            totalCaloriesBurned = day1CalBurned + day2CalBurned + day3CalBurned + day4CalBurned + day5CalBurned + day6CalBurned + day7CalBurned;

            //calculates average calories consumed
            averageCaloriesConsumed = (double) (totalCaloriesConsumed) / 7;

            //calculates average calories burned
            averageCaloriesBurned = (double) (totalCaloriesBurned) / 7;

            //uses calories burned and calories consumed to calculate the net weekly pounds
            netWeeklyPounds = (double) (totalCaloriesConsumed - totalCaloriesBurned) / (3000.0);

        }

        public static void displayCalories (double netWeeklyPounds, double totalCaloriesConsumed, double totalCaloriesBurned, double averageCaloriesConsumed, double averageCaloriesBurned) {
            //prints out each of the results
            System.out.println();
            System.out.printf("total calories consumed this week: %.2f\n", totalCaloriesConsumed);
            System.out.println();
            System.out.printf("total calories burned this week: %.2f\n", totalCaloriesBurned);
            System.out.println();
            System.out.printf("net weekly pounds gained/lost: %.3f\n", netWeeklyPounds);
            System.out.println();
            System.out.printf("average calories burned a day: %.2f\n", averageCaloriesBurned);
            System.out.println();
            System.out.printf("average calories consumed a day: %.2f\n", averageCaloriesConsumed);

        }

}
