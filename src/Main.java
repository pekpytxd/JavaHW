import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // There I call all my classes
        NaturalNumN.NumN a = new NaturalNumN.NumN();
        System.out.println("First Class!");

        a.enter_N();
        a.show_3_in_powN();
        a.show_reversed();
        a.show_replaced();
        a.show_with_ones();

        System.out.println();
        System.out.println("Second Class!");
        BrickAndHole.BrickInHole b = new BrickAndHole.BrickInHole();
        b.input_values();
        b.show_res();

        System.out.println();
        System.out.println("Third Class!");
        ConsoleApplication.Task1 c = new ConsoleApplication.Task1();
        c.enterR();
        c.display_result();

        System.out.println();

        ConsoleApplication.Task2 d = new ConsoleApplication.Task2();
        d.enter_strings();
        d.display_name_address();

        System.out.println();

        ConsoleApplication.Task3 e = new ConsoleApplication.Task3();
        e.enter_values();
        e.calculate_and_display();
    }
}
