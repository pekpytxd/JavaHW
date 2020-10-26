import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NaturalNumN {

    static class NumN {
        public int n;

        NumN() {

        }

        NumN(int n) {

        }

        public void setN(int n) {
            this.n = n;
        }

        public int getN() {
            return this.n;
        }

        void enter_N() throws IOException {
            System.out.println("Enter n:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String Sn = reader.readLine();
            this.n = Integer.parseInt(Sn);

        }

        private boolean three_in_powN(int n) {
            n = n * n;
            String powN = Integer.toString(n);
            return (powN.contains("3"));

        }

        private String reverse(int n) {
            StringBuilder newStr = new StringBuilder();
            String nStr = Integer.toString(n);
            char[] nToChar = nStr.toCharArray();
            for (int i = nToChar.length - 1; i >= 0; --i) {
                newStr.append(nToChar[i]);
            }
            return newStr.toString();
        }

        private String replace_last_first(int n) {
            String replacedStr = "";
            String nStr = Integer.toString(n);
            char[] nToChar = nStr.toCharArray();
            char temp = nToChar[nToChar.length - 1];
            nToChar[nToChar.length - 1] = nToChar[0];
            nToChar[0] = temp;
            for (int i = 0; i < nToChar.length; ++i) {
                replacedStr += nToChar[i];
            }
            return replacedStr;
        }

        private String add_ones(int n) {
            String Sn = Integer.toString(n);
            return "1" + Sn + "1";
        }

        void show_reversed() {
            System.out.println(reverse(this.n));
        }

        void show_3_in_powN() {
            System.out.println(three_in_powN(this.n));
        }

        void show_replaced() {
            System.out.println(replace_last_first(this.n));
        }

        void show_with_ones() {
            System.out.println(add_ones(this.n));
        }

    }
}
