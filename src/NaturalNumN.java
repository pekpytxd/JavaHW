import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NaturalNumN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n:");
        String Sn = reader.readLine();
        int n = Integer.parseInt(Sn);

        // 3 in n ^ 2
        int powN = n * n;
        boolean if3InN;
        String poweredN = Integer.toString(powN);
        String three = "3";
        System.out.println(poweredN);
        if3InN = poweredN.contains(three);

        if (if3InN)
            System.out.println("Number 3 in n ^ 2");
        else
            System.out.println("Number is not in n ^ 2");

        System.out.println();
        // reverse n string
        int lengthN = Sn.length() - 1;
        char[] arrStr = Sn.toCharArray();

        System.out.println("Reversed string is: ");
        for (int i = lengthN; i >= 0; --i)
            System.out.print(arrStr[i]);

        System.out.println();
        System.out.println();
        // replace first and last
        char temp = arrStr[lengthN];
        arrStr[lengthN] = arrStr[0];
        arrStr[0] = temp;
        System.out.println("Replaced first and last symbol: ");
        System.out.println(arrStr);
        System.out.println();

        // add "1" in end and start
        System.out.println("String with added ones in start and end: ");
        System.out.println('1' + Sn + '1');

    }
}
