import java.util.Scanner;

public class teks_Analyzer {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String inputTeks ="";
        while (true) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan anda : ");
            int milih = keyboard.nextInt();

            if (milih == 5) {
                System.out.println("\nKeluar dari program");
                System.out.println("....................");
                System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                break;
            }

            switch (milih){
                case 1:
                    keyboard.nextLine();
                    System.out.print("Masukkan teks: ");
                    inputTeks = keyboard.nextLine();
                    System.out.println();
                    System.out.println("Teks telah dimasukkan!");
                    break;
                case 2:
                    System.out.println("Jumlah Karakter dalam Teks : " + countCharacters(inputTeks));
                    break;
                case 3:
                    System.out.println("Jumlah Kata dalam Teks : " + countWords(inputTeks));
                    break;
                case 4:
                    System.out.print("Masukkan kata yang ingin dicari: ");
                    String searchWord = keyboard.next();
                    int jumlahMuncul = containsWord(inputTeks, searchWord);
                    System.out.println("Kata '" + searchWord + "' ditemukan sebanyak " + jumlahMuncul + " kali dalam teks.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan Coba Lagi!");
                    continue;
            }
        }
        keyboard.close();
    }

    // Metode untuk menghitung jumlah karakter dalam teks
    private static int countCharacters(String text) {
        return text.length();
    }

    // Metode untuk menghitung jumlah kata dalam teks
    private static int countWords(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        // Menggunakan split() untuk memisahkan kata-kata berdasarkan spasi
        String[] words = text.split("\\s+");
        return words.length;
    }

    // Metode untuk mencari kata dalam teks (case-insensitive)
    private static int containsWord(String text, String cariKata){
        int jumlahMuncul = 0;
        String[] kataArray = text.split("\\s+");

        for (String kata : kataArray) {
            if (kata.equalsIgnoreCase(cariKata)) {
                jumlahMuncul++;
            }
        }
        return jumlahMuncul;
    }
}

