import java.util.Scanner;
public class Tugas1Flowchart22 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        int jarak;

        System.out.println("Masukkan jarak: ");
        jarak = input22.nextInt();
        if(jarak<+5){
            System.out.println("Ini adalah pertarungan jenis Close Combat");
        }else if (jarak>5){
            System.out.println("Ini adalah pertarungan jenis Ranged Weapon");
        }else {}
    }
}