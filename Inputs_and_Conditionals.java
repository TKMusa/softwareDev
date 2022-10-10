import java.util.Scanner;

public class Inputs_and_Conditionals {
    public static void main(String[] args) {

        //Input Object - checks for new inputs - assagins values - only need one
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        Integer num1 = input.nextInt();

        System.out.print("Enter another number: ");
        Integer num2 = input.nextInt();

        Integer sum = num1 + num2;

        //print format
        System.out.println(sum);
        System.out.printf("The sum of %d + %d is: %d%n", num1, num2, sum);


        //If Else, Conditionals
        if (num1 > num2)
            System.out.printf("%d > %d%n", num1, num2);

        else if (num1 < num2)
            System.out.printf("%d > %d%n", num2, num1);
        
        else
            System.out.printf("%d == %d%n", num1, num2);
        
        //Boolean True False Shortcut
        System.out.println(num1 == num2 ? "The numbers are eqaul" : "The numbers are unequal");


    
    }
}

