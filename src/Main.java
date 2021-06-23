import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        n1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2=input.nextInt();

        System.out.println("1:Toplama\n"+"2:Çıkarma\n"+"3:Çarpma\n"+"4:Bölme\n");
        System.out.print("Seçiminiz: ");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplama: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma: "+ (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma: "+ (n1*n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Bir sayı sıfıra bölünemez");
                        break;
                    default:
                        System.out.println("Bölme: "+ (n1/n2));
                        break;
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.Tekrar Deneyiniz.");
        }
    }
}
