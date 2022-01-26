import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Penjumlahan sangat sederhana");
        System.out.println("Masukkan Angka Pertama: ");
        int value = scanner.nextInt();
        System.out.println("Masukan Angka Kedua; ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasil adalah : " + result);
        

        scanner.close();
    }
}