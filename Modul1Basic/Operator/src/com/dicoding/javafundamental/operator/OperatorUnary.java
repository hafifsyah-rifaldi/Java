public class OperatorUnary {
    public static void main(String[] args) {
        int nilaiAwal = 5;

        System.out.println("Operator Unary Plus");
        int hasil = +nilaiAwal;
        System.out.println("Hasil + 5 = " + hasil);
        System.out.println();

        System.out.println("Operator Unary Minus");
        int hasil2 = -nilaiAwal;
        System.out.println("Hasil -5 = " + hasil2);
        System.out.println();

        System.out.println("Operator Peningkatan nilai sebesar 1 point");
        int nilaiAwal2 = 5;
        nilaiAwal2++ ;
        System.out.println("Hasil 5++ = " +nilaiAwal2);
        System.out.println();

        System.out.println("Operator Pengurangan nilai sebesar 1 point");
        int nilaiAwal3= 5;
        nilaiAwal3-- ;
        System.out.println("Hasil 5-- = " +nilaiAwal3);
        System.out.println();

        System.out.println("Operator Komplemen Logika");
        boolean sukses = false; // Nilai sukses adalah false
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();
    }
}