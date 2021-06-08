import java.util.Scanner;

public class RumusBRpert4 {

    public static void main(String[] args) {

        double pi, r, t, s, pan, l;
        
        char yn = 'n';

        pi = 3.14;
        
        Scanner isi = new Scanner(System.in);
        do {
            System.out.println("Program untuk menghitung Rumus Bangun Ruang");
            System.out.println("===========================================");
            System.out.println("Pilihan  : 1. Tabung");
            System.out.println("           2. Kubus");
            System.out.println("           3. Balok");
            System.out.println("           4. Exit");
            int p = isi.nextShort();
            System.out.println("===========================================");
            
            // p == 1 , Rumus Tabung
            if (p == 1) {
                System.out.println("Jari - Jari ? ");
                r = isi.nextDouble();

                System.out.println("Tinggi ? ");
                t = isi.nextDouble();

                Double Luas = 2 * pi * r * (r + t);
                Double Volume = pi * (r * r) * t;

                System.out.println("____________________________________");
                System.out.println("Luas Permukaan Tabung = " + Luas + "cm^2");
                System.out.println("====================================");
                System.out.println("Volume Tabung = " + Volume + "cm^3");
                System.out.println("____________________________________");

            }
            
            // p == 2 , Rumus Kubus
            else if (p == 2) {
                System.out.println("Sisi ? ");
                s = isi.nextDouble();

                Double Luas = 6 * (s * s);
                Double Volume = s * s * s;

                System.out.println("____________________________________");
                System.out.println("Luas Permukaan Kubus = " + Luas + "cm^2");
                System.out.println("====================================");
                System.out.println("Volume Kubus = " + Volume + "cm^3");
                System.out.println("____________________________________");
            }
            
            // p == 3 , Rumus Balok
            else if (p == 3) {
                System.out.println("Panjang ? ");
                pan = isi.nextDouble();

                System.out.println("Lebar ? ");
                l = isi.nextDouble();

                System.out.println("Tinggi ? ");
                t = isi.nextDouble();

                Double Luas = 2 * (pan * l + pan * t + l * t);
                Double Volume = pan * l * t;

                System.out.println("____________________________________");
                System.out.println("Luas Permukaan Balok = " + Luas + "cm^2");
                System.out.println("====================================");
                System.out.println("Volume Balok = " + Volume + "cm^3");
                System.out.println("____________________________________");

            }
            // p == 3 , Exit
            else if (p == 4) {
                System.out.println("Exit Program");
                System.exit(0);
            }

            else {
                System.out.println("Pilihan hanya [ 1 - 4 ]");
            }

            // Perulangan (ingin mengulang ?)
            System.out.println("Repeat This Program ? [y / n] :"); 
            isi.nextLine();
            String yesno = isi.nextLine();
            yn = yesno.charAt(0);
        }while(yn == 'y' || yn == 'Y');
            
        isi.close();

        }
}


