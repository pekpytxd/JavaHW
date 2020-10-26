import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrickAndHole {

    static class BrickInHole {
        public double a, b, c, x, y;

        BrickInHole() {

        }

        BrickInHole(int a, int b, int c, int x, int y) {

        }

        BrickInHole(double a, double b, double c, double x, double y) {

        }

        public void setA(double a) {
            this.a = a;
        }

        public void setB(double b) {
            this.b = b;
        }

        public void setC(double c) {
            this.c = c;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        void input_values() throws IOException {
            System.out.println("Enter a, b, c, x, y");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sA, sB, sC, sX, sY;
            sA = reader.readLine();
            sB = reader.readLine();
            sC = reader.readLine();
            sX = reader.readLine();
            sY = reader.readLine();
            a = Integer.parseInt(sA);
            b = Integer.parseInt(sB);
            c = Integer.parseInt(sC);
            x = Integer.parseInt(sX);
            y = Integer.parseInt(sY);
        }

        boolean ifBrickInHole(double a, double b, double c, double x, double y) {
            return (((x >= a) && (y >= b)) || ((x >= b) && (y >= a))
                    || ((x >= b) && (y >= c)) || ((x >= c) && (y >= b))
                    || ((x >= a) && (y >= c)) || ((x >= c) && (y >= a)));

        }

        void show_res() {
            System.out.println(ifBrickInHole(a, b, c, x, y));
        }
    }
}
