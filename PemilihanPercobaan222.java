import java.util.Scanner;
public class PemilihanPercobaan222 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        System.out.println("Nilai uas    : ");
        float uas = input22.nextFloat();
        System.out.println("Nilai uts    : ");
        float uts = input22.nextFloat();
        System.out.println("Nilai kuis   : ");
        float kuis = input22.nextFloat();
        System.out.println("Nilai tugas  : ");
        float tugas = input22.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = " ";
        if (total >=80 && total <100){
            message = "Nilai huruf     : A";}
        else if (total >=73 && total <80){
            message = "Nilai huruf     : B+";}
        else if (total >=65 && total <73){
            message = "Nilai huruf     : B";}
        else if (total >=60 && total <65){
            message = "Nilai huruf     : C+";}
        else if (total >=50 && total <60){
            message = "Nilai huruf     : C";}
        else if (total >= 39 && total <50){
            message = "Nilai huruf     : D";}
        else if (total <= 39){
            message = "Nilai huruf     : E";}

        System.out.println("Nilai akhir = " + total + "sehingga" + message);
        
        }
}
