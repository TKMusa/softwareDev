import java.util.Scanner;

public class Fruit {

    //Instance Var - every obj has one
    //Private - Requires get and set methods - more secure for attributes
    private String type;
    private int year;
    private String mounth;

    //Set method - 1 parameter, void return
    public void setType(String type) {
        //always use .this - not nessicary but helpful if you change var name and want to still use attributes
        this.type = type;
    }

    //Set method with multiple inputs
    public void setAge(int year, String mounth) {
        this.year = year;
        this.mounth = mounth;
    }

    //Get method - No parameter, String return
    public String getType() {
        return type;
    }

    public void display() {
        System.out.printf("These %s were picked in %s %d%n", this.type, this.mounth, this.year);
    }

    //Main line of the program
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.setType("Red Apples");
        apple.setAge(2018, "Oct");
        apple.display();

        Scanner input = new Scanner(System.in);
        Fruit fruit2 = new Fruit();
        System.out.printf("Enter a fruit you want: ");
        fruit2.setType(input.nextLine());

        System.out.printf("The fruit you wanted is: %s%n", fruit2.getType());

    }


}