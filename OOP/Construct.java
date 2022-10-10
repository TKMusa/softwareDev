public class Construct{

    private String fName;
    private String lName;
    private int bYear;

    private static int count; //setting up static class variable - number of employees


    //public Construct(String first, String last, int year)
    public Construct(String fName, String lName, int bYear) {
        //constructors must have the same name as the class
        //constructors have no return
        //can overload to call them based on inputs

        this.fName = fName;
        this.lName = lName;
        this.bYear = bYear;

        Construct.count++;

        System.out.println("Constructed via base");
    }

    //overload constructor - can submit with other arguments
    public Construct(String fName, String lName) {
        //If this is used without .attribute in constructor - will recall constructor - must be first statement
        //Calling previous constructor - with subbed in null values
        this(fName, lName, 0000);
        System.out.println("Constructed via 2");
    }

    //Fed another object - use this to recall other constructor - with same values
    //Constructor calling another constructor is known as a "delegating constructor"
    public Construct(Construct copy){
        this(copy.fName, copy.lName, copy.bYear);
        System.out.println("Constructed via 3");
    }



    public void display() {
        System.out.printf("%s %s, DOB:%04d%n%n", this.fName, this.lName, this.bYear);
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args){
        //The new command call the constructor - if none provided, calls basic constructor
        Construct obj1 = new Construct("John", "Smith", 1998);
        obj1.display();

        Construct obj2 = new Construct("Adam", "West");
        obj2.display();

        Construct obj3 = new Construct(obj2);
        obj3.display();

        System.out.println(Construct.getCount());
    }

}