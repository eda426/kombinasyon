import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int nFak=1,rFak=1,faktoriyel=1;
        Scanner input=new Scanner(System.in);
        System.out.println("eleman sayısı(N) degerini giriniz:");
        int n= input.nextInt();
        for (int i=1;i<=n;i++)//n faktöriyelini hesapladık
        {
            nFak*=i;
        }

        System.out.println("secim sayısı(R) değerini giriniz:");
        int r=input.nextInt();
        for (int k=1;k<=r;k++ )//r faktöriyelni hesapladık
        {
            rFak*=k;
        }

        for (int f=1;f<=n-r;f++)
        {
            faktoriyel*=f;
        }
        System.out.println(faktoriyel);
        /*double com=(double) nFak/(rFak*faktoriyel);//kombinasyn hesabı
        System.out.println("kombinasyon:"+com);*/



    }
}