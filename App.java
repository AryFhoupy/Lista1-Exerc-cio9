import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double c; // Celcius
        double f; // Fahrenheit

        System.out.println("Quantos graus você deseja transformar para Celcius?");
        f = scan.nextDouble();

        scan.close();

        c = 5 * ((f - 32) / 9);
        System.out.println(f + " graus Fahrenheit, equivalem a :" + c + " graus Celcius");

    }
}
