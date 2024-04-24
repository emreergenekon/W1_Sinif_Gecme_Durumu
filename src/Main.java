import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int matematik, fizik, turkce, kimya, muzik;

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        //inputlar girildikten sonra yalnızca 0-100 arasında not kabul etmesi için veya kullanıldı.

        if (matematik < 0 || matematik > 100) {
            System.out.println("Hatalı not girdiniz! Lütfen 0-100 arasında bir not giriniz.");
            return;
        }

        if (fizik < 0 || fizik > 100) {
            System.out.println("Hatalı not girdiniz! Lütfen 0-100 arasında bir not giriniz.");
            return;
        }

        if (turkce < 0 || turkce > 100) {
            System.out.println("Hatalı not girdiniz! Lütfen 0-100 arasında bir not giriniz.");
            return;
        }

        if (kimya < 0 || kimya > 100) {
            System.out.println("Hatalı not girdiniz! Lütfen 0-100 arasında bir not giriniz.");
            return;
        }

        if (muzik < 0 || muzik > 100) {
            System.out.println("Hatalı not girdiniz! Lütfen 0-100 arasında bir not giriniz.");
            return;
        }

        //formül ortaya çıkarıldı. 55'ten büyük ve küçük olan ortalamada response verecek şekilde hazırlandı.

        double avarage = (matematik + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız, artık seneye görüşürüz! ");


        } else
            System.out.println("Tebrikler sınıfı geçtiniz!");
        System.out.println("Ortalamanız: " + avarage);


    }
}