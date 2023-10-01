import java.util.Scanner;
public class PemilihanPercobaan122{
    public static void main(String[] args) {
        Scanner input22 = new Scanner (System.in);
        System.out.println("Masukkan angka:  ");
        int angka = input22.nextInt();

        String status= (angka %2 == 0) ? "genap":"ganjil";
        System.out.println("Angka "+angka+" adalah bilangan "+status);       

    }

}