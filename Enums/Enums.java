import java.util.EnumSet;

public class Enums{

    //Setting up small enum
    public enum Compass {
        North, South, East, West
    }


    //Setting up large - enum
    public enum Day{
        //Declare constant enum type
        mu("Monday", "Mon", "Weekday", 1),
        tu("Tuesday", "Tues", "Weekday", 2),
        we("Wednesday", "Wed", "Weekday", 3),
        th("Thursday", "Thurs", "Weekday", 4),
        fr("Friday", "Fri", "Weekday", 5),
        sa("Saturday", "Sat", "Weekend", 6),
        su("Sunday", "Sun", "Weekend", 7);

        //Instance Fields
        //Final - variable that is immutable - must be initalized
        private final String name;
        private final String abbr;
        private final String type;
        private final int num;

        //enum constructor
        Day(String name, String abbr, String type, int num) {
            this.name = name;
            this.abbr = abbr;
            this.type = type;
            this.num = num;
        }
    
        //get
        public String getName() {
            return name;
        }
        public String getAbbr() {
            return abbr;
        }
        public String getType() {
            return type;
        }
        public int getNum() {
            return num;
        }
    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.printf("%s, %s, %s, %d%n", day.getName(), day.getAbbr(), day.getType(), day.getNum());
        }
        System.out.println();

        for (Compass dir: Compass.values()) {
            System.out.printf("%s ", dir);
        }
        System.out.println();


        //Enum Subsets - requires import java.util.EnumSet

        //Use EnumSet along with enums were using - give it a local name th
        EnumSet<Day> eSet;
        eSet = EnumSet.range(Day.we, Day.sa);

        System.out.println("Enum Set Contains :" + eSet);

    }



}