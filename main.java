
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bakiye giriniz:");
        int bakiye = 1000;
        String islemler = "1.islem : bakiye ogrenme\n"+
                           "2.islem: para cekme\n"+
                           "3.islem: para yatirma\n"+
                           "q islem: ATM'den cikis";
        System.out.println("***************");
        System.out.println("islemler: " + islemler);
        System.out.println("***************");
        while (true) {
            System.out.println("islemi seciniz:");
            String islem = scanner.nextLine();
            if(islem.equals("1")){
                System.out.println("bakiyeniz: " + bakiye);
            }
            else 
                if(islem.equals("2")){
                System.out.println("tutar giriniz: ");
                int tutar =scanner.nextInt();
                scanner.nextLine();
                if(bakiye-tutar<0){
                    System.out.println("yetersiz bakiye...");
                }else{
                    bakiye-=tutar;
                
                    System.out.println("cekilen tutar: " + tutar);
                    System.out.println("kalan bakiye: "+bakiye);
                }    
            }
            else
                    if(islem.equals("3")){
                System.out.println("tutar giriniz: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                        System.out.println("yatirilan tutar: "+tutar);
                        System.out.println("kalan bakiye: "+bakiye);
            }else
                        if(islem.equals("q")){
                            System.out.println("sistemden cikiliyor...");
                            break;
                        }
            else
                            System.out.println("gecersiz islem...");
            
        }
    }
}
