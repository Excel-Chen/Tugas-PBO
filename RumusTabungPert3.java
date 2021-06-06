import java.util.Scanner;

public class RumusTabungPert3 {

    public static void main(String[] args) {

        double pi, r, t ;
        
        char yn = 'n';

        pi = 3.14;
        
        Scanner isi = new Scanner(System.in);
        do {
            System.out.println("Program untuk menghitung Luas.P dan Volume Tabung");
            System.out.println("=================================================");
            System.out.println("Pilihan  : 1. Luas Permukaan Tabung");
            System.out.println("           2. Volume Tabung");
            System.out.println("           3. Exit");
            int p = isi.nextShort();
            System.out.println("=================================================");
            
            // p == 1 , Luas permukaan Tabung
            if (p == 1) {
                System.out.println("Jari - Jari ? ");
                r = isi.nextDouble();

                System.out.println("Tinggi ? ");
                t = isi.nextDouble();

                Double Luas = 2 * pi * r * (r + t);
                System.out.println("=======================");
                System.out.println("Luas Permukaan Tabung = " + Luas + "cm^2");
                System.out.println("=======================");
            }
            
            // p == 2 , Hitung volume Tabung
            else if (p == 2) {
                System.out.println("Jari - Jari ? ");
                r = isi.nextDouble();

                System.out.println("Tinggi ? ");
                t = isi.nextDouble();

                Double Volume = pi * (r * r) * t;

                System.out.println("===============");
                System.out.println("Volume Tabung = " + Volume + "cm^3");
                System.out.println("================");
            }
            
            // p == 3 , Exit
            else if (p == 3) {
                System.out.println("Exit Program");
                System.exit(0);
            }

            else {
                System.out.println("Pilihan hanya [ 1 - 3 ]");
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


