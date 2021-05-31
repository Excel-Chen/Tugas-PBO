import java.util.Scanner;

public class RumusTabung {

    public static void main(String[] args) {
        double pi, r, t ;
        pi = 3.14;
        
        Scanner Input = new Scanner(System.in);

        System.out.println("Program untuk menghitung Luas.P dan Volume Tabung");
        System.out.println("Jari - Jari ? ");
        r = Input.nextDouble();

        System.out.println("Tinggi ? ");
        t = Input.nextDouble();

        Double Luas = 2 * pi * r * (r + t);
        Double Volume = pi * (r * r) * t;

        System.out.println("Luas Permukaan Tabung = " + Luas + "cm^2");
        System.out.println("Volume Tabung = " + Volume + "cm^3");

        Input.close();
    }
}
