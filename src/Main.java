import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik, total = 0;
        double avarage, classNumber = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz :");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            total += mat;
            classNumber++;
        }
        System.out.print("Fizik notunuzu giriniz :");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            total += fizik;
            classNumber++;
        }
        System.out.print("Türkçe notunuzu giriniz :");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            total += turkce;
            classNumber++;
        }
        System.out.print("Kimya notunuzu giriniz :");
        kimya = input.nextInt();
        if (kimya >= 0) {
            total += kimya;
            classNumber++;
        }
        System.out.print("Müzik notunuzu giriniz :");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            total += muzik;
            classNumber++;
        }

        avarage = total / classNumber;

        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }

        System.out.print("Ortalamanız : " + avarage);

    }
}