import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;
        char userchar = ' ';
        String userstr = " ";

        // TODO Define char and string variables similarly

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();
        System.out.println("Enter character:");
        userchar = scnr.next().charAt(0);
        System.out.println("Enter string:");
        userstr = scnr.next();

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space
        System.out.println(userInt+" "+ userDouble+ " "+ userchar+ " "+ userstr);

        // TODO (2): Output the four values in reverse
        System.out.println(userstr+" "+ userchar+ " "+ userDouble+ " "+ userInt);

        // TODO (3): Cast the double to an integer, and output that integer
        int newint = (int)userDouble;
        System.out.println(userDouble +" cast to an integer is "+ newint);

    }
}