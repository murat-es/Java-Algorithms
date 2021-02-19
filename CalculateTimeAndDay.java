import java.util.Scanner;

public class CalculateTimeAndDay {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("To calculate for hours --> 1\n" +
                "To calculate for days --> 2");
        int islem=input.nextInt();
        if (islem==2) {
            System.out.print("Bugün haftanın kaçıncı günü? ");
            int bugun = input.nextInt();
            while (1 > bugun || bugun > 7) {
                System.err.print("Lütfen 1'den 7'ye kadar bir değer giriniz.(örn:pazartesi için 1) ");
                bugun = input.nextInt();
            }
            System.out.print("Kaç gün sonraki günü merak ediyorsun? ");
            int x = input.nextInt();

            String[] gunler = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};

            int a = x % 7;
            bugun = (bugun + a) % 7;

            System.out.println(x + " gün sonra günlerden " + gunler[bugun]);
        }
        else if (islem==1){
            System.out.println("Şu anda saat kaç?");
            System.out.print("Saati giriniz : ");
            int saat=input.nextInt();
            System.out.print("Dakikayı giriniz : ");
            int dakika=input.nextInt();

            System.out.print("Kaç dakika sonrayı hesaplamak istersiniz? ");
            int hesapla=input.nextInt();

            saat+=hesapla/60;
            dakika+=hesapla%60;

            if (dakika>59){
                saat+=1;
                dakika=dakika-60;
            }
            if (saat>23){
                saat=saat%24;
            }
            System.out.println(hesapla+" dakika sonra saat "+saat+":"+dakika);
        }
        else {
            System.err.println("Geçersiz sayı girdiniz.");
            System.out.println("Programdan çıkılıyor...");
        }
    }
}
