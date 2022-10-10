
public class Arrays {
    public static void main(String[] args) {

        //Arrays are lists unchanging in size
        //Must define type of inputs for an array

        String[] days = {"Monday", "Tuesday", "Wednesday","Thursday","Friday","Saterday","Sunday"};

        //days is now a 7 long list - cannot add to size - can change elements
        //can define array length without elements

        String[] daytype = new String[2];
        daytype[0] = "Weekday";
        daytype[1] = "Weekend";

        
        System.out.println(days[3]);
        System.out.printf("%s%n%n",daytype[0]);

        //looping through an array
        for (int counter = 0; counter < days.length; counter++) {
            System.out.printf("%s ", days[counter]);
        }
        System.out.printf("%n");

        //for loop through each item

        for (String i: days) {
            System.out.printf("%s ", i);

        } 
        System.out.printf("%n");

        //Multidimensional Arrays

        int[][] array1 = {{1,2,3}, {4,5}, {6, 7, 8, 9}};
        String[][] array2 = new String[7][2];

        for (int row = 0; row < array1.length; row++) {
            for (int column = 0; column < array1[row].length; column++) {
                System.out.printf("%d ", array1[row][column]);
            }
            System.out.printf("%n");
        }
 
        //Traversing Throught items in 2D array - Shortcut

        for (int[] row: array1) {
            for (int elem: row)  {
                System.out.printf("%d ", elem);
            }
            System.out.printf("%n");

        }

        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter][0] = days[counter];
            if (counter < 5)
              array2[counter][1] = daytype[0];
            else
                array2[counter][1] = daytype[1];
        }

        for (String[] day: array2) {
            System.out.printf("%s : %s, ", day[0], day[1]);
        }
        System.out.printf("%n");
    }
}
