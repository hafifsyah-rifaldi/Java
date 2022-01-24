public class MyString {
public static void main(String[] args) {
    char[] dicodingChars = {'d','i','c','o','d','i','n','g'};
    String dicodingString = new String(dicodingChars);
    System.out.println(dicodingString);


    /* Mengetahui Panjang String */
    String dicoding = "dicoding";
    int length = dicoding.length();
    System.out.println(length);

    /* Mengambil Karakter dari Sebuah String */
    char result = dicoding.charAt(6);
    System.out.println(result);
}    
}