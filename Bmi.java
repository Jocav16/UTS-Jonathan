import java.util.Scanner;
public class Bmi {

    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        int jk;
        float berat,tinggi,bmi, meter;
        
        System.out.println("PROGRAM PERHITUNGAN BMI");
        System.out.println("Masukkan Jenis Kelamin (1.laki laki) l ( 2.perempuan) :");
        jk = masukan.nextInt ();
        System.out.println("masukkan Berat Badan :");
        berat = masukan.nextFloat();
        System.out.println("Masukkan Tinggi Badan :");
        tinggi = masukan.nextFloat();

        meter=tinggi/100;
        bmi=(berat/(meter*meter));

        System.out.println("...................");
        System.out.println("BMI : "+bmi+" ");

if(bmi <18.5) {
    System.out.println("KURUS");
}
else if(bmi <=22.9) {
    System.out.println("Normal");
}
else if(bmi <24.9) {
    System.out.println("KELEBIHAN BERAT BADAN");
}
else{
    System.out.println("OBESITAS");
}       
    }
}