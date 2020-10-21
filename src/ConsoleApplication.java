import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math.*;

public class ConsoleApplication {
    public static void main(String[] args) throws IOException {
        System.out.println("Task 1\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter radius of bed : ");
        String Sr = reader.readLine();
        double r = Double.parseDouble(Sr);
        System.out.println("The perimeter of Flower Bed is: " + 2 * Math.PI * r +
                "\nThe area of flower bed is: " + Math.PI * (r * r));

        System.out.println("Task 2\n");
        String name, address;
        System.out.println("What is your name?");
        name = reader.readLine();
        System.out.println("Where are you live, " + name + '?');
        address = reader.readLine();
        System.out.println("Your name is " + name + "\nYour address is " + address);

        System.out.println("Task 3\n");
        System.out.println("Enter 3 countries(units per minute): ");
        String Sc1 = reader.readLine();
        String Sc2 = reader.readLine();
        String Sc3 = reader.readLine();
        double c1 = Double.parseDouble(Sc1);
        double c2 = Double.parseDouble(Sc2);
        double c3 = Double.parseDouble(Sc3);

        System.out.println("Enter how many minutes every country spoke: ");
        String St1 = reader.readLine();
        String St2 = reader.readLine();
        String St3 = reader.readLine();
        double t1 = Double.parseDouble(St1);
        double t2 = Double.parseDouble(St2);
        double t3 = Double.parseDouble(St3);
        System.out.println((c1 * t1) + (c2 * t2) + (c3 * t3));


    }
}
