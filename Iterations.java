import java.util.Scanner;

public class Iterations {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //Not an object - no capital - smaller primitive
        int num1 = 1;
        int num2 = 10;

        //While loop - checks statement before running
    
        //Can be done without brackets but for only 1 line
        while (num1 <= num2){
            System.out.printf("%d * 2 = %d%n", num1, (num1+num1));
            num1 += num1;
        }
        System.out.printf("Result: %d%n%n", num1);

        num1 = 0;

        System.out.print("Enter a number to multiply: ");
        int multi = input.nextInt();

        System.out.print("Enter a number to keep looping until: ");
        int max = input.nextInt();

        while (num1 <= max){
            System.out.printf("%d%n", num1);
            num1 += multi;
        }
        System.out.printf("%n%n");        

        //for loop
        for (int counter = 1; counter <= 10; counter++)
            System.out.println(counter);


        //do while - runs once checks statement after running
        int counter = 0;

        do {
            System.out.printf("%d ", counter);
            counter++;    
        } while (counter <= 11);
        System.out.println("");

        //Switch statement - select one of many coding blocks

        System.out.print("Select a number 1-7: ");
        int day = input.nextInt();
        String text;

        //breaks away after every tag
        switch (day) {
            case 1:
                text = "Monday";
                break;
            case 2:
                text = "Tuesday";
                break;
            case 3: 
                text = "Wednesday";
                break;
            case 4:
                text = "Thursday";
                break;
            case 5:
                text = "Friday";
                break;
            case 6:
                text = "Saterday";
                break;
            case 7:
                text = "Sunday";
                break;
            default:
                text = "Invalid Day";
        }
        System.out.printf("%d correlates to the day: %s%n", day, text);


        //will go through other tags since their is no break
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                text = "weekday";
                break;
            case 6:
            case 7:
                text = "weekend";
                break;
            default:
                text = "Invalid Day";
        }
        System.out.printf("%d correlates to a: %s%n", day, text);
    }

}