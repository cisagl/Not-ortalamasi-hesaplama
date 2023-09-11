import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        System.out.println("NOT DEĞERLENDİRME EKRANI");

        int mat, fizik, kimya, trk, trh, mzk;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        trk = inp.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        trh = inp.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        mzk = inp.nextInt();

        int nottoplami = mat + fizik + kimya + trk + trh + mzk;
        int sonuc = nottoplami / 6;
        System.out.println("Not ortalamanız: " + sonuc);

        String str = (sonuc >= 60) ? "Tebrikler, sınıfı başarıyla geçtiniz" : "Gerekli not ortalaması 60, sınıf tekrarı yapılacak";
        System.out.println(str);
    }
}