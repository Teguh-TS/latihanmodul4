import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        while (true) {
            System.out.println(" === Calculator === ");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma ");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5) : ");
            int pilih = input.nextInt();

            if (pilih == 5) {
                System.out.println("....................");
                System.out.println("Keluar dari program.");
                break;
            }

            double result = 0;

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan angka: ");
                    double sqrtNumber = input.nextDouble();
                    result = akarKuadrat(sqrtNumber);
                    System.out.println("Hasil akar kuadrat dari " +sqrtNumber+ " adalah " +result);
                    break;
                case 2:
                    System.out.print("Masukkan angka: ");
                    double angka = input.nextDouble();
                    System.out.print("Masukkan pangkat: ");
                    double exponent = input.nextDouble();
                    result = pangkat(angka, exponent);
                    System.out.println(angka+ " pangkat " +exponent+ " adalah " +result);
                    break;
                case 3:
                    System.out.print("Masukkan angka: ");
                    double logNumber = input.nextDouble();
                    result = log(logNumber);
                    System.out.println("Logaritma Natural dari " +logNumber+ " adalah " +result);
                    break;
                case 4:
                    System.out.print("Masukkan angka: ");
                    int factorialNumber = input.nextInt();
                    result = factorial(factorialNumber);
                    System.out.println("Faktorial dari " +factorialNumber+ " adalah " +result);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    continue;
            }
        }
        input.close();
    }

    private static double akarKuadrat(double number) {
        return Math.sqrt(number);
    }

    private static double pangkat(double angka, double exponent) {
        return Math.pow(angka, exponent);
    }

    private static double log(double number) {
        return Math.log(number);
    }

    private static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
