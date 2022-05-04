import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("Silahkan Masukan Angka dan Operasinya");

        int a, b;
        System.out.print("");
        Scanner input1 = new Scanner(System.in);
        a = input1.nextInt();

        System.out.print("");
        Scanner input2 = new Scanner(System.in);
        b = input2.nextInt();

        System.out.print(a + "+" + b + "=");
        System.out.println(a + b);

        System.out.print(a + "-" + b + "=");
        System.out.println(a - b);

        System.out.print(a + "*" + b + "=");
        System.out.println(a * b);

        System.out.print(a + "/" + b + "=");
        System.out.println(a / b);

    }
}
