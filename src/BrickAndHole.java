import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrickAndHole {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a, b, c");
        String Sa = reader.readLine();
        String Sb = reader.readLine();
        String Sc = reader.readLine();
        int a = Integer.parseInt(Sa);
        int b = Integer.parseInt(Sb);
        int c = Integer.parseInt(Sc);
        System.out.println("Enter x, y");
        String Sx = reader.readLine();
        String Sy = reader.readLine();
        int x = Integer.parseInt(Sx);
        int y = Integer.parseInt(Sy);
        if (((x >= a) && (y >= b)) || ((x >= b) && (y >= a))
                || ((x >= b) && (y >= c)) || ((x >= c) && (y >= b))
                || ((x >= a) && (y >= c)) || ((x >= c) && (y >= a)))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
