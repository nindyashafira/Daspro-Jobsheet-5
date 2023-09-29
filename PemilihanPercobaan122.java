import java.util.Scanner;
public class PemilihanPercobaan122{
    public static void main(String[] args) {
        Scanner input21 = new Scanner (System.in);
        System.out.println("Masukkan angka:  ");
        int angka = input21.nextInt();

        String status= (angka %2 == 0) ? "genap":"ganjil";
        System.out.println("Angka "+angka+" adalah bilangan "+status);       

    }

}