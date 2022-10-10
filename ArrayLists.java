import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        //New arraylist - must specify type of items
        ArrayList<String> colours = new ArrayList<String>();
        System.out.println(colours);

        colours.add("Red");
        colours.add(0, "Blue");
        colours.add(1, "Yellow");
        System.out.println(colours);

        //looping
        for (String colour: colours) {
            System.out.println(colour);
        }
        
        //Size command
        System.out.println(colours.size());
        
        //get command
        System.out.println(colours.get(1));

        //contains command - boolan repsonse used in short hand boolan
        System.out.printf("Red is %sin the list%n", colours.contains("Red") ? "": "not ");

        //indexOf - reverse get
        System.out.println(colours.indexOf("Red"));

        //trimToSize - reduces cpacity to current elements - not too sure
        //colours.trimToSize(); 


        //remove command
        colours.remove("Yellow");
        colours.remove(1);
        System.out.println(colours);
    }
}