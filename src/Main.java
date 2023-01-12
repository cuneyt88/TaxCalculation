import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double tutar,kdvOran1=0.18,kdvOran2=0.08;
        Scanner input = new Scanner(System.in);

        System.out.println("Ücret tutarını giriniz: ");
        tutar=input.nextDouble();

        if(tutar<=1000 && tutar>0 ){
            System.out.println("Kdv oranı: " + kdvOran1);
            double kdvTutar=tutar*kdvOran1;
            System.out.println("Kdv tutarı: " + kdvTutar);
            double total= kdvTutar+tutar;
            System.out.println("Toplam ücret: "+total);
        }else if(tutar<=0){
            System.out.println("0'dan büyük değer girmeniz gerekmektedir!");
        } else{
            System.out.println("Kdv oranı: " + kdvOran2);
            double kdvTutar=tutar*kdvOran2;
            System.out.println("Kdv tutarı: " + kdvTutar);
            double total= kdvTutar+tutar;
            System.out.println("Toplma ücret: "+total);
        }

    }
}