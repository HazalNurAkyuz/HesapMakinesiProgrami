import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, secim;
        System.out.print("Birinci Sayiyi Giriniz :");
        sayi1 = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz :");
        sayi2 = input.nextInt();
        System.out.print("\nLutfen Yapmak Istediginiz Islemi Seciniz");
        System.out.println("\n1-Toplama \n2-Cikarma \n3-Carpma \n4-Bolme");
        System.out.print("Seciminiz :");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.print("Sonuc :" + (sayi1 + sayi2));
                break;
            case 2:
                System.out.print("Sonuc :" + (sayi1 - sayi2));
                break;
            case 3:
                System.out.print("Sonuc :" + (sayi1 * sayi2));
                break;
            case 4:
                System.out.print("Sonuc :" + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Gecersiz Bir Islem Girdiniz!");
        }
    }
}