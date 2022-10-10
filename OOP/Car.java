public class Car{

    public String mot = "passed!";
    public String name;

    public Car(name){
        //Constructors have the same name as the class
        //Can omit a constructor - program uses basic one - set up no instance attributes
        this.name = name;
    }


    //method for the car class to use
    public void sayVroom(){
        System.out.println("Vroom Vroom");
    }

    public static void main(String[] args) {
        String text = "Fiat Punto";

        Car car1 = new Car(text);
        car1.sayVroom();
        System.out.println(car1.mot);

    }

}