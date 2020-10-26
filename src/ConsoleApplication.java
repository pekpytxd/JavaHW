import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math.*;

public class ConsoleApplication {


    static class Task1 {
        public double r;

        public Task1(int r) {
            this.r = r;
        }

        public Task1(double r) {
            this.r = r;
        }

        public Task1() {

        }

        public void enterR() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter radius of bed : ");
            String Sr = reader.readLine();
            this.r = Double.parseDouble(Sr);
        }

        public void display_result() {
            System.out.println(("The perimeter of Flower Bed is: " + 2 * Math.PI * r +
                    "\nThe area of flower bed is: " + Math.PI * (r * r)));
        }
    }

    static class Task2 {
        public String name, address;

        public void enter_strings() throws IOException {
            System.out.println("What is your name?");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            this.name = reader.readLine();
            System.out.println("Where are you live, " + name + '?');
            this.address = reader.readLine();
        }

        public void display_name_address() {
            System.out.println("Your name is " + name + "\nYour address is " + address);
        }
    }

    static class Task3 {


        public double c1, c2, c3, t1, t2, t3;

        public Task3() {

        }

        public Task3(int c1, int c2, int c3, int t1, int t2, int t3) {
        }

        public Task3(double c1, double c2, double c3, double t1, double t2, double t3) {

        }

        public void enter_values() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter 3 countries(units per minute): ");
            String Sc1 = reader.readLine();
            String Sc2 = reader.readLine();
            String Sc3 = reader.readLine();
            this.c1 = Double.parseDouble(Sc1);
            this.c2 = Double.parseDouble(Sc2);
            this.c3 = Double.parseDouble(Sc3);

            System.out.println("Enter how many minutes every country spoke: ");
            String St1 = reader.readLine();
            String St2 = reader.readLine();
            String St3 = reader.readLine();
            this.t1 = Double.parseDouble(St1);
            this.t2 = Double.parseDouble(St2);
            this.t3 = Double.parseDouble(St3);
        }

        void calculate_and_display() {
            System.out.println((c1 * t1) + (c2 * t2) + (c3 * t3));
        }
    }

}