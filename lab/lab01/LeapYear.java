/** Class that determines whether or not a year is a leap year.
 *  @author YOUR NAME HERE
 */
public class LeapYear {

    /** Calls isLeapYear to print correct statement.
     *  @param  year to be analyzed
     */
    private static boolean checkLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    /** Must be provided an integer as a command line argument ARGS. */
    public static void main(String[] args) {
        if (checkLeapYear(Integer.parseInt(args[0]))) {
            System.out.println(args[0] + " is a leap year.");
        }else{
            System.out.println(args[0] + " is not a leap year.");
        }
    }
}